package com.im.lib.entity;

import lombok.Data;

@Data
public class WsApiResult {
    private String type;
    private Integer code;
    private String msg;
    private Object data;

    public WsApiResult(String type, Integer code, String msg, Object data) {
        this.type = type;
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static WsApiResult ok(String type, Object data) {
        return new WsApiResult(type, 200, "OK", data);
    }

    public static WsApiResult fail(String type, String msg) {
        return new WsApiResult(type, 400, msg, null);
    }

    public static WsApiResult error() {
        return new WsApiResult("error", 500, "服务器内部错误", null);
    }
}
