package com.im.lib.entity;

import lombok.Data;

@Data
public class WsApiResult {
    private int constructorId;

    private long authKeyId;
    private Class<?> returnType;
    private Object data;

    public WsApiResult(int constructorId, long authKeyId, Class<?> returnType, Object data) {
        this.constructorId = constructorId;
        this.authKeyId = authKeyId;
        this.returnType = returnType;
        this.data = data;
    }

    public static WsApiResult ok(int constructorId, long authKeyId, Class<?> returnType, Object data) {
        return new WsApiResult(constructorId, authKeyId, returnType, data);
    }

//    public static WsApiResult fail(String type, String msg) {
//        return new WsApiResult(1, 400, msg, null);
//    }
//
//    public static WsApiResult error() {
//        return new WsApiResult(1, 500, "服务器内部错误", null);
//    }
}
