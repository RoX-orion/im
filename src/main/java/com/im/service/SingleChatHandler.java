package com.im.service;

import com.im.lib.core.NettyServerHandler;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelId;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import io.netty.util.concurrent.GlobalEventExecutor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class SingleChatHandler extends SimpleChannelInboundHandler<TextWebSocketFrame> {

    private static final Logger logger = LoggerFactory.getLogger(NettyServerHandler.class);
    /**
     * 管理全局的channel
     * GlobalEventExecutor.INSTANCE  全局事件监听器
     * 一旦将channel 加入 ChannelGroup 就不要用手动去
     * 管理channel的连接失效后移除操作，他会自己移除
     */
    private static final ChannelGroup channels = new DefaultChannelGroup(GlobalEventExecutor.INSTANCE);
    /**
     * 为了实现私聊功能，这里key存储用户的唯一标识，channel的id号
     * 当然 这个集合也需要自己去维护 用户的上下线 不能像 ChannelGroup那样自己去维护
     */
    private final static Map<ChannelId, Channel> all = new HashMap<>();

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Resource
    private ChatMessageService chatMessageService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TextWebSocketFrame msg) throws Exception {
        Channel channel = ctx.channel();
//        chatMessageService.addMessage(msg);
        channels.writeAndFlush(new TextWebSocketFrame(msg.text()));
//        channel.writeAndFlush(new TextWebSocketFrame(msg.text()));


        logger.info(channel.id() + ":" + msg.text());
    }

    /**
     * 建立连接以后第一个调用的方法
     */
    @Override
    public synchronized void handlerAdded(ChannelHandlerContext ctx) {
        Channel channel = ctx.channel();
        channels.add(channel);
        all.put(channel.id(), channel);
    }
    /**
     * channel连接状态就绪以后调用
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        String address = ctx.channel().remoteAddress().toString();
        logger.info(dateFormat.format(new Date())+":[用户] "+address+" 上线 " + " : " + all.size());
    }

    /**
     * channel连接状态断开后触发
     */
    @Override
    public synchronized void channelInactive(ChannelHandlerContext ctx) {
        String address = ctx.channel().remoteAddress().toString();
        logger.info(dateFormat.format(new Date())+":[用户] "+address+" 下线 ");
        ChannelId id = ctx.channel().id();
        all.remove(id);
    }

    /**
     * 连接发生异常时触发
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        logger.error("连接发生异常！");
        cause.printStackTrace();
        ctx.close();
    }

    /**
     * 断开连接会触发该消息
     * 同时当前channel 也会自动从ChannelGroup中被移除
     */
    @Override
    public void handlerRemoved(ChannelHandlerContext ctx) {
        logger.info("当前在线人数是:"+channels.size() + " | all："+all.size());
    }
}
