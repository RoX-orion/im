package com.im.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigInteger;

@Data
public class CreateAuthKeyState {

    private byte[] pq;

    private byte[] p;

    private byte[] q;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private byte[] newNonce;

    private byte[] ga;

    private BigInteger a;
}
