package com.im.redis;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-09-28
 */

public record UserInfoCache(
        long userId,
        String username) {
}
