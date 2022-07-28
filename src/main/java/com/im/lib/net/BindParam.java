package com.im.lib.net;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.im.lib.annotation.WebsocketRequestParam;
import com.im.lib.exception.ParamBindException;
import io.netty.channel.Channel;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.LinkedList;

@Slf4j
public class BindParam {

    public Object[] bind(Parameter[] parameters, Object param, Channel channel) {
        Object[] methodParams = new Object[parameters.length];
        for (int i = 0; i < parameters.length; i++) {
            Class<?> type = parameters[i].getType();
            if (type.isAssignableFrom(Channel.class)) {
                methodParams[i] = channel;
                continue;
            }
            methodParams[i] = castObject(type, param);
        }
        return methodParams;
    }

    /**
     * 将对象转为class类型
     * @param targetClass 目标类型class
     * @param param 待转对象
     */
    public static <T> T castObject(Class<T> targetClass, Object param){
//        if(targetClass.isInstance(param)){
        try {
            return targetClass.cast(param);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
//        }
//        return null;
    }

    public LinkedList<Object> bindData(Parameter[] parameters, HashMap<String, Object> data, Channel channel) {
        LinkedList<Object> dataParam = new LinkedList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        for (Parameter parameter : parameters) {
            if (parameter.getType().isAssignableFrom(Channel.class)) {
                dataParam.add(channel);
            } else {
                try {
                    dataParam.add(objectMapper.readValue(objectMapper.writeValueAsString(data), parameter.getType()));
                } catch (JsonProcessingException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        return dataParam;
    }
}
