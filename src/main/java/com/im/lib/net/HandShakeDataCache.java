package com.im.lib.net;

import com.github.benmanes.caffeine.cache.Cache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.stereotype.Component;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-13
 */

@Component
public class HandShakeDataCache {

    private final Cache<String, Object> caffeineCache;

    public HandShakeDataCache() {
        caffeineCache = Caffeine.newBuilder()
                .expireAfterWrite(10, TimeUnit.MINUTES)
                .build();
    }

    public void store(String key, Object value) {
        caffeineCache.put(key, value);
    }

    public boolean hasKey(String key) {
        return caffeineCache.getIfPresent(key) != null;
    }

    public Object get(String key) {
        return caffeineCache.getIfPresent(key);
    }

    public void removeKey(String key) {
        caffeineCache.invalidate(key);
    }

    public ConcurrentMap<String, Object> getKeyValueMap() {
        return caffeineCache.asMap();
    }
}
