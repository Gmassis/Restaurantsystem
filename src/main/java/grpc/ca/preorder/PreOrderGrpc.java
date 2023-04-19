package grpc.ca.preorder;

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
 *Service 2 - Definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: preorder.proto")
public final class PreOrderGrpc {

  private PreOrderGrpc() {}

  public static final String SERVICE_NAME = "preorder.PreOrder";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.ca.preorder.MenuRequest,
      grpc.ca.preorder.MenuReply> getMenuMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Menu",
      requestType = grpc.ca.preorder.MenuRequest.class,
      responseType = grpc.ca.preorder.MenuReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.ca.preorder.MenuRequest,
      grpc.ca.preorder.MenuReply> getMenuMethod() {
    io.grpc.MethodDescriptor<grpc.ca.preorder.MenuRequest, grpc.ca.preorder.MenuReply> getMenuMethod;
    if ((getMenuMethod = PreOrderGrpc.getMenuMethod) == null) {
      synchronized (PreOrderGrpc.class) {
        if ((getMenuMethod = PreOrderGrpc.getMenuMethod) == null) {
          PreOrderGrpc.getMenuMethod = getMenuMethod = 
              io.grpc.MethodDescriptor.<grpc.ca.preorder.MenuRequest, grpc.ca.preorder.MenuReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "preorder.PreOrder", "Menu"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.preorder.MenuRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.preorder.MenuReply.getDefaultInstance()))
                  .setSchemaDescriptor(new PreOrderMethodDescriptorSupplier("Menu"))
                  .build();
          }
        }
     }
     return getMenuMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.ca.preorder.OrderRequest,
      grpc.ca.preorder.OrderReply> getOrderMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Order",
      requestType = grpc.ca.preorder.OrderRequest.class,
      responseType = grpc.ca.preorder.OrderReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.ca.preorder.OrderRequest,
      grpc.ca.preorder.OrderReply> getOrderMethod() {
    io.grpc.MethodDescriptor<grpc.ca.preorder.OrderRequest, grpc.ca.preorder.OrderReply> getOrderMethod;
    if ((getOrderMethod = PreOrderGrpc.getOrderMethod) == null) {
      synchronized (PreOrderGrpc.class) {
        if ((getOrderMethod = PreOrderGrpc.getOrderMethod) == null) {
          PreOrderGrpc.getOrderMethod = getOrderMethod = 
              io.grpc.MethodDescriptor.<grpc.ca.preorder.OrderRequest, grpc.ca.preorder.OrderReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "preorder.PreOrder", "Order"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.preorder.OrderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.preorder.OrderReply.getDefaultInstance()))
                  .setSchemaDescriptor(new PreOrderMethodDescriptorSupplier("Order"))
                  .build();
          }
        }
     }
     return getOrderMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.ca.preorder.StatusRequest,
      grpc.ca.preorder.StatusReply> getStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Status",
      requestType = grpc.ca.preorder.StatusRequest.class,
      responseType = grpc.ca.preorder.StatusReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.ca.preorder.StatusRequest,
      grpc.ca.preorder.StatusReply> getStatusMethod() {
    io.grpc.MethodDescriptor<grpc.ca.preorder.StatusRequest, grpc.ca.preorder.StatusReply> getStatusMethod;
    if ((getStatusMethod = PreOrderGrpc.getStatusMethod) == null) {
      synchronized (PreOrderGrpc.class) {
        if ((getStatusMethod = PreOrderGrpc.getStatusMethod) == null) {
          PreOrderGrpc.getStatusMethod = getStatusMethod = 
              io.grpc.MethodDescriptor.<grpc.ca.preorder.StatusRequest, grpc.ca.preorder.StatusReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "preorder.PreOrder", "Status"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.preorder.StatusRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.preorder.StatusReply.getDefaultInstance()))
                  .setSchemaDescriptor(new PreOrderMethodDescriptorSupplier("Status"))
                  .build();
          }
        }
     }
     return getStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PreOrderStub newStub(io.grpc.Channel channel) {
    return new PreOrderStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PreOrderBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PreOrderBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PreOrderFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PreOrderFutureStub(channel);
  }

  /**
   * <pre>
   *Service 2 - Definition
   * </pre>
   */
  public static abstract class PreOrderImplBase implements io.grpc.BindableService {

    /**
     */
    public void menu(grpc.ca.preorder.MenuRequest request,
        io.grpc.stub.StreamObserver<grpc.ca.preorder.MenuReply> responseObserver) {
      asyncUnimplementedUnaryCall(getMenuMethod(), responseObserver);
    }

    /**
     */
    public void order(grpc.ca.preorder.OrderRequest request,
        io.grpc.stub.StreamObserver<grpc.ca.preorder.OrderReply> responseObserver) {
      asyncUnimplementedUnaryCall(getOrderMethod(), responseObserver);
    }

    /**
     */
    public void status(grpc.ca.preorder.StatusRequest request,
        io.grpc.stub.StreamObserver<grpc.ca.preorder.StatusReply> responseObserver) {
      asyncUnimplementedUnaryCall(getStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getMenuMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.ca.preorder.MenuRequest,
                grpc.ca.preorder.MenuReply>(
                  this, METHODID_MENU)))
          .addMethod(
            getOrderMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.ca.preorder.OrderRequest,
                grpc.ca.preorder.OrderReply>(
                  this, METHODID_ORDER)))
          .addMethod(
            getStatusMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                grpc.ca.preorder.StatusRequest,
                grpc.ca.preorder.StatusReply>(
                  this, METHODID_STATUS)))
          .build();
    }
  }

  /**
   * <pre>
   *Service 2 - Definition
   * </pre>
   */
  public static final class PreOrderStub extends io.grpc.stub.AbstractStub<PreOrderStub> {
    private PreOrderStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PreOrderStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PreOrderStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PreOrderStub(channel, callOptions);
    }

    /**
     */
    public void menu(grpc.ca.preorder.MenuRequest request,
        io.grpc.stub.StreamObserver<grpc.ca.preorder.MenuReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getMenuMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void order(grpc.ca.preorder.OrderRequest request,
        io.grpc.stub.StreamObserver<grpc.ca.preorder.OrderReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getOrderMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void status(grpc.ca.preorder.StatusRequest request,
        io.grpc.stub.StreamObserver<grpc.ca.preorder.StatusReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Service 2 - Definition
   * </pre>
   */
  public static final class PreOrderBlockingStub extends io.grpc.stub.AbstractStub<PreOrderBlockingStub> {
    private PreOrderBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PreOrderBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PreOrderBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PreOrderBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.ca.preorder.MenuReply menu(grpc.ca.preorder.MenuRequest request) {
      return blockingUnaryCall(
          getChannel(), getMenuMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<grpc.ca.preorder.OrderReply> order(
        grpc.ca.preorder.OrderRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getOrderMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<grpc.ca.preorder.StatusReply> status(
        grpc.ca.preorder.StatusRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service 2 - Definition
   * </pre>
   */
  public static final class PreOrderFutureStub extends io.grpc.stub.AbstractStub<PreOrderFutureStub> {
    private PreOrderFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PreOrderFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PreOrderFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PreOrderFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.ca.preorder.MenuReply> menu(
        grpc.ca.preorder.MenuRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getMenuMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_MENU = 0;
  private static final int METHODID_ORDER = 1;
  private static final int METHODID_STATUS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PreOrderImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PreOrderImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MENU:
          serviceImpl.menu((grpc.ca.preorder.MenuRequest) request,
              (io.grpc.stub.StreamObserver<grpc.ca.preorder.MenuReply>) responseObserver);
          break;
        case METHODID_ORDER:
          serviceImpl.order((grpc.ca.preorder.OrderRequest) request,
              (io.grpc.stub.StreamObserver<grpc.ca.preorder.OrderReply>) responseObserver);
          break;
        case METHODID_STATUS:
          serviceImpl.status((grpc.ca.preorder.StatusRequest) request,
              (io.grpc.stub.StreamObserver<grpc.ca.preorder.StatusReply>) responseObserver);
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

  private static abstract class PreOrderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PreOrderBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.ca.preorder.PreOrderImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PreOrder");
    }
  }

  private static final class PreOrderFileDescriptorSupplier
      extends PreOrderBaseDescriptorSupplier {
    PreOrderFileDescriptorSupplier() {}
  }

  private static final class PreOrderMethodDescriptorSupplier
      extends PreOrderBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PreOrderMethodDescriptorSupplier(String methodName) {
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
      synchronized (PreOrderGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PreOrderFileDescriptorSupplier())
              .addMethod(getMenuMethod())
              .addMethod(getOrderMethod())
              .addMethod(getStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
