package com.exp.yixiang.controller;

import com.exp.yixiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping(value = "/register")
    public void register(@RequestParam("userid")int userid, @RequestParam("username")String username, @RequestParam("password")String password){
        userService.register(userid,username,password);
    }
    @PostMapping(value = "/login")
    public void login(@RequestParam("userid")int userid, @RequestParam("password")String password){
        userService.checkLogin(userid,password);
    }
}
