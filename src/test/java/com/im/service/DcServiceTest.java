package com.im.service;

import com.im.api.Api;
import org.junit.Test;

import java.util.Optional;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-18
 */

//@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
public class DcServiceTest {

    @Test
    public void dc() {
        Api.ForumTopicDeleted forumTopicDeleted = new Api.ForumTopicDeleted();
        Integer integer = Optional.ofNullable(forumTopicDeleted)
                .map(Api.ForumTopicDeleted::getId)
                .orElse(10);
        System.out.println(integer);
    }
}
