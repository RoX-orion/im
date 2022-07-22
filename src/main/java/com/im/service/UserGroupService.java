package com.im.service;

import com.im.mapper.UserGroupMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserGroupService {
    @Resource
    private UserGroupMapper userGroupMapper;
}
