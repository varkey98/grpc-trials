package grpc.clientserver1;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: helloworld.proto")
public final class helloworldGrpc {

  private helloworldGrpc() {}

  public static final String SERVICE_NAME = "helloworld";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.clientserver1.Helloworld.req,
      grpc.clientserver1.Helloworld.response> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hello",
      requestType = grpc.clientserver1.Helloworld.req.class,
      responseType = grpc.clientserver1.Helloworld.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.clientserver1.Helloworld.req,
      grpc.clientserver1.Helloworld.response> getHelloMethod() {
    io.grpc.MethodDescriptor<grpc.clientserver1.Helloworld.req, grpc.clientserver1.Helloworld.response> getHelloMethod;
    if ((getHelloMethod = helloworldGrpc.getHelloMethod) == null) {
      synchronized (helloworldGrpc.class) {
        if ((getHelloMethod = helloworldGrpc.getHelloMethod) == null) {
          helloworldGrpc.getHelloMethod = getHelloMethod = 
              io.grpc.MethodDescriptor.<grpc.clientserver1.Helloworld.req, grpc.clientserver1.Helloworld.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "helloworld", "hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.clientserver1.Helloworld.req.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.clientserver1.Helloworld.response.getDefaultInstance()))
                  .setSchemaDescriptor(new helloworldMethodDescriptorSupplier("hello"))
                  .build();
          }
        }
     }
     return getHelloMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static helloworldStub newStub(io.grpc.Channel channel) {
    return new helloworldStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static helloworldBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new helloworldBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static helloworldFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new helloworldFutureStub(channel);
  }

  /**
   */
  public static abstract class helloworldImplBase implements io.grpc.BindableService {

    /**
     */
    public void hello(grpc.clientserver1.Helloworld.req request,
        io.grpc.stub.StreamObserver<grpc.clientserver1.Helloworld.response> responseObserver) {
      asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                grpc.clientserver1.Helloworld.req,
                grpc.clientserver1.Helloworld.response>(
                  this, METHODID_HELLO)))
          .build();
    }
  }

  /**
   */
  public static final class helloworldStub extends io.grpc.stub.AbstractStub<helloworldStub> {
    private helloworldStub(io.grpc.Channel channel) {
      super(channel);
    }

    private helloworldStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected helloworldStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new helloworldStub(channel, callOptions);
    }

    /**
     */
    public void hello(grpc.clientserver1.Helloworld.req request,
        io.grpc.stub.StreamObserver<grpc.clientserver1.Helloworld.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class helloworldBlockingStub extends io.grpc.stub.AbstractStub<helloworldBlockingStub> {
    private helloworldBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private helloworldBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected helloworldBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new helloworldBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.clientserver1.Helloworld.response hello(grpc.clientserver1.Helloworld.req request) {
      return blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class helloworldFutureStub extends io.grpc.stub.AbstractStub<helloworldFutureStub> {
    private helloworldFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private helloworldFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected helloworldFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new helloworldFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.clientserver1.Helloworld.response> hello(
        grpc.clientserver1.Helloworld.req request) {
      return futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final helloworldImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(helloworldImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((grpc.clientserver1.Helloworld.req) request,
              (io.grpc.stub.StreamObserver<grpc.clientserver1.Helloworld.response>) responseObserver);
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

  private static abstract class helloworldBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    helloworldBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.clientserver1.Helloworld.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("helloworld");
    }
  }

  private static final class helloworldFileDescriptorSupplier
      extends helloworldBaseDescriptorSupplier {
    helloworldFileDescriptorSupplier() {}
  }

  private static final class helloworldMethodDescriptorSupplier
      extends helloworldBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    helloworldMethodDescriptorSupplier(String methodName) {
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
      synchronized (helloworldGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new helloworldFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .build();
        }
      }
    }
    return result;
  }
}
