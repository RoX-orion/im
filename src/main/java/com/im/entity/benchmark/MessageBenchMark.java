package com.im.entity.benchmark;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-10-13
 */

@Data
@TableName("benchmark_msg")
public class MessageBenchMark {

    @TableId
    private Long id;

    private String message;

    private Date createTime;
}
