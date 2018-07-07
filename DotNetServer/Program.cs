using System;
using System.Threading.Tasks;
using Grpc.Core;
using GrpcProtos;
using System.Linq;
using static GrpcProtos.Calculator;
using System.Threading;
using System.Collections.Generic;

namespace DotNetServer
{
    class Program
    {
        class CalculatorImpl : CalculatorBase
        {
            private Queue<Pair> requests = new Queue<Pair>();

            public override Task<Result> Sum(Pair request, ServerCallContext context)
            {
                return Task.FromResult(new Result { Value = request.Number1 + request.Number2 });
            }
          
        }
        static ManualResetEvent _quitEvent = new ManualResetEvent(false);

        static void Main(string[] args)
        {
            Console.CancelKeyPress += (sender, eArgs) =>
            {
                _quitEvent.Set();
                eArgs.Cancel = true;
            };

            try
            {
                Server server = new Server
                {
                    Services = {
                        Calculator.BindService(new CalculatorImpl())
                    },
                    Ports = { new ServerPort("0.0.0.0", 7777, ServerCredentials.Insecure) }
                };

                server.Start();
                Console.WriteLine("Iniciou server em localhost:7777");
                Console.WriteLine("Pressione qualquer tecla para fechar o server");

                _quitEvent.WaitOne();

                server.ShutdownAsync().Wait();
            }
            catch (Exception ex)
            {
                Console.WriteLine("Finalizou com erro " + ex.ToString());
            }
        }
    }
}
