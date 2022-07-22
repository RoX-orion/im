package com.im.lib.entity;

import java.lang.reflect.Method;

public class HandlerMeta {
    /**
     * handler的字节码
     */
    private Class<?> clazz;
    /**
     * handler的方法
     */
    private Method method;
    /**
     * handler对象
     */
    private Object handlerObject;

    public Class<?> getClazz() {
        return clazz;
    }

    public void setClazz(Class<?> clazz) {
        this.clazz = clazz;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Object getHandlerObject() {
        return handlerObject;
    }

    public void setHandlerObject(Object handlerObject) {
        this.handlerObject = handlerObject;
    }

    @Override
    public String toString() {
        return "HandlerMeta{" +
                "clazz=" + clazz +
                ", method=" + method +
                ", handlerObject=" + handlerObject +
                '}';
    }
}
