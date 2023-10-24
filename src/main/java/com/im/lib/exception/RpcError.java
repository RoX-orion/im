package com.im.lib.exception;

import com.im.lib.net.Errors;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-07-09
 */

public class RpcError extends RuntimeException {
    public int errorCode;
    public String errorMessage;

    public RpcError(Errors error) {
        this.errorCode = error.getCode();
        this.errorMessage = error.name();
    }
}
