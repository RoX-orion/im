package com.im.lib.net;

import com.im.lib.entity.HandlerMeta;
import com.im.lib.entity.RequestData;
import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.lib.entity.WsApiResult;
import com.im.lib.exception.WebsocketHandlerMappingException;
import io.netty.channel.Channel;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
public class DispatcherWebsocket implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    private final Map<Integer, HandlerMeta> handlerContainer = new ConcurrentHashMap<>();

    private final BindParam bindParam = new BindParam();

    @PostConstruct
    public void setHandlerContainer() {
        Map<String, Object> websocketHandler = applicationContext.getBeansWithAnnotation(WebsocketHandler.class);
        for(String key : websocketHandler.keySet()) {
//            Class<?> clazz = entry.getValue().getClass();
            Object handler = websocketHandler.get(key);
            Class<?> clazz = handler.getClass();
            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                WebsocketHandlerMapping websocketHandlerMappingAnnotation = method.getDeclaredAnnotation(WebsocketHandlerMapping.class);
                if (websocketHandlerMappingAnnotation != null) {
                    int mapping = websocketHandlerMappingAnnotation.value();
                    if (handlerContainer.get(mapping) != null) {
                        throw new WebsocketHandlerMappingException("mapping:" + mapping + " 重复定义");
                    }
                    HandlerMeta handlerMeta = new HandlerMeta();
                    handlerMeta.setClazz(clazz);
                    handlerMeta.setMethod(method);
                    handlerMeta.setHandlerObject(handler);
                    handlerContainer.put(mapping, handlerMeta);
                }
            }
        }

//        for (Integer key : handlerContainer.keySet()) {
//            System.out.println(key);
//        }
    }

    @Override
    public void setApplicationContext(@NotNull ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    /**
     * 通过参数调用相关方法，调用方式有两种:
     * 1、通过基本数据类型或者String接收参数调用方法
     * 2、通过对象接收参数调用方法
     * 两者都支持不定参数Channel
     * @param requestData 请求数据
     * @param channel Netty channel
     * @return 处理方法返回数据
     */
    public WsApiResult dispatcherRequest(RequestData requestData, Channel channel) throws InvocationTargetException, IllegalAccessException {
        int constructorId = requestData.getConstructorId();
        System.out.println(requestData);
        Object requestParam = requestData.getRequestParam();
        HandlerMeta handlerMeta = handlerContainer.get(constructorId);
        if (handlerMeta == null) {
            throw new WebsocketHandlerMappingException("current websocket request didn't config handler!");
        }
        Method method = handlerMeta.getMethod();
        Class<?> returnType = method.getReturnType();
        Parameter[] parameters = method.getParameters();
        Object handlerObject = handlerMeta.getHandlerObject();
        Object[] invokeParam = bindParam.bind(parameters, requestParam, channel);
        Object response = method.invoke(handlerObject, invokeParam);

        return buildResponse(constructorId, returnType, response);
    }

    private WsApiResult buildResponse(int constructorId, Class<?> returnType, Object response) {
        return WsApiResult.ok(constructorId, returnType, response);
    }

    public static <T> T get(Class<T> clz,Object o){
        if(clz.isInstance(o)){
            return clz.cast(o);
        }
        return null;
    }
}
