package com.im.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-07-01
 */

@Data
@TableName("country_code")
public class CountryCode {

    @TableId
    private Integer id;

    private String countryCode;

    private String prefixes;

    private String patterns;
}
