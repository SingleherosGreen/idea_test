package com.xiaoyixiong.web.controller;

import com.xiaoyixiong.pojo.Users;
import com.xiaoyixiong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/addUser")
    public String addUser(Users users) {
        userService.addUser(users);
        return "ok";
    }
}
