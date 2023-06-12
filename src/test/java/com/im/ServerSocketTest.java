package com.im;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-05
 */

@Slf4j
public class ServerSocketTest {

    @Test
    public void serverSocket() throws IOException {
        ServerSocket serverSocket = new ServerSocket(45645);
        log.info("服务器启动...");
        while (true) {
            Socket accept = serverSocket.accept();
            log.info("客户端连接: " + accept.getRemoteSocketAddress().toString());
        }
    }
}
