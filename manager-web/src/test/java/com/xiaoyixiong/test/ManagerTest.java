package com.xiaoyixiong.test;

import com.xiaoyixiong.mapper.UserMapper;
import com.xiaoyixiong.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/applicationContext-dao.xml")
public class ManagerTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void insertUserTest() {
        Users users = new Users();
        users.setUsername("admin");
        users.setUserage(20);
        this.userMapper.insertUser(users);
    }
}
