package com.im.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.im.entity.User;
import com.im.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;


    public User getUserByEmail(String email) {

        return userMapper.selectOne(
                new QueryWrapper<User>()
                        .eq("email", email)
        );
    }

    public User createUser(String email) {
        User user = new User();
        user.setEmail(email);
        user.setSign("这个人很懒，什么都没有写");
        user.setDisplayName(email);
        user.setStatus("active");

        userMapper.insert(user);
        return user;
    }
}
