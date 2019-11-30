package com.xiaoyixiong.service.impl;

import com.xiaoyixiong.mapper.UserMapper;
import com.xiaoyixiong.pojo.Users;
import com.xiaoyixiong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(Users users) {
        this.userMapper.insertUser(users);
    }
}
