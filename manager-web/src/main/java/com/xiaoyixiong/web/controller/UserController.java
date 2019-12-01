package com.xiaoyixiong.web.controller;

import com.xiaoyixiong.pojo.Users;
import com.xiaoyixiong.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.lang.reflect.Method;

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

    /**
     * doGet
     */
    @RequestMapping(value = "/doGet/{userid}", method = RequestMethod.GET)
    public String doGet(@PathVariable String userid) {
        System.out.println("doGet............." + userid);
        return "ok";
    }

    /**
     * doPost
     */
    @RequestMapping(value = "/doPost", method = RequestMethod.POST)
    public String doPost(Users users) {
        System.out.println("doPost.............");
        System.out.println(users);
        return "ok";
    }

    /**
     * doDelete
     */
    @RequestMapping(value = "/doDelete", method = RequestMethod.DELETE)
    public String doDelete(Integer userid) {
        System.out.println("doDelete............." + userid);
        return "ok";
    }

    /**
     * doPut
     */
    @RequestMapping(value = "/doPut", method = RequestMethod.PUT)
    public String doPut() {
        System.out.println("doPut.............");
        return "ok";
    }
}
