package com.im.lib.core;

import com.im.service.DcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-19
 */

@Configuration
public class StartUp implements ApplicationRunner {

    private final DcService dcService;

    @Autowired
    public StartUp(final DcService dcService) {
        this.dcService = dcService;
    }

    @Override
    public void run(ApplicationArguments args) {
//        dcService.initDcOptions();
    }
}
