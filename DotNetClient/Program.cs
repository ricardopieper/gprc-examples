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
            AsyncTest();
        }

        private static void AsyncTest()
        {
            int calls = 0;
            Channel channel = new Channel("127.0.0.1:7777", ChannelCredentials.Insecure);
            var client = new Calculator.CalculatorClient(channel);

            new Thread(() =>
            {
                while (true)
                {
                    Console.WriteLine(calls);
                    Thread.Sleep(1000);
                }
            }).Start();

            Enumerable.Range(0, 100000).AsParallel().ForAll(x =>
            {
                Result result = client.Sum(new Pair { Number1 = 84, Number2 = 9997 });
                Interlocked.Increment(ref calls);
            });

            Console.ReadKey();
            channel.ShutdownAsync().Wait();
        }

        private static void SyncTest()
        {
            int calls = 0;
            Channel channel = new Channel("127.0.0.1:7777", ChannelCredentials.Insecure);
            var client = new Calculator.CalculatorClient(channel);
            Task.Run(() =>
            {
                for (int i = 0; i < 100000; i++)
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

            Console.ReadKey();
            channel.ShutdownAsync().Wait();
        }
    }
}
