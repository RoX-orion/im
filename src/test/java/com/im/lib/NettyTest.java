package com.im.lib;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import io.netty.channel.DefaultChannelId;
import org.junit.Test;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-07-15
 */

public class NettyTest {

    private final ObjectMapper mapper = new ObjectMapper();

    {
        mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    }

    @Test
    public void channelId() throws JsonProcessingException {
        DefaultChannelId defaultChannelId = DefaultChannelId.newInstance();
        String s = mapper.writeValueAsString(defaultChannelId);
        System.out.println(s);
    }
}
