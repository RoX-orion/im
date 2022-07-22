package com.im.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("private_chat_message")
public class PrivateChatMessage {
    @TableId
    private Long privateChatMessageId;
    private Long sendUid;
    private Long toUid;
    private String chatMessage;
    private String sendStatus;
    @TableField(exist = false)
    private String sendUsername;
    @TableField(exist = false)
    private String toUsername;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
