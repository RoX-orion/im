package com.im.redis;

import com.im.service.ContactsService;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-10-07
 */

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class CacheTest {

    @Resource
    private ContactsService contactsService;

    @Test
    public void userInfoCache() {
        UserInfoCache userInfo = contactsService.getUserInfo(10);
        System.out.println(userInfo);
    }
}
