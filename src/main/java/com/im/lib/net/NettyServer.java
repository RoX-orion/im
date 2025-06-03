package com.im.lib.net;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.codec.http.websocketx.extensions.compression.WebSocketServerCompressionHandler;
import io.netty.handler.stream.ChunkedWriteHandler;
import io.netty.util.concurrent.DefaultEventExecutorGroup;
import io.netty.util.concurrent.EventExecutorGroup;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Copyright (c) 2025 Andre Lina. All rights reserved.
 *
 * @author Andre Lina
 * @date 2021-02-18
 * @since 1.0.0
 */

@Slf4j
@Component
public class NettyServer implements Runnable {

    @Value("${server.netty.port}")
    private Integer port;

    private Channel channel;

    @Resource
    private BinaryWebSocketFrameHandler binaryWebSocketFrameHandler;

    public void init() throws Exception {
        EventLoopGroup boss = new NioEventLoopGroup(1);
        EventLoopGroup work = new NioEventLoopGroup(16);
        final EventExecutorGroup eventExecutorGroup = new DefaultEventExecutorGroup(16);
        try {
            ServerBootstrap boot = new ServerBootstrap();
            boot.group(boss, work)
                    .channel(NioServerSocketChannel.class)
                    .option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) {
                            ChannelPipeline pipeline = ch.pipeline();
                            pipeline.addLast(new HttpServerCodec());
                            pipeline.addLast(new HttpObjectAggregator(65536));
                            pipeline.addLast(new ChunkedWriteHandler());
                            pipeline.addLast(new WebSocketServerCompressionHandler());
                            pipeline.addLast(eventExecutorGroup,
                                    new WebSocketServerProtocolHandler("/apiws", "binary", true, 10485760)
                            );
                            pipeline.addLast(binaryWebSocketFrameHandler);
//                            pipeline.addLast(nettyServerHandler);
                        }
                    });
            ChannelFuture channelFuture = boot.bind(port).sync();

            channelFuture.awaitUninterruptibly();

            channelFuture.addListener(future -> {
                if (future.isSuccess()) {
                    log.info("Netty server is starting");
                }
                if (future.isDone()) {
                    log.info("Netty server started successfully, listen port: " + port);
                }

            });
            channelFuture.channel().closeFuture().sync();
            channelFuture.addListener(future -> {
                if (future.isCancelled()) {
                    log.info("Netty is closing");
                }
                if (future.isCancellable()) {
                    log.info("Netty has closed");
                }

            });

        } finally {
            boss.shutdownGracefully();
            work.shutdownGracefully();
        }
    }

    @Override
    public void run() {
        try {
            init();
        } catch (Exception e) {
            log.error(e.toString());
            System.exit(-1);
        }
    }
}

