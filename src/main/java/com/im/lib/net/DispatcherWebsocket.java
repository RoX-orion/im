package com.im.lib.net;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.im.lib.entity.HandlerMeta;
import com.im.lib.entity.RequestData;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.lib.annotation.WebsocketRequestParam;
import com.im.lib.exception.WebsocketHandlerMappingException;
import io.netty.channel.Channel;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class DispatcherWebsocket implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    private final Map<Long, HandlerMeta> handlerContainer = new ConcurrentHashMap<>();

    private final BindParam bindParam = new BindParam();

    @PostConstruct
    public void setHandlerContainer() {
        Map<String, Object> websocketHandler = applicationContext.getBeansWithAnnotation(WebsocketHandler.class);
        for(Map.Entry<String, Object> entry : websocketHandler.entrySet()) {
            Class<?> clazz = entry.getValue().getClass();
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                WebsocketHandlerMapping websocketHandlerMappingAnnotation = method.getDeclaredAnnotation(WebsocketHandlerMapping.class);
                if (websocketHandlerMappingAnnotation != null) {
                    long mapping = websocketHandlerMappingAnnotation.value();
                    if (handlerContainer.get(mapping) != null) {
                        throw new WebsocketHandlerMappingException("mapping:" + mapping + " ????????????");
                    }
                    HandlerMeta handlerMeta = new HandlerMeta();
                    handlerMeta.setClazz(clazz);
                    handlerMeta.setMethod(method);
                    handlerMeta.setHandlerObject(entry.getValue());
                    handlerContainer.put(mapping, handlerMeta);
                }
            }
        }
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * ??????????????????????????????????????????????????????:
     * 1?????????????????????????????????String????????????????????????
     * 2???????????????????????????????????????
     * ???????????????????????????Channel
     * @param requestData ????????????
     * @param channel Netty channel
     * @return ????????????????????????
     */
    public Object dispatcherRequest(RequestData requestData, Channel channel) throws JsonProcessingException {
        String type = requestData.getType();
        HashMap<String, Object> data = requestData.getData();
        HandlerMeta handlerMeta = handlerContainer.get(type);
        if (handlerMeta == null) {
            throw new WebsocketHandlerMappingException("current websocket request didn't config handler for `" + type + "`!");
        }
        Method method = handlerMeta.getMethod();
        Parameter[] parameters = method.getParameters();
        Object handlerObject = handlerMeta.getHandlerObject();

        // ?????????????????????????????????String????????????
        boolean param = false;

        for (Parameter parameter : parameters) {
            WebsocketRequestParam websocketRequestParam = parameter.getDeclaredAnnotation(WebsocketRequestParam.class);
            if (websocketRequestParam != null) {
                param = true;
            }
        }
        // ????????????????????????
        if (param) {
            Object[] methodParams = bindParam.bind(parameters, data, channel);
            if (!type.equals("ping")) {
                System.out.println(Arrays.toString(methodParams));
            }

            return invokeParamHandler(method, handlerObject, methodParams);
        } else {// ??????????????????
            LinkedList<Object> dataParam = bindParam.bindData(parameters, data, channel);
            if (dataParam.size() == 0 || dataParam.size() > 2) {
                throw new WebsocketHandlerMappingException("??????????????????");
            }
            Object[] invokeParam = new Object[dataParam.size()];
            for (int i = 0; i < dataParam.size(); i++) {
                invokeParam[i] = dataParam.get(i);
            }

            return invokeDataHandler(invokeParam, method, handlerObject);
        }
    }

    public static <T> T get(Class<T> clz,Object o){
        if(clz.isInstance(o)){
            return clz.cast(o);
        }
        return null;
    }

    /**
     * ????????????????????????????????????
     * @param dataParam ????????????:Object[]
     * @param method ??????????????????
     * @param handlerObject ?????????handler??????
     */
    public Object invokeDataHandler(Object[] dataParam, Method method, Object handlerObject) {
        try {
            return method.invoke(handlerObject, dataParam);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    public Object invokeParamHandler(Method method, Object handlerObject, Object[] methodParams) {
        try {
            return method.invoke(handlerObject, methodParams);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
