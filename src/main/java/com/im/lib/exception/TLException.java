package com.im.lib.exception;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-15
 */

public class TLException extends RuntimeException {
    private String message;

    public TLException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
