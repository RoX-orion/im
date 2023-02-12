package com.im.lib.core;

import io.netty.channel.Channel;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentHashMap;

@Component
public class ChannelManager {
    /**
     * 为了实现私聊功能，这里key存储用户的唯一标识，channel的id号
     * 当然 这个集合也需要自己去维护 用户的上下线 不能像 ChannelGroup那样自己去维护
     */
    private ConcurrentHashMap<String, Channel> channels = new ConcurrentHashMap<>();

    public void addChannel(String channelId, Channel channel) {
        channels.put(channelId, channel);
    }

    public Channel getChannel(String channelId) {
        return channels.get(channelId);
    }

    public void removeChannel(String channelId) {
        channels.remove(channelId);
    }

    public int getChannelSize() {
        return channels.size();
    }

    public ConcurrentHashMap<String, Channel> getChannels() {
        return channels;
    }

    public void setChannels(ConcurrentHashMap<String, Channel> channels) {
        this.channels = channels;
    }
}
