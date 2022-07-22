package com.im.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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

    /**
     * 主键id
     */
    @TableId
    private Long uid;
    /**
     * 邮箱
     */
    private String email;

    /**
     * 头像
     */
    private String avatar;

    private String displayName;
    /**
     * 用户名
     */
    private String username;


    /**
     * 签名
     */
    private String sign;

    private String status;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @TableField(exist = false)
    private Boolean added = Boolean.TRUE;

    @TableField(exist = false)
    private String lastMessage;
}
