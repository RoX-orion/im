package org.gateway;

import jakarta.annotation.Resource;
import org.gateway.net.NettyServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-10-23
 */

@SpringBootApplication
public class WebsocketGateway {

    private static NettyServer nettyServer;

    @Resource
    public void setNettyService(NettyServer nettyServer) {
        WebsocketGateway.nettyServer = nettyServer;
    }
    public static void main(String[] args) {
        SpringApplication.run(WebsocketGateway.class, args);

        new Thread(nettyServer).start();
    }
}
