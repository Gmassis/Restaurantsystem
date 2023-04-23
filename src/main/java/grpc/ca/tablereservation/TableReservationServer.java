package grpc.ca.tablereservation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import grpc.ca.tablereservation.TableReservationGrpc.TableReservationImplBase;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

public class TableReservationServer extends TableReservationImplBase {

	FileInputStream in = null;
    FileOutputStream out = null;
	
	public static void main(String[] args) {
		
		
		
		TableReservationServer reservationserver = new TableReservationServer();
		int port = 50038;

		Server server;
		try {
			server = ServerBuilder.forPort(port).addService(reservationserver).build().start();
			System.out.println("ServerStarted");
			server.awaitTermination();

		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void tableReserve(ReserveRequest request, StreamObserver<ReserveReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("---Receiving Table Reserver Request from client---");
		
		//in = new FileInputStream("input.txt");
        //out = new FileOutputStream("output.txt");
		
		ReserveReply reply = ReserveReply.newBuilder().setResID(0).setMessage("Reservation sucessfull").build();
		
		
		//out.write(request.getDay().t);
		
			
		
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
		
	}
	
	
	@Override
	public void tableCancel(CancelRequest request, StreamObserver<CancelReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("---Receiving Table Reserver Request from client---");
		
		CancelReply reply = CancelReply.newBuilder().setMessage("Cancelation sucessfull").build();
		
		responseObserver.onNext(reply);
		responseObserver.onCompleted();
		
	}

	@Override
	public void tableCheck(CheckRequest request, StreamObserver<CheckReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("---Receiving Table Reserver Request from client---");
		
		CheckReply reply = CheckReply.newBuilder().setMessage("Those are your reservation details:").build();
		

		responseObserver.onNext(reply);
		responseObserver.onCompleted();
		
	}
}
