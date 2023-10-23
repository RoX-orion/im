package com.im;

import com.datastax.driver.core.Session;
import com.datastax.driver.mapping.Mapper;
import com.datastax.driver.mapping.MappingManager;
import com.im.lib.entity.ConnectSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-23
 */

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ScylladbTest {

    @Autowired
    private Session session;

    @Test
    public void client() {
        MappingManager mappingManager = new MappingManager(session);
        Mapper<ConnectSession> mapper = mappingManager.mapper(ConnectSession.class);
//        ConnectSession connectSession = new ConnectSession();
//        connectSession.setUuid(UUID.fromString("51e893e5-c4f2-4d31-9dd5-f011a0f7d812"));
//        connectSession.setSessionId(1L);
//        connectSession.setChannelId("bbbbb");
//        mapper.save(connectSession);

        ConnectSession connectSession = mapper.get(UUID.fromString("51e893e5-c4f2-4d31-9dd5-f011a0f7d812"));
        connectSession.setChannelId(null);
        connectSession.setExpire(1121212);

        mapper.save(connectSession);
//        mapper.
    }
}
