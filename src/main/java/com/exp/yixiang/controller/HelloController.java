package com.exp.yixiang.controller;

import com.exp.yixiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    UserService userService;
    @RequestMapping("/hello")
    public String HelloWorld(){
        userService.register(111,"yenine","123456");
        return "Hello World!";
    }
}
