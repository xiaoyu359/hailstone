package com.savourrpc.wallet;

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
    comments = "Source: savourrpc/wallet.proto")
public final class WalletServiceGrpc {

  private WalletServiceGrpc() {}

  public static final String SERVICE_NAME = "savourrpc.wallet.WalletService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetSupportCoinsMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.SupportCoinsRequest,
      com.savourrpc.wallet.Wallet.SupportCoinsResponse> METHOD_GET_SUPPORT_COINS = getGetSupportCoinsMethod();

  private static volatile io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.SupportCoinsRequest,
      com.savourrpc.wallet.Wallet.SupportCoinsResponse> getGetSupportCoinsMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.SupportCoinsRequest,
      com.savourrpc.wallet.Wallet.SupportCoinsResponse> getGetSupportCoinsMethod() {
    io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.SupportCoinsRequest, com.savourrpc.wallet.Wallet.SupportCoinsResponse> getGetSupportCoinsMethod;
    if ((getGetSupportCoinsMethod = WalletServiceGrpc.getGetSupportCoinsMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getGetSupportCoinsMethod = WalletServiceGrpc.getGetSupportCoinsMethod) == null) {
          WalletServiceGrpc.getGetSupportCoinsMethod = getGetSupportCoinsMethod = 
              io.grpc.MethodDescriptor.<com.savourrpc.wallet.Wallet.SupportCoinsRequest, com.savourrpc.wallet.Wallet.SupportCoinsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "savourrpc.wallet.WalletService", "getSupportCoins"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.SupportCoinsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.SupportCoinsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("getSupportCoins"))
                  .build();
          }
        }
     }
     return getGetSupportCoinsMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetNonceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.NonceRequest,
      com.savourrpc.wallet.Wallet.NonceResponse> METHOD_GET_NONCE = getGetNonceMethod();

  private static volatile io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.NonceRequest,
      com.savourrpc.wallet.Wallet.NonceResponse> getGetNonceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.NonceRequest,
      com.savourrpc.wallet.Wallet.NonceResponse> getGetNonceMethod() {
    io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.NonceRequest, com.savourrpc.wallet.Wallet.NonceResponse> getGetNonceMethod;
    if ((getGetNonceMethod = WalletServiceGrpc.getGetNonceMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getGetNonceMethod = WalletServiceGrpc.getGetNonceMethod) == null) {
          WalletServiceGrpc.getGetNonceMethod = getGetNonceMethod = 
              io.grpc.MethodDescriptor.<com.savourrpc.wallet.Wallet.NonceRequest, com.savourrpc.wallet.Wallet.NonceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "savourrpc.wallet.WalletService", "getNonce"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.NonceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.NonceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("getNonce"))
                  .build();
          }
        }
     }
     return getGetNonceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetGasPriceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.GasPriceRequest,
      com.savourrpc.wallet.Wallet.GasPriceResponse> METHOD_GET_GAS_PRICE = getGetGasPriceMethod();

  private static volatile io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.GasPriceRequest,
      com.savourrpc.wallet.Wallet.GasPriceResponse> getGetGasPriceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.GasPriceRequest,
      com.savourrpc.wallet.Wallet.GasPriceResponse> getGetGasPriceMethod() {
    io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.GasPriceRequest, com.savourrpc.wallet.Wallet.GasPriceResponse> getGetGasPriceMethod;
    if ((getGetGasPriceMethod = WalletServiceGrpc.getGetGasPriceMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getGetGasPriceMethod = WalletServiceGrpc.getGetGasPriceMethod) == null) {
          WalletServiceGrpc.getGetGasPriceMethod = getGetGasPriceMethod = 
              io.grpc.MethodDescriptor.<com.savourrpc.wallet.Wallet.GasPriceRequest, com.savourrpc.wallet.Wallet.GasPriceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "savourrpc.wallet.WalletService", "getGasPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.GasPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.GasPriceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("getGasPrice"))
                  .build();
          }
        }
     }
     return getGetGasPriceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getSendTxMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.SendTxRequest,
      com.savourrpc.wallet.Wallet.SendTxResponse> METHOD_SEND_TX = getSendTxMethod();

  private static volatile io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.SendTxRequest,
      com.savourrpc.wallet.Wallet.SendTxResponse> getSendTxMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.SendTxRequest,
      com.savourrpc.wallet.Wallet.SendTxResponse> getSendTxMethod() {
    io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.SendTxRequest, com.savourrpc.wallet.Wallet.SendTxResponse> getSendTxMethod;
    if ((getSendTxMethod = WalletServiceGrpc.getSendTxMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getSendTxMethod = WalletServiceGrpc.getSendTxMethod) == null) {
          WalletServiceGrpc.getSendTxMethod = getSendTxMethod = 
              io.grpc.MethodDescriptor.<com.savourrpc.wallet.Wallet.SendTxRequest, com.savourrpc.wallet.Wallet.SendTxResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "savourrpc.wallet.WalletService", "SendTx"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.SendTxRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.SendTxResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("SendTx"))
                  .build();
          }
        }
     }
     return getSendTxMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetBalanceMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.BalanceRequest,
      com.savourrpc.wallet.Wallet.BalanceResponse> METHOD_GET_BALANCE = getGetBalanceMethod();

  private static volatile io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.BalanceRequest,
      com.savourrpc.wallet.Wallet.BalanceResponse> getGetBalanceMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.BalanceRequest,
      com.savourrpc.wallet.Wallet.BalanceResponse> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.BalanceRequest, com.savourrpc.wallet.Wallet.BalanceResponse> getGetBalanceMethod;
    if ((getGetBalanceMethod = WalletServiceGrpc.getGetBalanceMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getGetBalanceMethod = WalletServiceGrpc.getGetBalanceMethod) == null) {
          WalletServiceGrpc.getGetBalanceMethod = getGetBalanceMethod = 
              io.grpc.MethodDescriptor.<com.savourrpc.wallet.Wallet.BalanceRequest, com.savourrpc.wallet.Wallet.BalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "savourrpc.wallet.WalletService", "getBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.BalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.BalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("getBalance"))
                  .build();
          }
        }
     }
     return getGetBalanceMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetTxByAddressMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.TxAddressRequest,
      com.savourrpc.wallet.Wallet.TxAddressResponse> METHOD_GET_TX_BY_ADDRESS = getGetTxByAddressMethod();

  private static volatile io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.TxAddressRequest,
      com.savourrpc.wallet.Wallet.TxAddressResponse> getGetTxByAddressMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.TxAddressRequest,
      com.savourrpc.wallet.Wallet.TxAddressResponse> getGetTxByAddressMethod() {
    io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.TxAddressRequest, com.savourrpc.wallet.Wallet.TxAddressResponse> getGetTxByAddressMethod;
    if ((getGetTxByAddressMethod = WalletServiceGrpc.getGetTxByAddressMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getGetTxByAddressMethod = WalletServiceGrpc.getGetTxByAddressMethod) == null) {
          WalletServiceGrpc.getGetTxByAddressMethod = getGetTxByAddressMethod = 
              io.grpc.MethodDescriptor.<com.savourrpc.wallet.Wallet.TxAddressRequest, com.savourrpc.wallet.Wallet.TxAddressResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "savourrpc.wallet.WalletService", "getTxByAddress"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.TxAddressRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.TxAddressResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("getTxByAddress"))
                  .build();
          }
        }
     }
     return getGetTxByAddressMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetTxByHashMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.TxHashRequest,
      com.savourrpc.wallet.Wallet.TxHashResponse> METHOD_GET_TX_BY_HASH = getGetTxByHashMethod();

  private static volatile io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.TxHashRequest,
      com.savourrpc.wallet.Wallet.TxHashResponse> getGetTxByHashMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.TxHashRequest,
      com.savourrpc.wallet.Wallet.TxHashResponse> getGetTxByHashMethod() {
    io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.TxHashRequest, com.savourrpc.wallet.Wallet.TxHashResponse> getGetTxByHashMethod;
    if ((getGetTxByHashMethod = WalletServiceGrpc.getGetTxByHashMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getGetTxByHashMethod = WalletServiceGrpc.getGetTxByHashMethod) == null) {
          WalletServiceGrpc.getGetTxByHashMethod = getGetTxByHashMethod = 
              io.grpc.MethodDescriptor.<com.savourrpc.wallet.Wallet.TxHashRequest, com.savourrpc.wallet.Wallet.TxHashResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "savourrpc.wallet.WalletService", "getTxByHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.TxHashRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.TxHashResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("getTxByHash"))
                  .build();
          }
        }
     }
     return getGetTxByHashMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetAccountMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.AccountRequest,
      com.savourrpc.wallet.Wallet.AccountResponse> METHOD_GET_ACCOUNT = getGetAccountMethod();

  private static volatile io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.AccountRequest,
      com.savourrpc.wallet.Wallet.AccountResponse> getGetAccountMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.AccountRequest,
      com.savourrpc.wallet.Wallet.AccountResponse> getGetAccountMethod() {
    io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.AccountRequest, com.savourrpc.wallet.Wallet.AccountResponse> getGetAccountMethod;
    if ((getGetAccountMethod = WalletServiceGrpc.getGetAccountMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getGetAccountMethod = WalletServiceGrpc.getGetAccountMethod) == null) {
          WalletServiceGrpc.getGetAccountMethod = getGetAccountMethod = 
              io.grpc.MethodDescriptor.<com.savourrpc.wallet.Wallet.AccountRequest, com.savourrpc.wallet.Wallet.AccountResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "savourrpc.wallet.WalletService", "getAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.AccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.AccountResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("getAccount"))
                  .build();
          }
        }
     }
     return getGetAccountMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetUtxoMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.UtxoRequest,
      com.savourrpc.wallet.Wallet.UtxoResponse> METHOD_GET_UTXO = getGetUtxoMethod();

  private static volatile io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.UtxoRequest,
      com.savourrpc.wallet.Wallet.UtxoResponse> getGetUtxoMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.UtxoRequest,
      com.savourrpc.wallet.Wallet.UtxoResponse> getGetUtxoMethod() {
    io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.UtxoRequest, com.savourrpc.wallet.Wallet.UtxoResponse> getGetUtxoMethod;
    if ((getGetUtxoMethod = WalletServiceGrpc.getGetUtxoMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getGetUtxoMethod = WalletServiceGrpc.getGetUtxoMethod) == null) {
          WalletServiceGrpc.getGetUtxoMethod = getGetUtxoMethod = 
              io.grpc.MethodDescriptor.<com.savourrpc.wallet.Wallet.UtxoRequest, com.savourrpc.wallet.Wallet.UtxoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "savourrpc.wallet.WalletService", "getUtxo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.UtxoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.UtxoResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("getUtxo"))
                  .build();
          }
        }
     }
     return getGetUtxoMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetMinRentMethod()} instead. 
  public static final io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.MinRentRequest,
      com.savourrpc.wallet.Wallet.MinRentResponse> METHOD_GET_MIN_RENT = getGetMinRentMethod();

  private static volatile io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.MinRentRequest,
      com.savourrpc.wallet.Wallet.MinRentResponse> getGetMinRentMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.MinRentRequest,
      com.savourrpc.wallet.Wallet.MinRentResponse> getGetMinRentMethod() {
    io.grpc.MethodDescriptor<com.savourrpc.wallet.Wallet.MinRentRequest, com.savourrpc.wallet.Wallet.MinRentResponse> getGetMinRentMethod;
    if ((getGetMinRentMethod = WalletServiceGrpc.getGetMinRentMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getGetMinRentMethod = WalletServiceGrpc.getGetMinRentMethod) == null) {
          WalletServiceGrpc.getGetMinRentMethod = getGetMinRentMethod = 
              io.grpc.MethodDescriptor.<com.savourrpc.wallet.Wallet.MinRentRequest, com.savourrpc.wallet.Wallet.MinRentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "savourrpc.wallet.WalletService", "getMinRent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.MinRentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.savourrpc.wallet.Wallet.MinRentResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("getMinRent"))
                  .build();
          }
        }
     }
     return getGetMinRentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletServiceStub newStub(io.grpc.Channel channel) {
    return new WalletServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WalletServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WalletServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class WalletServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getSupportCoins(com.savourrpc.wallet.Wallet.SupportCoinsRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.SupportCoinsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSupportCoinsMethod(), responseObserver);
    }

    /**
     */
    public void getNonce(com.savourrpc.wallet.Wallet.NonceRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.NonceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetNonceMethod(), responseObserver);
    }

    /**
     */
    public void getGasPrice(com.savourrpc.wallet.Wallet.GasPriceRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.GasPriceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetGasPriceMethod(), responseObserver);
    }

    /**
     */
    public void sendTx(com.savourrpc.wallet.Wallet.SendTxRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.SendTxResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendTxMethod(), responseObserver);
    }

    /**
     */
    public void getBalance(com.savourrpc.wallet.Wallet.BalanceRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.BalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    /**
     */
    public void getTxByAddress(com.savourrpc.wallet.Wallet.TxAddressRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.TxAddressResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTxByAddressMethod(), responseObserver);
    }

    /**
     */
    public void getTxByHash(com.savourrpc.wallet.Wallet.TxHashRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.TxHashResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTxByHashMethod(), responseObserver);
    }

    /**
     */
    public void getAccount(com.savourrpc.wallet.Wallet.AccountRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.AccountResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAccountMethod(), responseObserver);
    }

    /**
     */
    public void getUtxo(com.savourrpc.wallet.Wallet.UtxoRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.UtxoResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUtxoMethod(), responseObserver);
    }

    /**
     */
    public void getMinRent(com.savourrpc.wallet.Wallet.MinRentRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.MinRentResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMinRentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetSupportCoinsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.savourrpc.wallet.Wallet.SupportCoinsRequest,
                com.savourrpc.wallet.Wallet.SupportCoinsResponse>(
                  this, METHODID_GET_SUPPORT_COINS)))
          .addMethod(
            getGetNonceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.savourrpc.wallet.Wallet.NonceRequest,
                com.savourrpc.wallet.Wallet.NonceResponse>(
                  this, METHODID_GET_NONCE)))
          .addMethod(
            getGetGasPriceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.savourrpc.wallet.Wallet.GasPriceRequest,
                com.savourrpc.wallet.Wallet.GasPriceResponse>(
                  this, METHODID_GET_GAS_PRICE)))
          .addMethod(
            getSendTxMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.savourrpc.wallet.Wallet.SendTxRequest,
                com.savourrpc.wallet.Wallet.SendTxResponse>(
                  this, METHODID_SEND_TX)))
          .addMethod(
            getGetBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.savourrpc.wallet.Wallet.BalanceRequest,
                com.savourrpc.wallet.Wallet.BalanceResponse>(
                  this, METHODID_GET_BALANCE)))
          .addMethod(
            getGetTxByAddressMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.savourrpc.wallet.Wallet.TxAddressRequest,
                com.savourrpc.wallet.Wallet.TxAddressResponse>(
                  this, METHODID_GET_TX_BY_ADDRESS)))
          .addMethod(
            getGetTxByHashMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.savourrpc.wallet.Wallet.TxHashRequest,
                com.savourrpc.wallet.Wallet.TxHashResponse>(
                  this, METHODID_GET_TX_BY_HASH)))
          .addMethod(
            getGetAccountMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.savourrpc.wallet.Wallet.AccountRequest,
                com.savourrpc.wallet.Wallet.AccountResponse>(
                  this, METHODID_GET_ACCOUNT)))
          .addMethod(
            getGetUtxoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.savourrpc.wallet.Wallet.UtxoRequest,
                com.savourrpc.wallet.Wallet.UtxoResponse>(
                  this, METHODID_GET_UTXO)))
          .addMethod(
            getGetMinRentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.savourrpc.wallet.Wallet.MinRentRequest,
                com.savourrpc.wallet.Wallet.MinRentResponse>(
                  this, METHODID_GET_MIN_RENT)))
          .build();
    }
  }

  /**
   */
  public static final class WalletServiceStub extends io.grpc.stub.AbstractStub<WalletServiceStub> {
    private WalletServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletServiceStub(channel, callOptions);
    }

    /**
     */
    public void getSupportCoins(com.savourrpc.wallet.Wallet.SupportCoinsRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.SupportCoinsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSupportCoinsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNonce(com.savourrpc.wallet.Wallet.NonceRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.NonceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNonceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getGasPrice(com.savourrpc.wallet.Wallet.GasPriceRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.GasPriceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetGasPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendTx(com.savourrpc.wallet.Wallet.SendTxRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.SendTxResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendTxMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBalance(com.savourrpc.wallet.Wallet.BalanceRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.BalanceResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTxByAddress(com.savourrpc.wallet.Wallet.TxAddressRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.TxAddressResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTxByAddressMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTxByHash(com.savourrpc.wallet.Wallet.TxHashRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.TxHashResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTxByHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccount(com.savourrpc.wallet.Wallet.AccountRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.AccountResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUtxo(com.savourrpc.wallet.Wallet.UtxoRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.UtxoResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUtxoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMinRent(com.savourrpc.wallet.Wallet.MinRentRequest request,
        io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.MinRentResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMinRentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WalletServiceBlockingStub extends io.grpc.stub.AbstractStub<WalletServiceBlockingStub> {
    private WalletServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.savourrpc.wallet.Wallet.SupportCoinsResponse getSupportCoins(com.savourrpc.wallet.Wallet.SupportCoinsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSupportCoinsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.savourrpc.wallet.Wallet.NonceResponse getNonce(com.savourrpc.wallet.Wallet.NonceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNonceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.savourrpc.wallet.Wallet.GasPriceResponse getGasPrice(com.savourrpc.wallet.Wallet.GasPriceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetGasPriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.savourrpc.wallet.Wallet.SendTxResponse sendTx(com.savourrpc.wallet.Wallet.SendTxRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendTxMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.savourrpc.wallet.Wallet.BalanceResponse getBalance(com.savourrpc.wallet.Wallet.BalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.savourrpc.wallet.Wallet.TxAddressResponse getTxByAddress(com.savourrpc.wallet.Wallet.TxAddressRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTxByAddressMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.savourrpc.wallet.Wallet.TxHashResponse getTxByHash(com.savourrpc.wallet.Wallet.TxHashRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTxByHashMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.savourrpc.wallet.Wallet.AccountResponse getAccount(com.savourrpc.wallet.Wallet.AccountRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.savourrpc.wallet.Wallet.UtxoResponse getUtxo(com.savourrpc.wallet.Wallet.UtxoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetUtxoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.savourrpc.wallet.Wallet.MinRentResponse getMinRent(com.savourrpc.wallet.Wallet.MinRentRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMinRentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WalletServiceFutureStub extends io.grpc.stub.AbstractStub<WalletServiceFutureStub> {
    private WalletServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.savourrpc.wallet.Wallet.SupportCoinsResponse> getSupportCoins(
        com.savourrpc.wallet.Wallet.SupportCoinsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSupportCoinsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.savourrpc.wallet.Wallet.NonceResponse> getNonce(
        com.savourrpc.wallet.Wallet.NonceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNonceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.savourrpc.wallet.Wallet.GasPriceResponse> getGasPrice(
        com.savourrpc.wallet.Wallet.GasPriceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetGasPriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.savourrpc.wallet.Wallet.SendTxResponse> sendTx(
        com.savourrpc.wallet.Wallet.SendTxRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendTxMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.savourrpc.wallet.Wallet.BalanceResponse> getBalance(
        com.savourrpc.wallet.Wallet.BalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.savourrpc.wallet.Wallet.TxAddressResponse> getTxByAddress(
        com.savourrpc.wallet.Wallet.TxAddressRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTxByAddressMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.savourrpc.wallet.Wallet.TxHashResponse> getTxByHash(
        com.savourrpc.wallet.Wallet.TxHashRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTxByHashMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.savourrpc.wallet.Wallet.AccountResponse> getAccount(
        com.savourrpc.wallet.Wallet.AccountRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.savourrpc.wallet.Wallet.UtxoResponse> getUtxo(
        com.savourrpc.wallet.Wallet.UtxoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUtxoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.savourrpc.wallet.Wallet.MinRentResponse> getMinRent(
        com.savourrpc.wallet.Wallet.MinRentRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMinRentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SUPPORT_COINS = 0;
  private static final int METHODID_GET_NONCE = 1;
  private static final int METHODID_GET_GAS_PRICE = 2;
  private static final int METHODID_SEND_TX = 3;
  private static final int METHODID_GET_BALANCE = 4;
  private static final int METHODID_GET_TX_BY_ADDRESS = 5;
  private static final int METHODID_GET_TX_BY_HASH = 6;
  private static final int METHODID_GET_ACCOUNT = 7;
  private static final int METHODID_GET_UTXO = 8;
  private static final int METHODID_GET_MIN_RENT = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WalletServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SUPPORT_COINS:
          serviceImpl.getSupportCoins((com.savourrpc.wallet.Wallet.SupportCoinsRequest) request,
              (io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.SupportCoinsResponse>) responseObserver);
          break;
        case METHODID_GET_NONCE:
          serviceImpl.getNonce((com.savourrpc.wallet.Wallet.NonceRequest) request,
              (io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.NonceResponse>) responseObserver);
          break;
        case METHODID_GET_GAS_PRICE:
          serviceImpl.getGasPrice((com.savourrpc.wallet.Wallet.GasPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.GasPriceResponse>) responseObserver);
          break;
        case METHODID_SEND_TX:
          serviceImpl.sendTx((com.savourrpc.wallet.Wallet.SendTxRequest) request,
              (io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.SendTxResponse>) responseObserver);
          break;
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((com.savourrpc.wallet.Wallet.BalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.BalanceResponse>) responseObserver);
          break;
        case METHODID_GET_TX_BY_ADDRESS:
          serviceImpl.getTxByAddress((com.savourrpc.wallet.Wallet.TxAddressRequest) request,
              (io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.TxAddressResponse>) responseObserver);
          break;
        case METHODID_GET_TX_BY_HASH:
          serviceImpl.getTxByHash((com.savourrpc.wallet.Wallet.TxHashRequest) request,
              (io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.TxHashResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT:
          serviceImpl.getAccount((com.savourrpc.wallet.Wallet.AccountRequest) request,
              (io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.AccountResponse>) responseObserver);
          break;
        case METHODID_GET_UTXO:
          serviceImpl.getUtxo((com.savourrpc.wallet.Wallet.UtxoRequest) request,
              (io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.UtxoResponse>) responseObserver);
          break;
        case METHODID_GET_MIN_RENT:
          serviceImpl.getMinRent((com.savourrpc.wallet.Wallet.MinRentRequest) request,
              (io.grpc.stub.StreamObserver<com.savourrpc.wallet.Wallet.MinRentResponse>) responseObserver);
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

  private static abstract class WalletServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.savourrpc.wallet.Wallet.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WalletService");
    }
  }

  private static final class WalletServiceFileDescriptorSupplier
      extends WalletServiceBaseDescriptorSupplier {
    WalletServiceFileDescriptorSupplier() {}
  }

  private static final class WalletServiceMethodDescriptorSupplier
      extends WalletServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WalletServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WalletServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WalletServiceFileDescriptorSupplier())
              .addMethod(getGetSupportCoinsMethod())
              .addMethod(getGetNonceMethod())
              .addMethod(getGetGasPriceMethod())
              .addMethod(getSendTxMethod())
              .addMethod(getGetBalanceMethod())
              .addMethod(getGetTxByAddressMethod())
              .addMethod(getGetTxByHashMethod())
              .addMethod(getGetAccountMethod())
              .addMethod(getGetUtxoMethod())
              .addMethod(getGetMinRentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
