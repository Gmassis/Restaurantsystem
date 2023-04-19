package grpc.ca.tablereservation;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *Service 1 - Definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: tablereservation.proto")
public final class TableReservationGrpc {

  private TableReservationGrpc() {}

  public static final String SERVICE_NAME = "tablereservation.TableReservation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.ca.tablereservation.ReserveRequest,
      grpc.ca.tablereservation.ReserveReply> getTableReserveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TableReserve",
      requestType = grpc.ca.tablereservation.ReserveRequest.class,
      responseType = grpc.ca.tablereservation.ReserveReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.ca.tablereservation.ReserveRequest,
      grpc.ca.tablereservation.ReserveReply> getTableReserveMethod() {
    io.grpc.MethodDescriptor<grpc.ca.tablereservation.ReserveRequest, grpc.ca.tablereservation.ReserveReply> getTableReserveMethod;
    if ((getTableReserveMethod = TableReservationGrpc.getTableReserveMethod) == null) {
      synchronized (TableReservationGrpc.class) {
        if ((getTableReserveMethod = TableReservationGrpc.getTableReserveMethod) == null) {
          TableReservationGrpc.getTableReserveMethod = getTableReserveMethod = 
              io.grpc.MethodDescriptor.<grpc.ca.tablereservation.ReserveRequest, grpc.ca.tablereservation.ReserveReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tablereservation.TableReservation", "TableReserve"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.tablereservation.ReserveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.tablereservation.ReserveReply.getDefaultInstance()))
                  .setSchemaDescriptor(new TableReservationMethodDescriptorSupplier("TableReserve"))
                  .build();
          }
        }
     }
     return getTableReserveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.ca.tablereservation.CancelRequest,
      grpc.ca.tablereservation.CancelReply> getTableCancelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TableCancel",
      requestType = grpc.ca.tablereservation.CancelRequest.class,
      responseType = grpc.ca.tablereservation.CancelReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.ca.tablereservation.CancelRequest,
      grpc.ca.tablereservation.CancelReply> getTableCancelMethod() {
    io.grpc.MethodDescriptor<grpc.ca.tablereservation.CancelRequest, grpc.ca.tablereservation.CancelReply> getTableCancelMethod;
    if ((getTableCancelMethod = TableReservationGrpc.getTableCancelMethod) == null) {
      synchronized (TableReservationGrpc.class) {
        if ((getTableCancelMethod = TableReservationGrpc.getTableCancelMethod) == null) {
          TableReservationGrpc.getTableCancelMethod = getTableCancelMethod = 
              io.grpc.MethodDescriptor.<grpc.ca.tablereservation.CancelRequest, grpc.ca.tablereservation.CancelReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tablereservation.TableReservation", "TableCancel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.tablereservation.CancelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.tablereservation.CancelReply.getDefaultInstance()))
                  .setSchemaDescriptor(new TableReservationMethodDescriptorSupplier("TableCancel"))
                  .build();
          }
        }
     }
     return getTableCancelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.ca.tablereservation.CheckRequest,
      grpc.ca.tablereservation.CheckReply> getTableCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TableCheck",
      requestType = grpc.ca.tablereservation.CheckRequest.class,
      responseType = grpc.ca.tablereservation.CheckReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.ca.tablereservation.CheckRequest,
      grpc.ca.tablereservation.CheckReply> getTableCheckMethod() {
    io.grpc.MethodDescriptor<grpc.ca.tablereservation.CheckRequest, grpc.ca.tablereservation.CheckReply> getTableCheckMethod;
    if ((getTableCheckMethod = TableReservationGrpc.getTableCheckMethod) == null) {
      synchronized (TableReservationGrpc.class) {
        if ((getTableCheckMethod = TableReservationGrpc.getTableCheckMethod) == null) {
          TableReservationGrpc.getTableCheckMethod = getTableCheckMethod = 
              io.grpc.MethodDescriptor.<grpc.ca.tablereservation.CheckRequest, grpc.ca.tablereservation.CheckReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "tablereservation.TableReservation", "TableCheck"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.tablereservation.CheckRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.tablereservation.CheckReply.getDefaultInstance()))
                  .setSchemaDescriptor(new TableReservationMethodDescriptorSupplier("TableCheck"))
                  .build();
          }
        }
     }
     return getTableCheckMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TableReservationStub newStub(io.grpc.Channel channel) {
    return new TableReservationStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TableReservationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new TableReservationBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TableReservationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new TableReservationFutureStub(channel);
  }

  /**
   * <pre>
   *Service 1 - Definition
   * </pre>
   */
  public static abstract class TableReservationImplBase implements io.grpc.BindableService {

    /**
     */
    public void tableReserve(grpc.ca.tablereservation.ReserveRequest request,
        io.grpc.stub.StreamObserver<grpc.ca.tablereservation.ReserveReply> responseObserver) {
      asyncUnimplementedUnaryCall(getTableReserveMethod(), responseObserver);
    }

    /**
     */
    public void tableCancel(grpc.ca.tablereservation.CancelRequest request,
        io.grpc.stub.StreamObserver<grpc.ca.tablereservation.CancelReply> responseObserver) {
      asyncUnimplementedUnaryCall(getTableCancelMethod(), responseObserver);
    }

    /**
     */
    public void tableCheck(grpc.ca.tablereservation.CheckRequest request,
        io.grpc.stub.StreamObserver<grpc.ca.tablereservation.CheckReply> responseObserver) {
      asyncUnimplementedUnaryCall(getTableCheckMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTableReserveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.ca.tablereservation.ReserveRequest,
                grpc.ca.tablereservation.ReserveReply>(
                  this, METHODID_TABLE_RESERVE)))
          .addMethod(
            getTableCancelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.ca.tablereservation.CancelRequest,
                grpc.ca.tablereservation.CancelReply>(
                  this, METHODID_TABLE_CANCEL)))
          .addMethod(
            getTableCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.ca.tablereservation.CheckRequest,
                grpc.ca.tablereservation.CheckReply>(
                  this, METHODID_TABLE_CHECK)))
          .build();
    }
  }

  /**
   * <pre>
   *Service 1 - Definition
   * </pre>
   */
  public static final class TableReservationStub extends io.grpc.stub.AbstractStub<TableReservationStub> {
    private TableReservationStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TableReservationStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableReservationStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TableReservationStub(channel, callOptions);
    }

    /**
     */
    public void tableReserve(grpc.ca.tablereservation.ReserveRequest request,
        io.grpc.stub.StreamObserver<grpc.ca.tablereservation.ReserveReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTableReserveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tableCancel(grpc.ca.tablereservation.CancelRequest request,
        io.grpc.stub.StreamObserver<grpc.ca.tablereservation.CancelReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTableCancelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tableCheck(grpc.ca.tablereservation.CheckRequest request,
        io.grpc.stub.StreamObserver<grpc.ca.tablereservation.CheckReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTableCheckMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Service 1 - Definition
   * </pre>
   */
  public static final class TableReservationBlockingStub extends io.grpc.stub.AbstractStub<TableReservationBlockingStub> {
    private TableReservationBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TableReservationBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableReservationBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TableReservationBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.ca.tablereservation.ReserveReply tableReserve(grpc.ca.tablereservation.ReserveRequest request) {
      return blockingUnaryCall(
          getChannel(), getTableReserveMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.ca.tablereservation.CancelReply tableCancel(grpc.ca.tablereservation.CancelRequest request) {
      return blockingUnaryCall(
          getChannel(), getTableCancelMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.ca.tablereservation.CheckReply tableCheck(grpc.ca.tablereservation.CheckRequest request) {
      return blockingUnaryCall(
          getChannel(), getTableCheckMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service 1 - Definition
   * </pre>
   */
  public static final class TableReservationFutureStub extends io.grpc.stub.AbstractStub<TableReservationFutureStub> {
    private TableReservationFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private TableReservationFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableReservationFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new TableReservationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ca.tablereservation.ReserveReply> tableReserve(
        grpc.ca.tablereservation.ReserveRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTableReserveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ca.tablereservation.CancelReply> tableCancel(
        grpc.ca.tablereservation.CancelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTableCancelMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ca.tablereservation.CheckReply> tableCheck(
        grpc.ca.tablereservation.CheckRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTableCheckMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TABLE_RESERVE = 0;
  private static final int METHODID_TABLE_CANCEL = 1;
  private static final int METHODID_TABLE_CHECK = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TableReservationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TableReservationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TABLE_RESERVE:
          serviceImpl.tableReserve((grpc.ca.tablereservation.ReserveRequest) request,
              (io.grpc.stub.StreamObserver<grpc.ca.tablereservation.ReserveReply>) responseObserver);
          break;
        case METHODID_TABLE_CANCEL:
          serviceImpl.tableCancel((grpc.ca.tablereservation.CancelRequest) request,
              (io.grpc.stub.StreamObserver<grpc.ca.tablereservation.CancelReply>) responseObserver);
          break;
        case METHODID_TABLE_CHECK:
          serviceImpl.tableCheck((grpc.ca.tablereservation.CheckRequest) request,
              (io.grpc.stub.StreamObserver<grpc.ca.tablereservation.CheckReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TableReservationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TableReservationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.ca.tablereservation.TableReservationImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TableReservation");
    }
  }

  private static final class TableReservationFileDescriptorSupplier
      extends TableReservationBaseDescriptorSupplier {
    TableReservationFileDescriptorSupplier() {}
  }

  private static final class TableReservationMethodDescriptorSupplier
      extends TableReservationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TableReservationMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TableReservationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TableReservationFileDescriptorSupplier())
              .addMethod(getTableReserveMethod())
              .addMethod(getTableCancelMethod())
              .addMethod(getTableCheckMethod())
              .build();
        }
      }
    }
    return result;
  }
}
