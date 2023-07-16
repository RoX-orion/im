package com.im.lib.exception;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-07-16
 */

public class ServerException extends RuntimeException {
    public int code;
    public String message;

    public ServerException(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
