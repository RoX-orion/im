package com.im.controller;

import com.im.lib.net.HandShakeDataCache;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-14
 */

@RestController
public class TestController {

    @Resource
    private HandShakeDataCache handShakeDataCache;

    @RequestMapping("handshake/data")
    public Object getKeyValueMap() {
        return handShakeDataCache.getKeyValueMap();
    }
}
