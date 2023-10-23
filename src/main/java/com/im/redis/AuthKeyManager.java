package com.im.redis;

import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-07-16
 */

@Component
public class AuthKeyManager {

    private final StringRedisTemplate stringRedisTemplate;

    private final String AUTH_KEY_USER_ID = "authKey-userId:";

    public AuthKeyManager(final StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    public void setAuthKeyUserId(long authKeyId, long userId) {
        stringRedisTemplate.opsForValue()
                .set(AUTH_KEY_USER_ID + authKeyId, String.valueOf(userId));
    }

    public boolean hasRegister(long authKeyId) {
        String userId = stringRedisTemplate.opsForValue()
                .get(AUTH_KEY_USER_ID + authKeyId);
        return StringUtils.hasText(userId);
    }
}
