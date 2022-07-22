package com.im.entity;

import lombok.Data;

import java.util.Date;

@Data
public class ChatMessage {
    private Long id;
    private Long fromUid;
    private Long toUid;
    private String type;
    private String message;
    private String status;
    private Date sendTime;
    private Date updateTime;
}
