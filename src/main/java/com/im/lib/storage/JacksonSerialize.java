package com.im.lib.storage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-02-12
 */

public class JacksonSerialize <T> {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String getObjectString(Object t) {
        try {
            return objectMapper.writeValueAsString(t);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static <T> T getObject(String s, Class<T> clazz) {
        try {
            return objectMapper.readValue(s, clazz);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return null;
    }
}
