package com.hailstone.grpc.service;

import com.savourrpc.market.Market;
import com.savourrpc.market.PriceServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import savourrpc.Common;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class MarketServiceClient {

    private static final Logger logger = Logger.getLogger(MarketServiceClient.class.getName());

    private final ManagedChannel channel;
    private final PriceServiceGrpc.PriceServiceBlockingStub blockingStub;


    public MarketServiceClient(String host, int port){
        this(ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build());
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public MarketServiceClient(ManagedChannel channel) {
        this.channel = channel;
        this.blockingStub = PriceServiceGrpc.newBlockingStub(channel);
    }

    public List<Market.Symbol> getSymbols(String token) {
        Market.SymbolRequest request = Market.SymbolRequest.newBuilder().setConsumerToken(token).build();
        Market.SymbolResponse response;
        try {
            response = blockingStub.getSymbols(request);
        } catch (StatusRuntimeException e) {
            logger.warning(e.getMessage());
            return null;
        }

        if (response.getError().getCode() == Common.ReturnCode.SUCCESS) {
            List<Market.Symbol> list = response.getSymbolsList();
            return list;
        } else if (response.getError().getCode() == Common.ReturnCode.ERROR){
            logger.warning("GRPC Return Error Brief: " + response.getError().getBrief());
        } else {
            // do nothing
        }

        return null;
    }

    public List<Market.SymbolPrice> getSymbolPrices(String token, String symbolId) {
        Market.SymbolPriceRequest request = Market.SymbolPriceRequest.newBuilder().
                setConsumerToken(token).
                setSymbolId(symbolId).build();;
        Market.SymbolPriceResponse response;
        try {
            response = blockingStub.getSymbolPrices(request);
        } catch (StatusRuntimeException e) {
            logger.warning(e.getMessage());
            return null;
        }

        if (response.getError().getCode() == Common.ReturnCode.SUCCESS) {
            List<Market.SymbolPrice> list = response.getSymbolPricesList();
            return list;
        } else if (response.getError().getCode() == Common.ReturnCode.ERROR){
            logger.warning("GRPC Return Error Brief: " + response.getError().getBrief());
        } else {
            // do nothing
        }

        return null;
    }

    public List<Market.StableCoin> getStableCoins(String token) {
        Market.StableCoinRequest request = Market.StableCoinRequest.newBuilder().
                setConsumerToken(token).build();;
        Market.StableCoinResponse response;
        try {
            response = blockingStub.getStableCoins(request);
        } catch (StatusRuntimeException e) {
            logger.warning(e.getMessage());
            return null;
        }

        if (response.getError().getCode() == Common.ReturnCode.SUCCESS) {
            List<Market.StableCoin> list = response.getStableCoinsList();
            return list;
        } else if (response.getError().getCode() == Common.ReturnCode.ERROR){
            logger.warning("GRPC Return Error Brief: " + response.getError().getBrief());
        } else {
            // do nothing
        }

        return null;
    }

    public List<Market.StableCoinPrice> getStableCoinPrice(String token, String coinId) {
        Market.StableCoinPriceRequest request = Market.StableCoinPriceRequest.newBuilder().
                setConsumerToken(token).
                setCoinId(coinId).build();;
        Market.StableCoinPriceResponse response;
        try {
            response = blockingStub.getStableCoinPrice(request);
        } catch (StatusRuntimeException e) {
            logger.warning(e.getMessage());
            return null;
        }

        if (response.getError().getCode() == Common.ReturnCode.SUCCESS) {
            List<Market.StableCoinPrice> list = response.getCoinPricesList();
            return list;
        } else if (response.getError().getCode() == Common.ReturnCode.ERROR){
            logger.warning("GRPC Return Error Brief: " + response.getError().getBrief());
        } else {
            // do nothing
        }

        return null;
    }

}