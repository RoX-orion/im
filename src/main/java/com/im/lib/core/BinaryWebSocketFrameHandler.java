package com.im.lib.core;

import com.im.lib.Helpers;
import com.im.lib.entity.RequestData;
import com.im.lib.entity.WsApiResult;
import com.im.lib.net.*;
import com.im.lib.tl.TLHelpers;
import com.im.service.ChatService;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.PooledByteBufAllocator;
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
    private MTProto MTProto;

    @Resource
    private SerializeResponse serializeResponse;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private MTProtoStateService mtProtoStateService;

    @Resource
    private TCPAbridged tcpAbridged;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, BinaryWebSocketFrame binaryWebSocketFrame) throws NoSuchFieldException, IllegalAccessException {
        Channel channel = ctx.channel();
        ByteBuf byteBuf = binaryWebSocketFrame.content();
        int length = byteBuf.readableBytes();
//        byte[] bytes = new byte[length];
        int[] unsignedInt8Array = new int[length];
        for (int i = 0; i < length; i++) {
            byte b = byteBuf.readByte();
//            bytes[i] = b;
            unsignedInt8Array[i] = b & 0xFF;
        }
        System.out.println("接收到的字节数组: " + length + Arrays.toString(unsignedInt8Array));

        WsApiResult response = null;
        try {
            byteBuf.resetReaderIndex();
            RequestData requestData = MTProto.getRequestData(byteBuf, channel);

            response = dispatcherWebsocket.dispatcherRequest(requestData, channel);
        } catch (Exception e){
            e.printStackTrace();
//            WsApiResult error = WsApiResult.error();
//            encryptResponse(error, channel);
        }

        writeResponse(response, channel);
    }

    private void writeResponse(WsApiResult response, Channel channel) throws NoSuchFieldException, IllegalAccessException {
        System.out.println(response);

//            if (!data.getConstructorId() == ) {
//                System.out.println("返回未加密二进制数据: " + data /*Arrays.toString(objectMapper.writeValueAsBytes(WsApiResult.ok("ping", null)))*/);
//            }
        int constructorId = response.getConstructorId();

        ByteBuf buffer = PooledByteBufAllocator.DEFAULT.buffer();
        serializeResponse.serialize(buffer, constructorId, response);
        Helpers.printByteBuf(buffer);
        ByteBuf byteBuf = tcpAbridged.encodePacket(buffer);
        Helpers.printByteBuf(byteBuf);
        channel.writeAndFlush(new BinaryWebSocketFrame(byteBuf));

//        if (TLHelpers.AUTH_KEY_TYPES.contains(constructorId)) {
//
//            buffer = buffer.readBytes(buffer.readableBytes());
//            System.out.println(buffer.capacity());
//            Helpers.printByteBuf(buffer);
//            buffer.resetReaderIndex();
//            channel.writeAndFlush(new BinaryWebSocketFrame(buffer));
//        } else {
//            System.out.println("加密");
//        }
//            if (!data.getType().equals("dh")) {
//                byte[] authKey = Helpers.hexStringToByteArray(
//                        Objects.requireNonNull(stringRedisTemplate.opsForValue().get(Constant.CHANNEL_ID_AUTH_KEY + channel.id().asShortText()))
//                );
//                System.out.println("未加密字节数组:" + resp.length + Arrays.toString(resp));
//                resp = mtProtoStateService.encryptData(resp, authKey);
//                System.out.println("返回加密密文: " + resp.length + Arrays.toString(resp));
//                ByteBuf binaryData = Unpooled.wrappedBuffer(resp);
//                channel.writeAndFlush(new BinaryWebSocketFrame(binaryData));
//            } else {
//                WriteData.write(channel, response);
//            }
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
