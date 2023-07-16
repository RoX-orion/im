package com.im.redis;

import com.im.lib.net.ChannelManager;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-02-12
 */

@Component
public class SessionManager {

    private final StringRedisTemplate stringRedisTemplate;

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    private final ChannelManager channelManager;

    @Autowired
    public SessionManager(
            final StringRedisTemplate stringRedisTemplate,
            final ChannelManager channelManager) {
        this.stringRedisTemplate = stringRedisTemplate;
        this.channelManager = channelManager;
    }

    public static final String SESSION = "session:";

    private final String TEMP_AUTH_KEY = "tempAuthKey:";

    public static final String AUTH_KEY = "authKey:";

    public final String CHANNEL_SESSION = "channelId-SessionId:";

    public static final String CHANNEL_ID_AUTH_KEY_ID = "channelId-authKeyId:";

    public static final String SESSION_ID = "sessionId";

    public static final String SEQ_NO = "seqNo";

    public static final String SERVER_SALT = "serverSalt";

    public static final String SERVER_SALT_EXPIRE = "expire";

    public static final String IS_LOGIN = "isLogin";

    public static final String READY_LOGIN = "readyLogin";

    public static final String CHANNEL_ID = "channelId";

    public static final String USER_ID = "userId";

    @PostConstruct
    public void deleteInvalidSession() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                List<String> channelSessionList = new ArrayList<>();
                List<String> sessionList = new ArrayList<>();
                ScanOptions scanOptions = ScanOptions.scanOptions()
                        .count(10000)
                        .match(CHANNEL_SESSION + "*")
                        .build();
                try (Cursor<String> cursor = stringRedisTemplate.scan(scanOptions)) {
                    while (cursor.hasNext()) {
                        String key = cursor.next();
                        String channelId = key.substring(CHANNEL_SESSION.length());
                        if (channelManager.hasChannle(channelId)) {
                            continue;
                        }
                        String sessionId = stringRedisTemplate.opsForValue().get(key);
                        channelSessionList.add(key);
                        sessionList.add(SESSION + sessionId);
                    }
                    stringRedisTemplate.unlink(channelSessionList);
                    stringRedisTemplate.unlink(sessionList);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 1, 1000 * 30); // 30s
    }

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
        Object readyLogin = this.getSessionInfo(String.valueOf(sessionId), READY_LOGIN);
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
