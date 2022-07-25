package com.im.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.math.BigInteger;

@Data
public class CreateAuthKeyState {
    private String pq;
    private BigInteger p;
    private BigInteger q;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigInteger newNonce;
}
