package com.im.lib.net;

import com.im.lib.entity.MsgInfo;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;
import java.math.BigInteger;

/**
 * Copyright (c) 2022 Aix Lina. All rights reserved.
 *
 * @author: Aix Lina
 * @date: 2023-01-04
 */

public class TransportManager {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    public void setMsgInfo(BigInteger authKeyId, MsgInfo msgInfo) {
        String key = "authKeyId-msgInfo:" + authKeyId.toString();
        stringRedisTemplate.opsForHash().put(key, "msgId", msgInfo.getMsgId());
        stringRedisTemplate.opsForHash().put(key, "seqNo", msgInfo.getSeqNo());
        stringRedisTemplate.opsForHash().put(key, "salt", msgInfo.getSalt());
    }

    public void setChannel() {

    }

    public void removeChannelIdAuthKeyId(String channelId) {
        stringRedisTemplate.delete("channelId-authKeyId:" + channelId);
    }
}
