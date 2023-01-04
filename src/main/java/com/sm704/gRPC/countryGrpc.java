package com.sm704.gRPC;

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
    comments = "Source: country.proto")
public final class countryGrpc {

  private countryGrpc() {}

  public static final String SERVICE_NAME = "country";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.sm704.gRPC.CountryOuterClass.GetCountryRequest,
      com.sm704.gRPC.CountryOuterClass.getCountryResponse> getGetCountryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCountry",
      requestType = com.sm704.gRPC.CountryOuterClass.GetCountryRequest.class,
      responseType = com.sm704.gRPC.CountryOuterClass.getCountryResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sm704.gRPC.CountryOuterClass.GetCountryRequest,
      com.sm704.gRPC.CountryOuterClass.getCountryResponse> getGetCountryMethod() {
    io.grpc.MethodDescriptor<com.sm704.gRPC.CountryOuterClass.GetCountryRequest, com.sm704.gRPC.CountryOuterClass.getCountryResponse> getGetCountryMethod;
    if ((getGetCountryMethod = countryGrpc.getGetCountryMethod) == null) {
      synchronized (countryGrpc.class) {
        if ((getGetCountryMethod = countryGrpc.getGetCountryMethod) == null) {
          countryGrpc.getGetCountryMethod = getGetCountryMethod = 
              io.grpc.MethodDescriptor.<com.sm704.gRPC.CountryOuterClass.GetCountryRequest, com.sm704.gRPC.CountryOuterClass.getCountryResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "country", "GetCountry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sm704.gRPC.CountryOuterClass.GetCountryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sm704.gRPC.CountryOuterClass.getCountryResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new countryMethodDescriptorSupplier("GetCountry"))
                  .build();
          }
        }
     }
     return getGetCountryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.sm704.gRPC.CountryOuterClass.GetCountryPopulationRequest,
      com.sm704.gRPC.CountryOuterClass.getCountryPopulationResponse> getGetCountryPopulationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetCountryPopulation",
      requestType = com.sm704.gRPC.CountryOuterClass.GetCountryPopulationRequest.class,
      responseType = com.sm704.gRPC.CountryOuterClass.getCountryPopulationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.sm704.gRPC.CountryOuterClass.GetCountryPopulationRequest,
      com.sm704.gRPC.CountryOuterClass.getCountryPopulationResponse> getGetCountryPopulationMethod() {
    io.grpc.MethodDescriptor<com.sm704.gRPC.CountryOuterClass.GetCountryPopulationRequest, com.sm704.gRPC.CountryOuterClass.getCountryPopulationResponse> getGetCountryPopulationMethod;
    if ((getGetCountryPopulationMethod = countryGrpc.getGetCountryPopulationMethod) == null) {
      synchronized (countryGrpc.class) {
        if ((getGetCountryPopulationMethod = countryGrpc.getGetCountryPopulationMethod) == null) {
          countryGrpc.getGetCountryPopulationMethod = getGetCountryPopulationMethod = 
              io.grpc.MethodDescriptor.<com.sm704.gRPC.CountryOuterClass.GetCountryPopulationRequest, com.sm704.gRPC.CountryOuterClass.getCountryPopulationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "country", "GetCountryPopulation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sm704.gRPC.CountryOuterClass.GetCountryPopulationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.sm704.gRPC.CountryOuterClass.getCountryPopulationResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new countryMethodDescriptorSupplier("GetCountryPopulation"))
                  .build();
          }
        }
     }
     return getGetCountryPopulationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static countryStub newStub(io.grpc.Channel channel) {
    return new countryStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static countryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new countryBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static countryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new countryFutureStub(channel);
  }

  /**
   */
  public static abstract class countryImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCountry(com.sm704.gRPC.CountryOuterClass.GetCountryRequest request,
        io.grpc.stub.StreamObserver<com.sm704.gRPC.CountryOuterClass.getCountryResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCountryMethod(), responseObserver);
    }

    /**
     */
    public void getCountryPopulation(com.sm704.gRPC.CountryOuterClass.GetCountryPopulationRequest request,
        io.grpc.stub.StreamObserver<com.sm704.gRPC.CountryOuterClass.getCountryPopulationResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCountryPopulationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCountryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sm704.gRPC.CountryOuterClass.GetCountryRequest,
                com.sm704.gRPC.CountryOuterClass.getCountryResponse>(
                  this, METHODID_GET_COUNTRY)))
          .addMethod(
            getGetCountryPopulationMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.sm704.gRPC.CountryOuterClass.GetCountryPopulationRequest,
                com.sm704.gRPC.CountryOuterClass.getCountryPopulationResponse>(
                  this, METHODID_GET_COUNTRY_POPULATION)))
          .build();
    }
  }

  /**
   */
  public static final class countryStub extends io.grpc.stub.AbstractStub<countryStub> {
    private countryStub(io.grpc.Channel channel) {
      super(channel);
    }

    private countryStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected countryStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new countryStub(channel, callOptions);
    }

    /**
     */
    public void getCountry(com.sm704.gRPC.CountryOuterClass.GetCountryRequest request,
        io.grpc.stub.StreamObserver<com.sm704.gRPC.CountryOuterClass.getCountryResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCountryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCountryPopulation(com.sm704.gRPC.CountryOuterClass.GetCountryPopulationRequest request,
        io.grpc.stub.StreamObserver<com.sm704.gRPC.CountryOuterClass.getCountryPopulationResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCountryPopulationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class countryBlockingStub extends io.grpc.stub.AbstractStub<countryBlockingStub> {
    private countryBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private countryBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected countryBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new countryBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.sm704.gRPC.CountryOuterClass.getCountryResponse getCountry(com.sm704.gRPC.CountryOuterClass.GetCountryRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCountryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.sm704.gRPC.CountryOuterClass.getCountryPopulationResponse getCountryPopulation(com.sm704.gRPC.CountryOuterClass.GetCountryPopulationRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCountryPopulationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class countryFutureStub extends io.grpc.stub.AbstractStub<countryFutureStub> {
    private countryFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private countryFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected countryFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new countryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sm704.gRPC.CountryOuterClass.getCountryResponse> getCountry(
        com.sm704.gRPC.CountryOuterClass.GetCountryRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCountryMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.sm704.gRPC.CountryOuterClass.getCountryPopulationResponse> getCountryPopulation(
        com.sm704.gRPC.CountryOuterClass.GetCountryPopulationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCountryPopulationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_COUNTRY = 0;
  private static final int METHODID_GET_COUNTRY_POPULATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final countryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(countryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_COUNTRY:
          serviceImpl.getCountry((com.sm704.gRPC.CountryOuterClass.GetCountryRequest) request,
              (io.grpc.stub.StreamObserver<com.sm704.gRPC.CountryOuterClass.getCountryResponse>) responseObserver);
          break;
        case METHODID_GET_COUNTRY_POPULATION:
          serviceImpl.getCountryPopulation((com.sm704.gRPC.CountryOuterClass.GetCountryPopulationRequest) request,
              (io.grpc.stub.StreamObserver<com.sm704.gRPC.CountryOuterClass.getCountryPopulationResponse>) responseObserver);
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

  private static abstract class countryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    countryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.sm704.gRPC.CountryOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("country");
    }
  }

  private static final class countryFileDescriptorSupplier
      extends countryBaseDescriptorSupplier {
    countryFileDescriptorSupplier() {}
  }

  private static final class countryMethodDescriptorSupplier
      extends countryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    countryMethodDescriptorSupplier(String methodName) {
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
      synchronized (countryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new countryFileDescriptorSupplier())
              .addMethod(getGetCountryMethod())
              .addMethod(getGetCountryPopulationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
