package com.im.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
@TableName("user")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @TableId
    private Long id;

    private String email;

    private Boolean self;

    private Boolean contact;

    private Boolean mutualContact;

    private Boolean deleted;

    private Boolean bot;

    private Boolean botChatHistory;

    private Boolean botNochats;

    private Boolean verified;

    private Boolean restricted;

    private Boolean min;

    private Boolean botInlineGeo;

    private Boolean support;

    private Boolean scam;

    private Boolean applyMinPhoto;

    private Boolean fake;

    private Boolean botAttachMenu;

    private Boolean premium;

    private Boolean attachMenuEnabled;

    private String accessHash;

    private String firstName;

    private String lastName;

    private String username;

    private Integer status;

    private Integer botInfoVersion;

    private String botInlinePlaceholder;

    private String langCode;

    private Long emojiStatus;

}
