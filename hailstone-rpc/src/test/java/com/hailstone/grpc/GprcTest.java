package com.hailstone.grpc;

import com.hailstone.grpc.service.MarketServiceClient;
import org.junit.Test;

import java.util.List;


public class GprcTest {

    @Test
    public void getSymbolsTest(){
        MarketServiceClient client = new MarketServiceClient("127.0.0.1", 1002);
        try {
            /* Access a service running on the local machine on port 50051 */
            String token = "hello";
            List list = client.getSymbols(token);
            if(list != null) {
                System.out.println(list.size());
            } else {
                System.out.println("获取失败");
            }
        } finally {
            try {
                client.shutdown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}