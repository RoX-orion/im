package com.im.lib.crypto;

import com.im.lib.Helpers;
import com.im.lib.entity.AesKeyIv;

import java.util.Arrays;

/**
 * Copyright (c) 2022 Aix Lina. All rights reserved.
 *
 * @author: Aix Lina
 * @date: 2022-12-23
 */

public class KDF {
    public static AesKeyIv kdf(byte[] authKey, byte[] msgKey, boolean client, boolean isCall, boolean isOutgoing) {
        int x = (isCall ? 128 + ((isOutgoing ^ client) ? 8 : 0) : (client ? 0 : 8));
        byte[] sha256a = Helpers.SHA256(msgKey, Arrays.copyOfRange(authKey, x, x + 36));
        byte[] sha256b = Helpers.SHA256(Arrays.copyOfRange(authKey, x + 40, x + 76), msgKey);

        byte[] key = Helpers.concat(
                Arrays.copyOfRange(sha256a, 0, 8),
                Arrays.copyOfRange(sha256b, 8, 24),
                Arrays.copyOfRange(sha256a, 24, 32)
        );
        byte[] iv = Helpers.concat(
                Arrays.copyOfRange(sha256b, 0, 8),
                Arrays.copyOfRange(sha256a, 8, 24),
                Arrays.copyOfRange(sha256b, 24, 32)
        );
        return new AesKeyIv(key, iv);
    }
}
