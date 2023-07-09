package com.im.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.im.entity.Country;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-07-01
 */

@Repository
public interface CountryMapper extends BaseMapper<Country> {
    List<Country> getCountryList();
}
