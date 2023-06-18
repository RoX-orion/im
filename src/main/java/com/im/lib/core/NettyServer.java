package com.im.lib.core;

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
 * Copyright (c) 2021 RoX-orion. All rights reserved.
 *
 * @author RoX-orion
 * @date 2021-02-18
 * @since 1.0.0
 */

@Slf4j
@Component
public class NettyServer implements Runnable{

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
                    .channel(NioServerSocketChannel.class)//selector建立channel使用的对象
                    .option(ChannelOption.SO_BACKLOG, 128)//boss 等待连接的队列长度
                    .childOption(ChannelOption.SO_KEEPALIVE, true) //设置非阻塞Socket
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) {
                            //从channel中获取pipeline 并往里边添加Handler
                            ChannelPipeline pipeline = ch.pipeline();
                            //HTTP协议支持
                            pipeline.addLast(new HttpServerCodec());//HTTP请求的编解码器
                            pipeline.addLast(new HttpObjectAggregator(65536));//用于将HTTP请求进行封装为FullHttpRequest对象
                            pipeline.addLast(new ChunkedWriteHandler());//处理文件流
                            pipeline.addLast(new WebSocketServerCompressionHandler());
                            //WebSocket协议支持
                            pipeline.addLast(eventExecutorGroup,
                                    new WebSocketServerProtocolHandler("/apiws", "binary", true, 10485760)
                            );
                            pipeline.addLast(binaryWebSocketFrameHandler);
//                            pipeline.addLast(nettyServerHandler);//Netty Server Handler来处理消息
                        }
                    });
            ChannelFuture channelFuture = boot.bind(port).sync();

            channel = channelFuture.channel();
            channelFuture.awaitUninterruptibly();

            channelFuture.addListener(future -> {
                if (future.isSuccess()) {
                    log.info("Netty server is starting");
                }
                if (future.isDone()) {
                    log.info("Netty server started successfully, listen port: " + port);
                }

            });
            //监听channel关闭
            channelFuture.channel().closeFuture().sync();
            channelFuture.addListener(future -> {
                if (future.isCancelled()) {
                    log.info("Netty服务器正在关闭");
                }
                if (future.isCancellable()) {
                    log.info("Netty服务器已关闭");
                }

            });

        } finally {
            if (channel != null) {
                channel.close();
            }
            boss.shutdownGracefully();
            work.shutdownGracefully();
        }
    }

    @Override
    public void run() {
        try {
            init();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

