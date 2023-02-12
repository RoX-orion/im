package com.im.lib.core;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.im.service.ChatService;
import io.netty.channel.*;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Copyright (c) 2021 RoX-orion. All rights reserved.
 *
 * @author RoX-orion
 * @date 2021-02-18
 * @since 1.0.0
 */

@Component
@Slf4j
@ChannelHandler.Sharable
public class NettyServerHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    /**
     * 管理全局的channel
     * GlobalEventExecutor.INSTANCE  全局事件监听器
     * 一旦将channel 加入 ChannelGroup 就不要用手动去
     * 管理channel的连接失效后移除操作，他会自己移除
     */
    private static final ChannelGroup channels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Resource
    private ChannelManager channelManager;

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Resource
    private ChatService chatService;

    /**
     * 处理收到的消息
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws JsonProcessingException {
//        Channel channel = ctx.channel();
//        log.info(msg.text());
//        Object response = null;
//        String request = msg.text();
//
//        try {
//            RequestData requestData = parseParameter.getRequestData(request, channel);
////        logger.info("{}", requestData);
//            if (!requestData.getType().equals("ping")) {
//                System.out.println(requestData);
//            }
//
//            response = dispatcherWebsocket.dispatcherRequest(requestData, channel);
//
//        } catch (Exception e){
//            e.printStackTrace();
//            WriteData.write(channel, WsApiResult.error());
//        }

//        if (response != null) {
//            if (response instanceof WsApiResult data && !data.getType().equals("ping")) {
//                System.out.println("返回数据: " + data /*Arrays.toString(objectMapper.writeValueAsBytes(WsApiResult.ok("ping", null)))*/);
//            }
//            WriteData.write(channel, response);
//        }
    }

    /**
     * 建立连接以后第一个调用的方法
     */
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) {
        Channel channel = ctx.channel();
        channels.add(channel);
        channelManager.addChannel(channel.id().asLongText(), channel);
    }

    /**
     * channel连接状态就绪以后调用
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        String address = ctx.channel().remoteAddress().toString();
        log.info(dateFormat.format(new Date()) + ":[用户] " + address + " 上线 " + " : " + channelManager.getChannelSize());
    }

    /**
     * channel连接状态断开后触发
     */
    @Override
    public void channelInactive(ChannelHandlerContext ctx) {
        String address = ctx.channel().remoteAddress().toString();
        log.info(dateFormat.format(new Date()) + ":[用户] " + address + " 下线 ");
        ChannelId id = ctx.channel().id();
        chatService.offline(id);
        channelManager.removeChannel(id.asLongText());
    }

    /**
     * 连接发生异常时触发
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        log.error("连接发生异常！");
        cause.printStackTrace();
        ctx.close();
    }

    /**
     * 断开连接会触发该消息
     * 同时当前channel 也会自动从ChannelGroup中被移除
     */
    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) {
        log.info("当前在线人数是:" + channels.size() + " | all:" + channelManager.getChannelSize());
    }
}

