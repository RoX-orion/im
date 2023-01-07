package com.im.lib.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigInteger;

@Data
@AllArgsConstructor
public class AesParams {
    private byte[] key;
    private byte[] iv;
}
