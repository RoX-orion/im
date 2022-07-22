package com.im.entity.output;

import java.io.Serializable;

/**
 * Copyright (c) 2021 RoX-orion. All rights reserved.
 *
 * @author RoX-orion
 * @date 2021-03-06
 * @since 1.0.0
 */

public class ApiResult implements Serializable {

    private Integer code;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ApiResult() {
    }

    private String msg;

    public ApiResult(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    private Object data;

    public ApiResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    //成功
    public static ApiResult ok() {
        return new ApiResult(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getDesc(), null);
    }

    //成功
    public static ApiResult ok(Object data){
        return new ApiResult(ResponseCode.SUCCESS.getCode(), "OK", data);
    }

    //登录过期
    public static ApiResult expired(String message) {
        return new ApiResult(ResponseCode.UNAUTHENTICATED.getCode(), message, null);
    }

    //失败
    public static ApiResult fail(String message) {
        return new ApiResult(ResponseCode.FAILURE.getCode(), message, null);
    }

    //失败-自定义状态码
    public static ApiResult fail(Integer code, String message) {
        return new ApiResult(code, message, null);
    }

    //服务器内部错误
    public static ApiResult error() {
        return new ApiResult(ResponseCode.INTERNAL_SERVER_ERROR.getCode(), ResponseCode.INTERNAL_SERVER_ERROR.getDesc());
    }

    public static ApiResult unAuthorized() {
        return new ApiResult(ResponseCode.UNAUTHORIZED.getCode(), ResponseCode.UNAUTHORIZED.getDesc());
    }

    public static ApiResult build(Integer code, String msg) {
        return new ApiResult(code, msg, null);
    }
}
