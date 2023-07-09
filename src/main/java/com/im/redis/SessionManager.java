package com.im.redis;

import com.im.lib.entity.SessionInfo;
import com.im.lib.storage.JacksonSerialize;
import jakarta.annotation.Resource;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-02-12
 */

@Component
public class SessionManager {

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Resource
    private RedisTemplate<String, SessionInfo> redisTemplate;

    public static final String SESSION = "session:";

    private final String TEMP_AUTH_KEY = "tempAuthKey:";

    public static final String AUTH_KEY = "authKey:";

    public final String CHANNEL_SESSION = "channelId-SessionId:";

    public static final String CHANNEL_ID_AUTH_KEY_ID = "channelId-authKeyId:";

    public void setAuthKey(String authKeyId, String authKey, boolean isTempKey) {
        String key = AUTH_KEY + authKeyId;
        if (isTempKey) {
            stringRedisTemplate.opsForValue().set(key, authKey, 30, TimeUnit.MINUTES);
        } else {
            stringRedisTemplate.opsForValue().set(key, authKey);
        }
    }

    public String getAuthKey(String authKeyId) {
        return stringRedisTemplate.opsForValue().get(AUTH_KEY + authKeyId);
    }

    public boolean setUserAuthKey(String authKey, long userId) {
        if (Boolean.FALSE.equals(stringRedisTemplate.hasKey(TEMP_AUTH_KEY + authKey))) {
            return false;
        }
        stringRedisTemplate.opsForZSet()
                .add(AUTH_KEY + userId, authKey, System.currentTimeMillis());
        return true;
    }

    public SessionInfo getMsgInfo(String authKeyId, long sessionId) {
        Object o = stringRedisTemplate
                .opsForHash()
                .get(SESSION + authKeyId, String.valueOf(sessionId));

        return JacksonSerialize.getObject(String.valueOf(o), SessionInfo.class);
    }

    public void setSessionId(String authKeyId,long sessionId, SessionInfo sessionInfo) {
//        stringRedisTemplate
//                .opsForList()
//                .rightPush(AUTH_KEY_ID_SESSION_ID + authKeyId.toString(), String.valueOf(sessionId));
        stringRedisTemplate
                .opsForHash()
                .put(SESSION + authKeyId, String.valueOf(sessionId), Objects.requireNonNull(JacksonSerialize.getObjectString(sessionInfo)));
    }

    public boolean hasSession(String sessionId) {
        return Boolean.TRUE.equals(redisTemplate.hasKey(SESSION + sessionId));
    }

    public void removeSessionId(String authKeyId, long sessionId) {
        redisTemplate
                .opsForHash()
                .delete(SESSION + authKeyId, String.valueOf(sessionId));

//        redisTemplate.opsForZSet().remove(AUTH_KEY_ID_SESSION_ID + authKeyId.toString(), sessionId);
    }

    public void setSessionInfo(String sessionId, String hashKey, Object value) {
        redisTemplate
                .opsForHash()
                .put(SESSION + sessionId, hashKey, value);
    }

    public Object getSessionInfo(String sessionId, String hashKey) {
        return redisTemplate
                .opsForHash()
                .get(SESSION + sessionId, hashKey);
    }

    /**
     *
     */
    public void removeSessionInfo(String channelId) {
        long sessionId = getSessionIdByChannelId(channelId);
        Object readyLogin = this.getSessionInfo(String.valueOf(sessionId), SessionInfo.READY_LOGIN);
        if (readyLogin == null)
            return;
        if (!(boolean)readyLogin) {
            redisTemplate.delete(SESSION + sessionId);
        }
    }

    public long getSessionIdByChannelId(String channelId) {
        String s = stringRedisTemplate.opsForValue()
                .get(CHANNEL_SESSION + channelId);
        if (s != null) {
            return Long.parseLong(s);
        }
        return 0;
    }

    public void setSessionId(String channelId, long sessionId) {
        stringRedisTemplate.opsForValue()
                .set(CHANNEL_SESSION + channelId, String.valueOf(sessionId));
    }

    public void removeSessionIdByChannelId(String channelId) {
        stringRedisTemplate.delete(CHANNEL_SESSION + channelId);
    }

    public void destroySessionInfo(String channelId) {

        removeSessionInfo(channelId);
        removeSessionIdByChannelId(channelId);
    }

    public void setUserIdAuthKeyId(long userId) {

    }
}
