package grpc.ca.review;

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
 *Service 3 - Definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: review.proto")
public final class ReviewGrpc {

  private ReviewGrpc() {}

  public static final String SERVICE_NAME = "review.Review";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.ca.review.WriteRequest,
      grpc.ca.review.WriteReply> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Write",
      requestType = grpc.ca.review.WriteRequest.class,
      responseType = grpc.ca.review.WriteReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.ca.review.WriteRequest,
      grpc.ca.review.WriteReply> getWriteMethod() {
    io.grpc.MethodDescriptor<grpc.ca.review.WriteRequest, grpc.ca.review.WriteReply> getWriteMethod;
    if ((getWriteMethod = ReviewGrpc.getWriteMethod) == null) {
      synchronized (ReviewGrpc.class) {
        if ((getWriteMethod = ReviewGrpc.getWriteMethod) == null) {
          ReviewGrpc.getWriteMethod = getWriteMethod = 
              io.grpc.MethodDescriptor.<grpc.ca.review.WriteRequest, grpc.ca.review.WriteReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "review.Review", "Write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.review.WriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.review.WriteReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ReviewMethodDescriptorSupplier("Write"))
                  .build();
          }
        }
     }
     return getWriteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.ca.review.EditRequest,
      grpc.ca.review.EditReply> getEditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Edit",
      requestType = grpc.ca.review.EditRequest.class,
      responseType = grpc.ca.review.EditReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.ca.review.EditRequest,
      grpc.ca.review.EditReply> getEditMethod() {
    io.grpc.MethodDescriptor<grpc.ca.review.EditRequest, grpc.ca.review.EditReply> getEditMethod;
    if ((getEditMethod = ReviewGrpc.getEditMethod) == null) {
      synchronized (ReviewGrpc.class) {
        if ((getEditMethod = ReviewGrpc.getEditMethod) == null) {
          ReviewGrpc.getEditMethod = getEditMethod = 
              io.grpc.MethodDescriptor.<grpc.ca.review.EditRequest, grpc.ca.review.EditReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "review.Review", "Edit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.review.EditRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.review.EditReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ReviewMethodDescriptorSupplier("Edit"))
                  .build();
          }
        }
     }
     return getEditMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.ca.review.ChatRequest,
      grpc.ca.review.ChatReply> getChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Chat",
      requestType = grpc.ca.review.ChatRequest.class,
      responseType = grpc.ca.review.ChatReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<grpc.ca.review.ChatRequest,
      grpc.ca.review.ChatReply> getChatMethod() {
    io.grpc.MethodDescriptor<grpc.ca.review.ChatRequest, grpc.ca.review.ChatReply> getChatMethod;
    if ((getChatMethod = ReviewGrpc.getChatMethod) == null) {
      synchronized (ReviewGrpc.class) {
        if ((getChatMethod = ReviewGrpc.getChatMethod) == null) {
          ReviewGrpc.getChatMethod = getChatMethod = 
              io.grpc.MethodDescriptor.<grpc.ca.review.ChatRequest, grpc.ca.review.ChatReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "review.Review", "Chat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.review.ChatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.ca.review.ChatReply.getDefaultInstance()))
                  .setSchemaDescriptor(new ReviewMethodDescriptorSupplier("Chat"))
                  .build();
          }
        }
     }
     return getChatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReviewStub newStub(io.grpc.Channel channel) {
    return new ReviewStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReviewBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ReviewBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReviewFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ReviewFutureStub(channel);
  }

  /**
   * <pre>
   *Service 3 - Definition
   * </pre>
   */
  public static abstract class ReviewImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.ca.review.WriteRequest> write(
        io.grpc.stub.StreamObserver<grpc.ca.review.WriteReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getWriteMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.ca.review.EditRequest> edit(
        io.grpc.stub.StreamObserver<grpc.ca.review.EditReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getEditMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.ca.review.ChatRequest> chat(
        io.grpc.stub.StreamObserver<grpc.ca.review.ChatReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getChatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWriteMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.ca.review.WriteRequest,
                grpc.ca.review.WriteReply>(
                  this, METHODID_WRITE)))
          .addMethod(
            getEditMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                grpc.ca.review.EditRequest,
                grpc.ca.review.EditReply>(
                  this, METHODID_EDIT)))
          .addMethod(
            getChatMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                grpc.ca.review.ChatRequest,
                grpc.ca.review.ChatReply>(
                  this, METHODID_CHAT)))
          .build();
    }
  }

  /**
   * <pre>
   *Service 3 - Definition
   * </pre>
   */
  public static final class ReviewStub extends io.grpc.stub.AbstractStub<ReviewStub> {
    private ReviewStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReviewStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReviewStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReviewStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.ca.review.WriteRequest> write(
        io.grpc.stub.StreamObserver<grpc.ca.review.WriteReply> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.ca.review.EditRequest> edit(
        io.grpc.stub.StreamObserver<grpc.ca.review.EditReply> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getEditMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<grpc.ca.review.ChatRequest> chat(
        io.grpc.stub.StreamObserver<grpc.ca.review.ChatReply> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getChatMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   *Service 3 - Definition
   * </pre>
   */
  public static final class ReviewBlockingStub extends io.grpc.stub.AbstractStub<ReviewBlockingStub> {
    private ReviewBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReviewBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReviewBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReviewBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   *Service 3 - Definition
   * </pre>
   */
  public static final class ReviewFutureStub extends io.grpc.stub.AbstractStub<ReviewFutureStub> {
    private ReviewFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ReviewFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReviewFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ReviewFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_WRITE = 0;
  private static final int METHODID_EDIT = 1;
  private static final int METHODID_CHAT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ReviewImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ReviewImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WRITE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.write(
              (io.grpc.stub.StreamObserver<grpc.ca.review.WriteReply>) responseObserver);
        case METHODID_EDIT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.edit(
              (io.grpc.stub.StreamObserver<grpc.ca.review.EditReply>) responseObserver);
        case METHODID_CHAT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.chat(
              (io.grpc.stub.StreamObserver<grpc.ca.review.ChatReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ReviewBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReviewBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.ca.review.ReviewImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Review");
    }
  }

  private static final class ReviewFileDescriptorSupplier
      extends ReviewBaseDescriptorSupplier {
    ReviewFileDescriptorSupplier() {}
  }

  private static final class ReviewMethodDescriptorSupplier
      extends ReviewBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ReviewMethodDescriptorSupplier(String methodName) {
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
      synchronized (ReviewGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReviewFileDescriptorSupplier())
              .addMethod(getWriteMethod())
              .addMethod(getEditMethod())
              .addMethod(getChatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
