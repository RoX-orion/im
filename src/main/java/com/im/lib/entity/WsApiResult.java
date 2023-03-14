package com.im.lib.entity;

import lombok.Data;

import java.math.BigInteger;

@Data
public class WsApiResult {
    private long sessionId;

    private BigInteger authKeyId;
    private Class<?> returnType;
    private Object data;

    public WsApiResult(BigInteger authKeyId, Class<?> returnType, Object data, long sessionId) {
        this.authKeyId = authKeyId;
        this.returnType = returnType;
        this.data = data;
        this.sessionId = sessionId;
    }

    public WsApiResult(BigInteger authKeyId, Class<?> returnType, Object data) {
        this.authKeyId = authKeyId;
        this.returnType = returnType;
        this.data = data;
    }

    public static WsApiResult ok(BigInteger authKeyId, Class<?> returnType, Object data, long sessionId) {
        return new WsApiResult(authKeyId, returnType, data, sessionId);
    }

    public static WsApiResult ok(BigInteger authKeyId, Class<?> returnType, Object data) {
        return new WsApiResult(authKeyId, returnType, data);
    }

//    public static WsApiResult fail(String type, String msg) {
//        return new WsApiResult(1, 400, msg, null);
//    }
//
//    public static WsApiResult error() {
//        return new WsApiResult(1, 500, "服务器内部错误", null);
//    }
}
