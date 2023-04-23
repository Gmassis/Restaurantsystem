package grpc.ca.preorder;

import grpc.ca.preorder.PreOrderGrpc.PreOrderImplBase;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class PreOrderServer extends PreOrderImplBase{

	public static void main(String[] args) {
		
		PreOrderServer orderserver = new PreOrderServer();
		int port = 50037;

		Server server;
		try {
			server = ServerBuilder.forPort(port).addService(orderserver).build().start();
			System.out.println("Pre Order Server Started");
			server.awaitTermination();

		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void menu(MenuRequest request, StreamObserver<MenuReply> responseObserver) {
		// TODO Auto-generated method stub
	
		
		MenuReply reply = MenuReply.newBuilder().setCheeseburger("0").build();
		
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	
	}

	@Override
	public void order(OrderRequest request, StreamObserver<OrderReply> responseObserver) {
		// TODO Auto-generated method stub
		
		OrderReply reply = OrderReply.newBuilder().setMessage("Itens Sucessfully ordered").build();
		
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
		
	}

	@Override
	public void status(StatusRequest request, StreamObserver<StatusReply> responseObserver) {
		// TODO Auto-generated method stub
		
		StatusReply reply = StatusReply.newBuilder().setStatus("Order Ready").build();
		
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
	}
}
