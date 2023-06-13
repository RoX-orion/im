package com.im.lib.core;

import com.im.lib.entity.RequestData;
import com.im.lib.entity.WsApiResult;
import com.im.lib.net.ChannelManager;
import com.im.lib.net.DispatcherWebsocket;
import com.im.lib.net.MTProto;
import com.im.redis.SessionManager;
import io.netty.buffer.ByteBuf;
import io.netty.channel.*;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

@Component
@Slf4j
@ChannelHandler.Sharable
public class BinaryWebSocketFrameHandler extends SimpleChannelInboundHandler<BinaryWebSocketFrame> {


    @Resource
    private ChannelManager channelManager;

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Resource
    private DispatcherWebsocket dispatcherWebsocket;

    @Resource
    private MTProto mtproto;

    @Resource
    private SessionManager sessionManager;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, BinaryWebSocketFrame binaryWebSocketFrame) {
        Channel channel = ctx.channel();
        ByteBuf byteBuf = binaryWebSocketFrame.content();
        int length = byteBuf.readableBytes();
        int[] unsignedInt8Array = new int[length];
        for (int i = 0; i < length; i++) {
            byte b = byteBuf.readByte();
            unsignedInt8Array[i] = b & 0xFF;
        }
        System.out.println("接收到的字节数组: " + length + Arrays.toString(unsignedInt8Array));

        WsApiResult response = null;
        try {
            byteBuf.resetReaderIndex();
            RequestData requestData = mtproto.getRequestData(byteBuf, channel);

            response = dispatcherWebsocket.dispatcherRequest(requestData, channel);
        } catch (Exception e){
            e.printStackTrace();
        }
        try {
            mtproto.sendData(response, channel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 建立连接以后第一个调用的方法
     */
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) {
        Channel channel = ctx.channel();
        channelManager.setChannel(channel);
    }

    /**
     * channel连接状态就绪以后调用
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        String address = ctx.channel().remoteAddress().toString();
        log.info(dateFormat.format(new Date()) + ":[用户] " + address + " 上线 " + " : " + channelManager.size());
    }

    /**
     * channel连接状态断开后触发
     */
    @Override
    public void channelInactive(ChannelHandlerContext ctx) {
        String address = ctx.channel().remoteAddress().toString();
        log.info(dateFormat.format(new Date()) + ":[用户] " + address + " 下线 ");
        ChannelId id = ctx.channel().id();
        sessionManager.removeTempSessionInfo(id.asLongText());
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
        log.info("当前在线人数是:" + channelManager.size() + " | all:" + channelManager.size());
    }
}
