package com.im.entity.output;

/**
 * Copyright (c) 2021 RoX-orion. All rights reserved.
 *
 * 响应码枚举
 *
 * @author RoX-orion
 * @date 2021-06-12
 * @since 1.0.0
 */

public enum ResponseCode {

    //成功
    SUCCESS( 200, "OK"),

    //失败
    FAILURE( 400, "FAILURE"),

    //未认证（签名错误、token错误）
    UNAUTHENTICATED(401, "未认证或Token失效"),

    //权限不足
    UNAUTHORIZED(403, "权限不足"),

//    //未通过认证
//    USER_UNAUTHORIZED( 402, "用户名或密码不正确"),

    //接口不存在
    NOT_FOUND( 404, "接口不存在"),

    //服务器内部错误
    INTERNAL_SERVER_ERROR( 500, "服务器内部错误");

    private int code;

    private String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
