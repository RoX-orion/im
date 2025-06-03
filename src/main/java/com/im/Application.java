package com.im;

import com.im.lib.net.NettyServer;
import jakarta.annotation.Resource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableCaching
@SpringBootApplication
public class Application {

    private static NettyServer nettyServer;

    @Resource
    public void setNettyService(NettyServer nettyServer) {
        Application.nettyServer = nettyServer;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

        new Thread(nettyServer).start();
    }
}
