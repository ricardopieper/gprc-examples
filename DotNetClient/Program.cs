using Grpc.Core;
using GrpcProtos;
using System;
using System.Linq;
using System.Threading;
using System.Threading.Tasks;

namespace DotNetClient
{
    class Program
    {
        static void Main(string[] args)
        {
            var channels = Enumerable.Range(0, 100)
                .Select(x => new Channel("localhost:7777", ChannelCredentials.Insecure)).ToArray();
          
            AsyncMultichannelTest(channels);
        }

        private static void AsyncTest(Channel channel)
        {
            int calls = 0;
            var client = new Calculator.CalculatorClient(channel);

            new Thread(() =>
            {
                while (true)
                {
                    Console.WriteLine(calls);
                    Thread.Sleep(1000);
                }
            }).Start();

            Parallel.ForEach(Enumerable.Range(0, 1000000),
                new ParallelOptions { MaxDegreeOfParallelism = 1 },
                x =>
                {
                    Result result = client.Sum(new Pair { Number1 = 84, Number2 = 9997 });
                    Interlocked.Increment(ref calls);
                });

            Console.Read();
            channel.ShutdownAsync().Wait();
        }


        private static void AsyncMultichannelTest(Channel[] channels)
        {
            Random random = new Random();
            int calls = 0;
            var clients = channels.Select(x => new Calculator.CalculatorClient(x)).ToArray();

            new Thread(() =>
            {
                while (true)
                {
                    Console.WriteLine(calls);
                    Thread.Sleep(1000);
                }
            }).Start();

            Parallel.ForEach(Enumerable.Range(0, 1000000),
                new ParallelOptions { MaxDegreeOfParallelism = 1 },
                x =>
                {
                    Calculator.CalculatorClient client = clients[random.Next(0, channels.Length)];
                    Result result = client.Sum(new Pair { Number1 = 84, Number2 = 9997 });
                    Interlocked.Increment(ref calls);
                });

            Console.Read();
            foreach (var channel in channels)
            {
                channel.ShutdownAsync().Wait();
            }
        }

        private static void SyncTest(Channel channel)
        {
            int calls = 0;
            var client = new Calculator.CalculatorClient(channel);
            Task.Run(() =>
            {
                for (int i = 0; i < 1000000; i++)
                {
                    Result result = client.Sum(new Pair { Number1 = 84, Number2 = 9997 });
                    calls++;
                }
            });

            Task.Run(async () =>
            {
                while (true)
                {
                    Console.WriteLine(calls);
                    await Task.Delay(1000);
                }

            });

            Console.Read();
            channel.ShutdownAsync().Wait();
        }
    }
}
