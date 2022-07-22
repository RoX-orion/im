package com.im.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public synchronized static <T> T deserialization(String objectString, Class<T> t) {
        try {
            return objectMapper.readValue(objectString, t);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static boolean hasLength(String str) {
        return str != null && str.length() != 0;
    }
}
