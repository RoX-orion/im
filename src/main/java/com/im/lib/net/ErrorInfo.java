package com.im.lib.net;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-24
 */

public enum ErrorInfo {

    BAD_SERVER_SALT(48),

    AUTH_KEY_UNREGISTERED(401),
    AUTH_KEY_INVALID(401),
    SESSION_EXPIRED(401);

    public int code;

    ErrorInfo(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
