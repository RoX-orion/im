package com.im.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-07-01
 */

@Data
@TableName("country")
public class Country {

    @TableId
    private Integer countryId;

    private boolean hidden;

    private String iso2;

    private String defaultName;

    private String name;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @TableField(exist = false)
    private List<CountryCode> countryCodeList;

    @TableField(exist = false)
    private String countryCode;

    @TableField(exist = false)
    private String prefixes;

    @TableField(exist = false)
    private String patterns;
}
