using System;
using System.Threading.Tasks;
using Grpc.Core;
using GrpcProtos;
using static GrpcProtos.Calculator;

namespace DotNetServer
{
    class Program
    {
        class CalculatorImpl : CalculatorBase
        {
            public override Task<Result> Sum(Pair request, ServerCallContext context)
            {
                return Task.FromResult(new Result { Value = request.Number1 + request.Number2 });
            }
        }

        static void Main(string[] args)
        {
            Server server = new Server
            {
                Services = {
                    Calculator.BindService(new CalculatorImpl())
                },
                Ports = { new ServerPort("localhost", 7777, ServerCredentials.Insecure) }
            };
            server.Start();
            Console.WriteLine("Iniciou server em localhost:7777");
            Console.WriteLine("Pressione qualquer tecla para fechar o server");
            Console.ReadKey();

            server.ShutdownAsync().Wait();
        }
    }
}
