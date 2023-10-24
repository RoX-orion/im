package com.im.service;

import com.im.redis.UserInfoCache;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-10-07
 */

@Service
public class ContactsService {

    @Cacheable(value = "user-info", key = "#userId")
    public UserInfoCache getUserInfo(long userId) {
        return null;
    }
}
