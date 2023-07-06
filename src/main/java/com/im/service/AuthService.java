package com.im.service;

import com.im.lib.Helpers;
import com.im.lib.tl.TLRPC;
import com.im.redis.SessionManager;
import com.im.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-07-01
 */

@Service
public class AuthService {

    private final StringRedisTemplate stringRedisTemplate;

    @Autowired
    public AuthService(final StringRedisTemplate stringRedisTemplate) {
        this.stringRedisTemplate = stringRedisTemplate;
    }

    public TLRPC.TL_auth_loginToken exportLoginToken(TLRPC.TL_auth_exportLoginToken exportLoginToken) {
        TLRPC.TL_auth_loginToken authLoginToken = new TLRPC.TL_auth_loginToken();
//        authLoginToken.token = ;
        authLoginToken.expires = (int) ((System.currentTimeMillis() / 1000) + 30);
        authLoginToken.token = Helpers.getRandomBytes(34);

        return authLoginToken;
    }

    public TLRPC.TL_auth_sentCode sendCode(TLRPC.TL_auth_sendCode sendCode, long authKeyId) {
        String key = SessionManager.AUTH_KEY + authKeyId;
//        stringRedisTemplate.opsForValue().getAndExpire(key, -1, TimeUnit.SECONDS);
        TLRPC.TL_auth_sentCode sentCode = new TLRPC.TL_auth_sentCode();
        byte[] bytes = Helpers.SHA1(sendCode.phone_number.getBytes(StandardCharsets.UTF_8),
                String.valueOf(Helpers.getRandomInt64()).getBytes(StandardCharsets.UTF_8)
        );
        sentCode.phone_code_hash = Helpers.byteArrayToHexString(bytes).substring(0, 18);
        sentCode.type = new TLRPC.TL_auth_sentCodeTypeApp();
        sentCode.timeout = (int) (TimeUtil.getFeatureTimestamp(300000) / 1000);

        return sentCode;
    }
}
