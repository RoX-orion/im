package com.im.service;

import com.im.api.AccountApi;
import org.springframework.stereotype.Service;

/**
 * Copyright (c) 2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-02-12
 */

@Service
public class AccountService {
    public Boolean updateStatus(AccountApi.UpdateStatus updateStatus) {
        System.out.println(updateStatus);

        return Boolean.TRUE;
    }
}
