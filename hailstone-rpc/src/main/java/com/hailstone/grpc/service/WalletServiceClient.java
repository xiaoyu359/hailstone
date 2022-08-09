package com.hailstone.grpc.service;

import com.savourrpc.market.Market;
import com.savourrpc.wallet.Wallet;
import com.savourrpc.wallet.WalletServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import savourrpc.Common;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class WalletServiceClient {

    private static final Logger logger = Logger.getLogger(MarketServiceClient.class.getName());

    private final ManagedChannel channel;
    private final WalletServiceGrpc.WalletServiceBlockingStub blockingStub;


    public WalletServiceClient(String host, int port){
        this(ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build());
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public WalletServiceClient(ManagedChannel channel) {
        this.channel = channel;
        this.blockingStub = WalletServiceGrpc.newBlockingStub(channel);
    }

    public Boolean getSupportCoins(String token, String chain, String network) {
        Wallet.SupportCoinsRequest request = Wallet.SupportCoinsRequest.newBuilder().
                setConsumerToken(token).setChain(chain).setNetwork(network).build();
        Wallet.SupportCoinsResponse response;
        try {
            response = blockingStub.getSupportCoins(request);
        } catch (StatusRuntimeException e) {
            logger.warning(e.getMessage());
            return null;
        }

        if (response.getError().getCode() == Common.ReturnCode.SUCCESS) {
            boolean support = response.getSupport();
            return support;
        } else if (response.getError().getCode() == Common.ReturnCode.ERROR){
            logger.warning("GRPC Return Error Brief: " + response.getError().getBrief());
        } else {
            // do nothing
        }

        return null;
    }

    public String getNonce(String token, String chain, String coin,
                                         String address, String network) {
        Wallet.NonceRequest request = Wallet.NonceRequest.newBuilder().
                setConsumerToken(token).
                setChain(chain).
                setCoin(coin).
                setAddress(address).
                setNetwork(network).build();
        Wallet.NonceResponse response;
        try {
            response = blockingStub.getNonce(request);
        } catch (StatusRuntimeException e) {
            logger.warning(e.getMessage());
            return null;
        }

        if (response.getError().getCode() == Common.ReturnCode.SUCCESS) {
            String str = response.getNonce();
            return str;
        } else if (response.getError().getCode() == Common.ReturnCode.ERROR){
            logger.warning("GRPC Return Error Brief: " + response.getError().getBrief());
        } else {
            // do nothing
        }

        return null;
    }

    public String getGasPrice(String token, String chain, String coin, String network) {
        Wallet.GasPriceRequest request = Wallet.GasPriceRequest.newBuilder().
                setConsumerToken(token).
                setChain(chain).
                setCoin(coin).
                setNetwork(network).build();
        Wallet.GasPriceResponse response;
        try {
            response = blockingStub.getGasPrice(request);
        } catch (StatusRuntimeException e) {
            logger.warning(e.getMessage());
            return null;
        }

        if (response.getError().getCode() == Common.ReturnCode.SUCCESS) {
            String str = response.getGas();
            return str;
        } else if (response.getError().getCode() == Common.ReturnCode.ERROR){
            logger.warning("GRPC Return Error Brief: " + response.getError().getBrief());
        } else {
            // do nothing
        }

        return null;
    }

    public String sendTx(String token, String chain, String coin, String network,
                                        String rawTx) {
        Wallet.SendTxRequest request = Wallet.SendTxRequest.newBuilder().
                setConsumerToken(token).
                setChain(chain).
                setCoin(coin).
                setNetwork(network).
                setRawTx(rawTx).build();
        Wallet.SendTxResponse response;
        try {
            response = blockingStub.sendTx(request);
        } catch (StatusRuntimeException e) {
            logger.warning(e.getMessage());
            return null;
        }

        if (response.getError().getCode() == Common.ReturnCode.SUCCESS) {
            String str = response.getTxHash();
            return str;
        } else if (response.getError().getCode() == Common.ReturnCode.ERROR){
            logger.warning("GRPC Return Error Brief: " + response.getError().getBrief());
        } else {
            // do nothing
        }

        return null;
    }

    public String getBalance(String token, String chain, String coin, String network,
                                             String address, String contractAddress) {
        Wallet.BalanceRequest request = Wallet.BalanceRequest.newBuilder().
                setConsumerToken(token).
                setChain(chain).
                setCoin(coin).
                setNetwork(network).
                setAddress(address).
                setContractAddress(contractAddress).build();
        Wallet.BalanceResponse response;
        try {
            response = blockingStub.getBalance(request);
        } catch (StatusRuntimeException e) {
            logger.warning(e.getMessage());
            return null;
        }

        if (response.getError().getCode() == Common.ReturnCode.SUCCESS) {
            String str = response.getBalance();
            return str;
        } else if (response.getError().getCode() == Common.ReturnCode.ERROR){
            logger.warning("GRPC Return Error Brief: " + response.getError().getBrief());
        } else {
            // do nothing
        }

        return null;
    }

    public List<Wallet.TxMessage> getTxByAddress(String token, String chain, String coin, String network,
                                                 String address, String contractAddress, int page, int pagesize) {
        Wallet.TxAddressRequest request = Wallet.TxAddressRequest.newBuilder().
                setConsumerToken(token).
                setChain(chain).
                setCoin(coin).
                setNetwork(network).
                setAddress(address).
                setContractAddress(contractAddress).
                setPage(page).setPagesize(pagesize).build();
        Wallet.TxAddressResponse response;
        try {
            response = blockingStub.getTxByAddress(request);
        } catch (StatusRuntimeException e) {
            logger.warning(e.getMessage());
            return null;
        }

        if (response.getError().getCode() == Common.ReturnCode.SUCCESS) {
            List<Wallet.TxMessage> list = response.getTxList();
            return list;
        } else if (response.getError().getCode() == Common.ReturnCode.ERROR){
            logger.warning("GRPC Return Error Brief: " + response.getError().getBrief());
        } else {
            // do nothing
        }

        return null;
    }

    public Wallet.TxMessage getTxByHash(String token, String chain, String coin, String network,
                                        String hash) {
        Wallet.TxHashRequest request = Wallet.TxHashRequest.newBuilder().
                setConsumerToken(token).
                setChain(chain).
                setCoin(coin).
                setNetwork(network).
                setHash(hash).build();
        Wallet.TxHashResponse response;
        try {
            response = blockingStub.getTxByHash(request);
        } catch (StatusRuntimeException e) {
            logger.warning(e.getMessage());
            return null;
        }

        if (response.getError().getCode() == Common.ReturnCode.SUCCESS) {
            Wallet.TxMessage tx = response.getTx();
            return tx;
        } else if (response.getError().getCode() == Common.ReturnCode.ERROR){
            logger.warning("GRPC Return Error Brief: " + response.getError().getBrief());
        } else {
            // do nothing
        }

        return null;
    }

    public Wallet.AccountResponse getAccount(String token, String chain, String coin, String network,
                                             String address) {
        Wallet.AccountRequest request = Wallet.AccountRequest.newBuilder().
                setConsumerToken(token).
                setChain(chain).
                setCoin(coin).
                setNetwork(network).
                setAddress(address).build();
        Wallet.AccountResponse response;
        try {
            response = blockingStub.getAccount(request);
        } catch (StatusRuntimeException e) {
            logger.warning(e.getMessage());
            return null;
        }

        return response;
    }

    public Wallet.UtxoResponse getUtxo(String token, String chain, String coin, String network,
                                             String address) {
        Wallet.UtxoRequest request = Wallet.UtxoRequest.newBuilder().
                setConsumerToken(token).
                setChain(chain).
                setCoin(coin).
                setNetwork(network).
                setAddress(address).build();
        Wallet.UtxoResponse response;
        try {
            response = blockingStub.getUtxo(request);
        } catch (StatusRuntimeException e) {
            logger.warning(e.getMessage());
            return null;
        }

        return response;
    }

    public String getMinRent(String token, String chain, String coin, String network,
                                       String address) {
        Wallet.MinRentRequest request = Wallet.MinRentRequest.newBuilder().
                setConsumerToken(token).
                setChain(chain).
                setCoin(coin).
                setNetwork(network).
                setAddress(address).build();
        Wallet.MinRentResponse response;
        try {
            response = blockingStub.getMinRent(request);
        } catch (StatusRuntimeException e) {
            logger.warning(e.getMessage());
            return null;
        }

        if (response.getError().getCode() == Common.ReturnCode.SUCCESS) {
            String str = response.getValue();
            return str;
        } else if (response.getError().getCode() == Common.ReturnCode.ERROR){
            logger.warning("GRPC Return Error Brief: " + response.getError().getBrief());
        } else {
            // do nothing
        }

        return null;
    }
}