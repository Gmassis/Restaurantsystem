package grpc.ca.review;

import java.io.IOException;
import grpc.ca.review.ReviewGrpc.ReviewImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class ReviewServer extends ReviewImplBase {
	
	public static void main(String[] args) {
		
		ReviewServer reviewserver = new ReviewServer();
		int port = 50037;

		Server server;
		try {
			server = ServerBuilder.forPort(port).addService(reviewserver).build().start();
			System.out.println("ServerStarted");
			server.awaitTermination();

		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public StreamObserver<WriteRequest> write(StreamObserver<WriteReply> responseObserver) {
		
		return new StreamObserver<WriteRequest>() {

			@Override
			public void onNext(WriteRequest value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				
			}};
		
		// TODO Auto-generated method stub

	
	
	}

	@Override
	public StreamObserver<EditRequest> edit(StreamObserver<EditReply> responseObserver) {
		// TODO Auto-generated method stub
		
		return new StreamObserver<EditRequest>() {

			@Override
			public void onNext(EditRequest value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				
			}};
		
	}

	@Override
	public StreamObserver<ChatRequest> chat(StreamObserver<ChatReply> responseObserver) {
		// TODO Auto-generated method stub
		
		return new StreamObserver<ChatRequest>() {

			@Override
			public void onNext(ChatRequest value) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onError(Throwable t) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onCompleted() {
				// TODO Auto-generated method stub
				
			}};
		
	}





}
