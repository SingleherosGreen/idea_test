package com.xiaoyixiong.mapper;

import com.xiaoyixiong.pojo.Users;

import java.util.List;

public interface UserMapper {
    void insertUser(Users users);
    List<Users> selectUserAll();
}
