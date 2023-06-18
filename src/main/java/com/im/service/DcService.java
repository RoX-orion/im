package com.im.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.im.entity.SystemConfig;
import com.im.lib.Helpers;
import com.im.lib.tl.TLRPC;
import com.im.mapper.SystemConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @description: data center service
 * @author: Andre Lina
 * @date: 2023-06-18
 */

@Service
public class DcService {

    private final String DC_OPTIONS_CONFIG_KEY  = "dcOptions";
    private final String DC_OPTIONS_KEY         = "dc:dc-option";

    private final StringRedisTemplate stringRedisTemplate;

    private final ObjectMapper mapper;

    private final SystemConfigMapper systemConfigMapper;

    @Autowired
    public DcService(final ObjectMapper mapper,
                     final StringRedisTemplate stringRedisTemplate,
                     final SystemConfigMapper systemConfigMapper) {
        this.mapper = mapper;
        this.stringRedisTemplate = stringRedisTemplate;
        this.systemConfigMapper = systemConfigMapper;
    }

    public void setDcOptions(List<TLRPC.TL_dcOption> dcOptionList) {
        Map<String, String> collect = dcOptionList.stream()
                .map(e -> {
                    try {
                        return mapper.writeValueAsString(e);
                    } catch (JsonProcessingException ex) {
                        throw new RuntimeException(ex);
                    }
                }).collect(Collectors.toMap(k -> k, v -> v, (k1, k2) -> k2));
        stringRedisTemplate.opsForHash()
                .putAll(DC_OPTIONS_KEY, collect);
    }

    public void clearDcOptions() {
        stringRedisTemplate.delete(DC_OPTIONS_KEY);
    }

    public void initDcOptions() {
        SystemConfig dcOptionsConfig = systemConfigMapper.selectOne(
                new QueryWrapper<SystemConfig>().eq("config_key", DC_OPTIONS_CONFIG_KEY)
        );
        List<TLRPC.TL_dcOption> dcOptionList = Optional.ofNullable(dcOptionsConfig)
                .map(item -> Helpers.parseList(item.getConfigValue(), TLRPC.TL_dcOption.class))
                .orElse(List.of());
        clearDcOptions();
        setDcOptions(dcOptionList);
    }

    public void addDcOption(TLRPC.TL_dcOption dcOption) {
        SystemConfig dcOptionsConfig = systemConfigMapper.selectOne(
                new QueryWrapper<SystemConfig>().eq("config_key", DC_OPTIONS_CONFIG_KEY)
        );
        List<TLRPC.TL_dcOption> dcOptionList;
        if (dcOptionsConfig == null) {
            dcOptionsConfig = new SystemConfig();
            dcOptionsConfig.setConfigKey(DC_OPTIONS_CONFIG_KEY);
            dcOptionList = List.of(dcOption);
        } else {
            dcOptionList = Helpers.parseList(dcOptionsConfig.getConfigValue(), TLRPC.TL_dcOption.class);
            dcOptionList.add(dcOption);
        }
        try {
            dcOptionsConfig.setConfigValue(mapper.writeValueAsString(dcOptionList));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        if (dcOptionsConfig.getId() == null) {
            systemConfigMapper.updateById(dcOptionsConfig);
        } else {
            systemConfigMapper.updateById(dcOptionsConfig);
        }
    }
}
