package grpc.ca.review;

import java.util.concurrent.TimeUnit;

import grpc.ca.review.ReviewGrpc.ReviewBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class ReviewClient{

	public static void main(String[] args) {

		String host = "local host";
		int port = 50038;

		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

		ReviewBlockingStub blockingstub = ReviewGrpc.newBlockingStub(channel);

		try {

			WriteRequest request = WriteRequest.newBuilder().setName("Guilherme").build();

			WriteReply reply = blockingstub.write(request);

			System.out.println("Messsage sent by the server");
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
