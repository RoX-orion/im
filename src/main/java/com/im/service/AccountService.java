package com.im.service;

import com.im.lib.tl.TLRPC;
import org.springframework.stereotype.Service;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-02-12
 */

@Service
public class AccountService {
    public TLRPC.Bool updateStatus(TLRPC.TL_account_updateStatus updateStatus) {
        System.out.println(updateStatus);
        return new TLRPC.TL_boolFalse();
    }
}
