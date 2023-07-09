package com.im.lib.net;

import com.im.lib.annotation.WebsocketHandler;
import com.im.lib.annotation.WebsocketHandlerMapping;
import com.im.lib.entity.HandlerMeta;
import com.im.lib.entity.RequestData;
import com.im.lib.entity.RpcResult;
import com.im.lib.exception.WebsocketHandlerMappingException;
import com.im.lib.tl.TLObject;
import io.netty.channel.Channel;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Slf4j
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
    }

    @Override
    public void setApplicationContext(@Nullable ApplicationContext applicationContext) throws BeansException {
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
    public RpcResult dispatcherRequest(RequestData requestData, Channel channel) throws InvocationTargetException, IllegalAccessException {
        int constructorId = requestData.constructorId;
        log.info("request data: {}", requestData);
        TLObject tlObject = requestData.tlObject;
        HandlerMeta handlerMeta = handlerContainer.get(constructorId);
        if (handlerMeta == null) {
            throw new WebsocketHandlerMappingException("current websocket request didn't config handler!");
        }
        Method method = handlerMeta.getMethod();
        Parameter[] parameters = method.getParameters();
        Object handlerObject = handlerMeta.getHandlerObject();
        Object[] invokeParam = bindParam.bind(parameters, tlObject, channel, requestData);
        TLObject response = null;
        try {
            response = (TLObject) method.invoke(handlerObject, invokeParam);
        } catch (ClassCastException e) {
            e.printStackTrace();
            log.error("ClassCastException");
        }
        if (response == null) {
            log.error(handlerObject.getClass().getSimpleName()
                    + ":" + handlerMeta.getMethod().getName()
                    + "方法未实现！");
            return RpcResult.ok(requestData.authKeyId, null, requestData.sessionId, requestData.msgId, requestData.channelId);
        }

        long authKeyId = requestData.authKeyId;
        return RpcResult.ok(authKeyId, response, requestData.sessionId, requestData.msgId, requestData.channelId);
    }

    public static <T> T get(Class<T> clz,Object o){
        if(clz.isInstance(o)){
            return clz.cast(o);
        }
        return null;
    }
}
