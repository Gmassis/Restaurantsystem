package grpc.ca.preorder;

import java.util.concurrent.TimeUnit;

import grpc.ca.preorder.PreOrderGrpc.PreOrderBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class PreOrderClient {

	public static void main(String[] args) {

		String host = "local host";
		int port = 50037;

		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

		PreOrderBlockingStub blockingstub = PreOrderGrpc.newBlockingStub(channel);

		try {

			MenuRequest request = MenuRequest.newBuilder().setRequest("What is the menu today").build();

			MenuReply reply = blockingstub.menu(request);

			System.out.println("Messsage sent by the server" + reply.getCheeseburger());
		} catch (StatusRuntimeException e) {
			e.getStatus();
		} finally {
			try {
				channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
