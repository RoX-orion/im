package com.im.lib.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.im.config.Constant;
import com.im.lib.Helpers;
import com.im.lib.entity.RequestData;
import com.im.lib.entity.WsApiResult;
import com.im.lib.net.DispatcherWebsocket;
import com.im.lib.net.ParseParameter;
import com.im.lib.net.WriteData;
import com.im.service.ChatService;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

@Component
@Slf4j
@ChannelHandler.Sharable
public class BinaryWebSocketFrameHandler extends SimpleChannelInboundHandler<BinaryWebSocketFrame> {

    /**
     * 管理全局的channel
     * GlobalEventExecutor.INSTANCE  全局事件监听器
     * 一旦将channel 加入 ChannelGroup 就不要用手动去
     * 管理channel的连接失效后移除操作，他会自己移除
     */
    private static final ChannelGroup channels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);

    @Resource
    private ServerContext serverContext;

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Resource
    private ChatService chatService;

    @Resource
    private DispatcherWebsocket dispatcherWebsocket;

    @Resource
    private ParseParameter parseParameter;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private MTProtoStateService mtProtoStateService;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, BinaryWebSocketFrame binaryWebSocketFrame) throws JsonProcessingException {
        Channel channel = ctx.channel();
        ByteBuf byteBuf = binaryWebSocketFrame.content();
        int length = byteBuf.capacity();
        byte[] bytes = new byte[length];
        for (int i = 0; i < length; i++) {
            byte b = byteBuf.readByte();
            bytes[i] = b;
        }
        System.out.println("接收到的字节数组: " + bytes.length + Arrays.toString(bytes));

        Object response = null;
        try {
            RequestData requestData = parseParameter.getRequestData(bytes, channel);

            response = dispatcherWebsocket.dispatcherRequest(requestData, channel);

        } catch (Exception e){
            e.printStackTrace();
            WsApiResult error = WsApiResult.error();
            encryptResponse(error, channel);
        }

        encryptResponse(response, channel);
    }

    private void encryptResponse(Object response, Channel channel) throws JsonProcessingException {
        if (response instanceof WsApiResult data) {
            if (!data.getType().equals("ping")) {
                System.out.println("返回未加密二进制数据: " + data /*Arrays.toString(objectMapper.writeValueAsBytes(WsApiResult.ok("ping", null)))*/);
            }
            ObjectMapper objectMapper = new ObjectMapper();
            byte[] resp = objectMapper.writeValueAsBytes(data);
            if (!data.getType().equals("dh")) {
                byte[] authKey = Helpers.hexStringToByteArray(
                        Objects.requireNonNull(stringRedisTemplate.opsForValue().get(Constant.CHANNEL_ID_AUTH_KEY + channel.id().asShortText()))
                );
                System.out.println("未加密字节数组:" + resp.length + Arrays.toString(resp));
                resp = mtProtoStateService.encryptData(resp, authKey);
                System.out.println("返回加密密文: " + resp.length + Arrays.toString(resp));
                ByteBuf binaryData = Unpooled.wrappedBuffer(resp);
                channel.writeAndFlush(new BinaryWebSocketFrame(binaryData));
            } else {
                WriteData.write(channel, response);
            }
        }
    }

    /**
     * 建立连接以后第一个调用的方法
     */
    @Override
    public void handlerAdded(ChannelHandlerContext ctx) {
        Channel channel = ctx.channel();
        channels.add(channel);
        serverContext.addChannel(channel.id().asShortText(), channel);
    }

    /**
     * channel连接状态就绪以后调用
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        String address = ctx.channel().remoteAddress().toString();
        log.info(dateFormat.format(new Date()) + ":[用户] " + address + " 上线 " + " : " + serverContext.getChannelSize());
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
        serverContext.removeChannel(id.asShortText());
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
        log.info("当前在线人数是:" + channels.size() + " | all:" + serverContext.getChannelSize());
    }
}
