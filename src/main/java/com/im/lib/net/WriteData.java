package com.im.lib.net;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.channel.Channel;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;

public class WriteData {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public synchronized static void write(Channel channel, Object data) {
        try {
            if (channel != null) {
                String s = objectMapper.writeValueAsString(data);
                channel.writeAndFlush(new TextWebSocketFrame(s));
            }
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
