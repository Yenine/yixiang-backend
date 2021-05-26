package com.exp.yixiang.controller;

import com.exp.yixiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class RegisterController {
    @Autowired
    UserService userService;
    @PostMapping(value = "/user/login")
    public void register(@RequestParam("userid")int userid,@RequestParam("username")String username,@RequestParam("password")String password){
        userService.register(userid,username,password);
    }
}
