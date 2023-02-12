package com.im.service;

import com.im.entity.UserGroup;
import com.im.lib.Constant;
import com.im.lib.core.ChannelManager;
import com.im.lib.entity.WsApiResult;
import com.im.lib.net.WriteData;
import io.netty.channel.Channel;
import io.netty.channel.ChannelId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

@Service
public class SendMessageService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Resource
    private ChannelManager channelManager;


    @Async
    public void sendGroupMessage(UserGroup userGroup, ChannelId id, WsApiResult response) {
        Long uid = userGroup.getUid();
        String state = stringRedisTemplate.opsForValue().get(Constant.USER + uid);
        if (Objects.equals(state, Constant.ONLINE)) {// 在线
            String channelId = stringRedisTemplate.opsForValue().get(Constant.UID_CHANNEL_ID + uid);
            if (channelId != null && !channelId.equals(id.asShortText())) {// 不为null并且不是自己
                Channel channel = channelManager.getChannel(channelId);
                WriteData.write(channel, response);
            }
        }
    }
}
