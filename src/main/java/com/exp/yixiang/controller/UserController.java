package com.exp.yixiang.controller;

import com.exp.yixiang.entity.User;
import com.exp.yixiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping(value = "/register")
    public Map<String, Object> register(@RequestParam("username")String username, @RequestParam("password")String password){
        Map<String, Object> map = new HashMap<>();
        User newuser=userService.register(username,password);
        if(newuser.getUserid()!=-1) {
            map.put("result", 0);
            map.put("userid",newuser.getUserid());
            map.put("username",newuser.getUsername());
            map.put("point",newuser.getPoint());
            map.put("profile",newuser.getProfile());
        }else {
            map.put("result",-1);
        }
        return map;
    }
    @PostMapping(value = "/login")
    public Map<String, Object> login(@RequestParam("userid")int userid, @RequestParam("password")String password){
        Map<String, Object> map = new HashMap<>();
        User newuser=userService.checkLogin(userid,password);
        if(newuser!=null){
            if(newuser.getUserid()!=-1000) {
                map.put("result", 0);
                map.put("userid", newuser.getUserid());
                map.put("username", newuser.getUsername());
                map.put("point", newuser.getPoint());
                map.put("profile", newuser.getProfile());
            }else {
                map.put("result", 1000);
            }
        }else {
            map.put("result", -1);
        }
        return map;
    }
}
