package com.im.utils;

import com.im.config.Constant;
import com.im.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.channel.ChannelId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

//import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Component
public class ChatUtil {

    private static StringRedisTemplate stringRedisTemplate;

    @Autowired
    public void setStringRedisTemplate(StringRedisTemplate stringRedisTemplate) {
        ChatUtil.stringRedisTemplate = stringRedisTemplate;
    }

    public static User getUserFromCache(ChannelId channelId) {
        try {
            String uid = stringRedisTemplate.opsForValue().get(Constant.CHANNEL_ID_UID + channelId);
            return new ObjectMapper().readValue(stringRedisTemplate.opsForValue().get(Objects.requireNonNull(String.valueOf(uid))), User.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

//    public static User getUserInfo(HttpServletRequest request) {
//        try {
//            return new ObjectMapper().readValue(request.getAttribute("userInfo").toString(), User.class);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
