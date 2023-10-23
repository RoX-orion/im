package com.im.mapper.benchmark;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.im.entity.benchmark.MessageBenchMark;

import java.util.List;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-10-13
 */

public interface MessageMapper extends BaseMapper<MessageBenchMark> {

    long getCount();

    List<MessageBenchMark> getList();
}
