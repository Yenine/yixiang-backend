package com.exp.yixiang.service.impl;
import com.exp.yixiang.dao.UserDao;
import com.exp.yixiang.entity.*;
import com.exp.yixiang.service.UserService;
import com.exp.yixiang.util.ImageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileInputStream;

@Service("userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public User register(String username, String password) {
        FileInputStream in;
        try {
            in = ImageUtil.readImage("D:\\Documents\\IDEA\\yixiang\\src\\main\\java\\com\\exp\\yixiang\\util\\default_profile.png");
            User newuser=new User(-1,username,password,100,in.readAllBytes());
            userDao.register(newuser);
//            自动注册客户身份
            userDao.addclient(newuser.getUserid(),100);
            return newuser;
        }catch (Exception e) {
            e.printStackTrace();
            return null;
        }
//        userDao.register(new User(userid,username,password,100));
    }

    @Override
    public User checkLogin(int userid, String password) {
        if(userDao.find(userid)==0){
            return new User(-1000);
        }
        return userDao.check(userid,password);
    }
}
