package com.im.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@Accessors(chain = true)
@TableName("group_message")
public class GroupMessage {
    @TableId
    private Long groupMessageId;

    @NotNull
    private Long groupId;

    @NotBlank
    private String content;

    @NotNull
    private Long uid;

    @NotBlank
    @TableField(exist = false)
    private String username;

//    @NotBlank
    private String sendStatus;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
}
