package com.savourrpc.market;

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
    value = "by gRPC proto compiler (version 1.9.1)",
    comments = "Source: savourrpc/market.proto")
public final class PriceServiceGrpc {

  private PriceServiceGrpc() {}

  public static final String SERVICE_NAME = "savourrpc.market.PriceService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetSymbolsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.savourrpc.market.Market.SymbolRequest,
      com.savourrpc.market.Market.SymbolResponse> METHOD_GET_SYMBOLS = getGetSymbolsMethod();

  private static volatile io.grpc.MethodDescriptor<com.savourrpc.market.Market.SymbolRequest,
      com.savourrpc.market.Market.SymbolResponse> getGetSymbolsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.savourrpc.market.Market.SymbolRequest,
      com.savourrpc.market.Market.SymbolResponse> getGetSymbolsMethod() {
    io.grpc.MethodDescriptor<com.savourrpc.market.Market.SymbolRequest, com.savourrpc.market.Market.SymbolResponse> getGetSymbolsMethod;
    if ((getGetSymbolsMethod = PriceServiceGrpc.getGetSymbolsMethod) == null) {
      synchronized (PriceServiceGrpc.class) {
        if ((getGetSymbolsMethod = PriceServiceGrpc.getGetSymbolsMethod) == null) {
          PriceServiceGrpc.getGetSymbolsMethod = getGetSymbolsMethod = 
              io.grpc.MethodDescriptor.<com.savourrpc.market.Market.SymbolRequest, com.savourrpc.market.Market.SymbolResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "savourrpc.market.PriceService", "getSymbols"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.market.Market.SymbolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.market.Market.SymbolResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PriceServiceMethodDescriptorSupplier("getSymbols"))
                  .build();
          }
        }
     }
     return getGetSymbolsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetSymbolPricesMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.savourrpc.market.Market.SymbolPriceRequest,
      com.savourrpc.market.Market.SymbolPriceResponse> METHOD_GET_SYMBOL_PRICES = getGetSymbolPricesMethod();

  private static volatile io.grpc.MethodDescriptor<com.savourrpc.market.Market.SymbolPriceRequest,
      com.savourrpc.market.Market.SymbolPriceResponse> getGetSymbolPricesMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.savourrpc.market.Market.SymbolPriceRequest,
      com.savourrpc.market.Market.SymbolPriceResponse> getGetSymbolPricesMethod() {
    io.grpc.MethodDescriptor<com.savourrpc.market.Market.SymbolPriceRequest, com.savourrpc.market.Market.SymbolPriceResponse> getGetSymbolPricesMethod;
    if ((getGetSymbolPricesMethod = PriceServiceGrpc.getGetSymbolPricesMethod) == null) {
      synchronized (PriceServiceGrpc.class) {
        if ((getGetSymbolPricesMethod = PriceServiceGrpc.getGetSymbolPricesMethod) == null) {
          PriceServiceGrpc.getGetSymbolPricesMethod = getGetSymbolPricesMethod = 
              io.grpc.MethodDescriptor.<com.savourrpc.market.Market.SymbolPriceRequest, com.savourrpc.market.Market.SymbolPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "savourrpc.market.PriceService", "getSymbolPrices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.market.Market.SymbolPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.market.Market.SymbolPriceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PriceServiceMethodDescriptorSupplier("getSymbolPrices"))
                  .build();
          }
        }
     }
     return getGetSymbolPricesMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetStableCoinsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.savourrpc.market.Market.StableCoinRequest,
      com.savourrpc.market.Market.StableCoinResponse> METHOD_GET_STABLE_COINS = getGetStableCoinsMethod();

  private static volatile io.grpc.MethodDescriptor<com.savourrpc.market.Market.StableCoinRequest,
      com.savourrpc.market.Market.StableCoinResponse> getGetStableCoinsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.savourrpc.market.Market.StableCoinRequest,
      com.savourrpc.market.Market.StableCoinResponse> getGetStableCoinsMethod() {
    io.grpc.MethodDescriptor<com.savourrpc.market.Market.StableCoinRequest, com.savourrpc.market.Market.StableCoinResponse> getGetStableCoinsMethod;
    if ((getGetStableCoinsMethod = PriceServiceGrpc.getGetStableCoinsMethod) == null) {
      synchronized (PriceServiceGrpc.class) {
        if ((getGetStableCoinsMethod = PriceServiceGrpc.getGetStableCoinsMethod) == null) {
          PriceServiceGrpc.getGetStableCoinsMethod = getGetStableCoinsMethod = 
              io.grpc.MethodDescriptor.<com.savourrpc.market.Market.StableCoinRequest, com.savourrpc.market.Market.StableCoinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "savourrpc.market.PriceService", "getStableCoins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.market.Market.StableCoinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.market.Market.StableCoinResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PriceServiceMethodDescriptorSupplier("getStableCoins"))
                  .build();
          }
        }
     }
     return getGetStableCoinsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetStableCoinPriceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.savourrpc.market.Market.StableCoinPriceRequest,
      com.savourrpc.market.Market.StableCoinPriceResponse> METHOD_GET_STABLE_COIN_PRICE = getGetStableCoinPriceMethod();

  private static volatile io.grpc.MethodDescriptor<com.savourrpc.market.Market.StableCoinPriceRequest,
      com.savourrpc.market.Market.StableCoinPriceResponse> getGetStableCoinPriceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.savourrpc.market.Market.StableCoinPriceRequest,
      com.savourrpc.market.Market.StableCoinPriceResponse> getGetStableCoinPriceMethod() {
    io.grpc.MethodDescriptor<com.savourrpc.market.Market.StableCoinPriceRequest, com.savourrpc.market.Market.StableCoinPriceResponse> getGetStableCoinPriceMethod;
    if ((getGetStableCoinPriceMethod = PriceServiceGrpc.getGetStableCoinPriceMethod) == null) {
      synchronized (PriceServiceGrpc.class) {
        if ((getGetStableCoinPriceMethod = PriceServiceGrpc.getGetStableCoinPriceMethod) == null) {
          PriceServiceGrpc.getGetStableCoinPriceMethod = getGetStableCoinPriceMethod = 
              io.grpc.MethodDescriptor.<com.savourrpc.market.Market.StableCoinPriceRequest, com.savourrpc.market.Market.StableCoinPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "savourrpc.market.PriceService", "getStableCoinPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.market.Market.StableCoinPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.market.Market.StableCoinPriceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new PriceServiceMethodDescriptorSupplier("getStableCoinPrice"))
                  .build();
          }
        }
     }
     return getGetStableCoinPriceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PriceServiceStub newStub(io.grpc.Channel channel) {
    return new PriceServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PriceServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PriceServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PriceServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PriceServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PriceServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSymbols(com.savourrpc.market.Market.SymbolRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.market.Market.SymbolResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSymbolsMethod(), responseObserver);
    }

    /**
     */
    public void getSymbolPrices(com.savourrpc.market.Market.SymbolPriceRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.market.Market.SymbolPriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSymbolPricesMethod(), responseObserver);
    }

    /**
     */
    public void getStableCoins(com.savourrpc.market.Market.StableCoinRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.market.Market.StableCoinResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStableCoinsMethod(), responseObserver);
    }

    /**
     */
    public void getStableCoinPrice(com.savourrpc.market.Market.StableCoinPriceRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.market.Market.StableCoinPriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStableCoinPriceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSymbolsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.savourrpc.market.Market.SymbolRequest,
                com.savourrpc.market.Market.SymbolResponse>(
                  this, METHODID_GET_SYMBOLS)))
          .addMethod(
            getGetSymbolPricesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.savourrpc.market.Market.SymbolPriceRequest,
                com.savourrpc.market.Market.SymbolPriceResponse>(
                  this, METHODID_GET_SYMBOL_PRICES)))
          .addMethod(
            getGetStableCoinsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.savourrpc.market.Market.StableCoinRequest,
                com.savourrpc.market.Market.StableCoinResponse>(
                  this, METHODID_GET_STABLE_COINS)))
          .addMethod(
            getGetStableCoinPriceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.savourrpc.market.Market.StableCoinPriceRequest,
                com.savourrpc.market.Market.StableCoinPriceResponse>(
                  this, METHODID_GET_STABLE_COIN_PRICE)))
          .build();
    }
  }

  /**
   */
  public static final class PriceServiceStub extends io.grpc.stub.AbstractStub<PriceServiceStub> {
    private PriceServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PriceServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PriceServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PriceServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSymbols(com.savourrpc.market.Market.SymbolRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.market.Market.SymbolResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSymbolsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSymbolPrices(com.savourrpc.market.Market.SymbolPriceRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.market.Market.SymbolPriceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSymbolPricesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStableCoins(com.savourrpc.market.Market.StableCoinRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.market.Market.StableCoinResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStableCoinsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStableCoinPrice(com.savourrpc.market.Market.StableCoinPriceRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.market.Market.StableCoinPriceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStableCoinPriceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PriceServiceBlockingStub extends io.grpc.stub.AbstractStub<PriceServiceBlockingStub> {
    private PriceServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PriceServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PriceServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PriceServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.savourrpc.market.Market.SymbolResponse getSymbols(com.savourrpc.market.Market.SymbolRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSymbolsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.savourrpc.market.Market.SymbolPriceResponse getSymbolPrices(com.savourrpc.market.Market.SymbolPriceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSymbolPricesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.savourrpc.market.Market.StableCoinResponse getStableCoins(com.savourrpc.market.Market.StableCoinRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStableCoinsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.savourrpc.market.Market.StableCoinPriceResponse getStableCoinPrice(com.savourrpc.market.Market.StableCoinPriceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStableCoinPriceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PriceServiceFutureStub extends io.grpc.stub.AbstractStub<PriceServiceFutureStub> {
    private PriceServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PriceServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PriceServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PriceServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.savourrpc.market.Market.SymbolResponse> getSymbols(
        com.savourrpc.market.Market.SymbolRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSymbolsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.savourrpc.market.Market.SymbolPriceResponse> getSymbolPrices(
        com.savourrpc.market.Market.SymbolPriceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSymbolPricesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.savourrpc.market.Market.StableCoinResponse> getStableCoins(
        com.savourrpc.market.Market.StableCoinRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStableCoinsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.savourrpc.market.Market.StableCoinPriceResponse> getStableCoinPrice(
        com.savourrpc.market.Market.StableCoinPriceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStableCoinPriceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SYMBOLS = 0;
  private static final int METHODID_GET_SYMBOL_PRICES = 1;
  private static final int METHODID_GET_STABLE_COINS = 2;
  private static final int METHODID_GET_STABLE_COIN_PRICE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PriceServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PriceServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SYMBOLS:
          serviceImpl.getSymbols((com.savourrpc.market.Market.SymbolRequest) request,
              (io.grpc.stub.StreamObserver<com.savourrpc.market.Market.SymbolResponse>) responseObserver);
          break;
        case METHODID_GET_SYMBOL_PRICES:
          serviceImpl.getSymbolPrices((com.savourrpc.market.Market.SymbolPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.savourrpc.market.Market.SymbolPriceResponse>) responseObserver);
          break;
        case METHODID_GET_STABLE_COINS:
          serviceImpl.getStableCoins((com.savourrpc.market.Market.StableCoinRequest) request,
              (io.grpc.stub.StreamObserver<com.savourrpc.market.Market.StableCoinResponse>) responseObserver);
          break;
        case METHODID_GET_STABLE_COIN_PRICE:
          serviceImpl.getStableCoinPrice((com.savourrpc.market.Market.StableCoinPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.savourrpc.market.Market.StableCoinPriceResponse>) responseObserver);
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

  private static abstract class PriceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PriceServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.savourrpc.market.Market.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PriceService");
    }
  }

  private static final class PriceServiceFileDescriptorSupplier
      extends PriceServiceBaseDescriptorSupplier {
    PriceServiceFileDescriptorSupplier() {}
  }

  private static final class PriceServiceMethodDescriptorSupplier
      extends PriceServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PriceServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PriceServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PriceServiceFileDescriptorSupplier())
              .addMethod(getGetSymbolsMethod())
              .addMethod(getGetSymbolPricesMethod())
              .addMethod(getGetStableCoinsMethod())
              .addMethod(getGetStableCoinPriceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
