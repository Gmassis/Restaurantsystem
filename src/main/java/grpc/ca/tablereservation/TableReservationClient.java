package grpc.ca.tablereservation;

import java.util.concurrent.TimeUnit;

import grpc.ca.tablereservation.TableReservationGrpc.TableReservationBlockingStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

public class TableReservationClient {

	public static void main(String[] args) {

		String host = "local host";
		int port = 50037;

		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

		TableReservationBlockingStub blockingstub = TableReservationGrpc.newBlockingStub(channel);

		try {

			ReserveRequest request = ReserveRequest.newBuilder().setName(null).build();

			ReserveReply reply = blockingstub.tableReserve(request);

			System.out.println("Messsage sent by the server" + reply.getMessage());
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