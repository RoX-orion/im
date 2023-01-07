package com.im;

import com.im.lib.core.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.annotation.Resource;

@EnableAsync
@SpringBootApplication
public class Application {
    private static NettyServer nettyServer;

    @Resource
    public void setNettyService(NettyServer nettyServer) {
        Application.nettyServer = nettyServer;
    }

    public static void main(String[] args) throws Exception {
        System.setProperty("druid.mysql.usePingMethod", "false");
        SpringApplication.run(Application.class, args);
        nettyServer.init();
    }
}
