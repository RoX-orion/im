package com.im.lib.entity;

import lombok.Data;

import java.math.BigInteger;

@Data
public class WsApiResult {
    private int constructorId;

    private long sessionId;

    private BigInteger authKeyId;
    private Class<?> returnType;
    private Object data;

    public WsApiResult(int constructorId, BigInteger authKeyId, Class<?> returnType, Object data, long sessionId) {
        this.constructorId = constructorId;
        this.authKeyId = authKeyId;
        this.returnType = returnType;
        this.data = data;
        this.sessionId = sessionId;
    }

    public WsApiResult(int constructorId, BigInteger authKeyId, Class<?> returnType, Object data) {
        this.constructorId = constructorId;
        this.authKeyId = authKeyId;
        this.returnType = returnType;
        this.data = data;
    }

    public static WsApiResult ok(int constructorId, BigInteger authKeyId, Class<?> returnType, Object data, long sessionId) {
        return new WsApiResult(constructorId, authKeyId, returnType, data, sessionId);
    }

    public static WsApiResult ok(int constructorId, BigInteger authKeyId, Class<?> returnType, Object data) {
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
