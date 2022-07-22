package com.im.entity;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

@Data
public class InitConnection implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private Long apiId;
    private String deviceModel;
    private String systemVersion;
    private String appVersion;
    private String systemLangCode;
    private String langPack;
    private String langCode;
}
