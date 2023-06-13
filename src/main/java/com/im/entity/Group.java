package com.im.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

@Data
@TableName("`group`")
public class Group implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @TableId
    private Long groupId;

    @NotBlank
    private String groupName;

    private String groupIntroduction;

    private String shareLink;

    private String avatar;

    private int memberCount;

    private Long createUid;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @TableField(exist = false)
    private Boolean joined = Boolean.TRUE;

    @TableField(exist = false)
    private String lastMessage;
}
