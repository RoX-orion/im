package com.im.service;

import com.im.lib.exception.RpcError;
import com.im.lib.net.Errors;
import com.im.lib.tl.TLRPC;
import com.im.redis.AuthKeyManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-01-08
 */

@Service
public class UpdatesService {

    private final AuthKeyManager authKeyManager;

    @Autowired
    public UpdatesService(final AuthKeyManager authKeyManager) {
        this.authKeyManager = authKeyManager;
    }

    public TLRPC.TL_updates_state getState(long authKeyId) {
        if (!authKeyManager.hasRegister(authKeyId)) {
            throw new RpcError(Errors.AUTH_KEY_UNREGISTERED);
        }
        TLRPC.TL_updates_state state = new TLRPC.TL_updates_state();
        state.date = 0;
        state.qts = 0;
        state.seq = 0;
        state.unread_count = 0;

        return state;
    }
}
