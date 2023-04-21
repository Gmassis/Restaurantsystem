package grpc.ca.review;

import java.io.IOException;

import grpc.ca.review.ReviewGrpc.ReviewImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class ReviewServer extends ReviewImplBase {
	
	public static void main(String[] args) {
		
		ReviewServer reviewserver = new ReviewServer();
		int port = 50051;

		Server server;
		try {
			server = ServerBuilder.forPort(port).addService(reviewserver).build().start();
			server.awaitTermination();

		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
