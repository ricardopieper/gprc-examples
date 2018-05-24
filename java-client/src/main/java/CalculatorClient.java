import GrpcProtos.CalculatorGrpc;
import GrpcProtos.SumService;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.TimeUnit;

public class CalculatorClient {

    private final ManagedChannel managedChannel;
    private final CalculatorGrpc.CalculatorBlockingStub blockingCall;

    public CalculatorClient(String host, int port) {
        ManagedChannelBuilder builder = ManagedChannelBuilder.forAddress(host, port).usePlaintext(true);
        managedChannel = builder.build();
        blockingCall = CalculatorGrpc.newBlockingStub(managedChannel);
    }

    public int sum(int x, int y) {
        SumService.Pair pair = SumService.Pair.newBuilder().setNumber1(x).setNumber2(y).build();
        return blockingCall.sum(pair).getValue();
    }

    public void shutdown() throws InterruptedException {
        managedChannel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public static void main(String[] args) throws InterruptedException {
        CalculatorClient client = new CalculatorClient("localhost", 7777);
        try {
            int result = client.sum(333, 444);
            System.out.println("Result: " + result);
        } finally {
            client.shutdown();
        }
    }
}
