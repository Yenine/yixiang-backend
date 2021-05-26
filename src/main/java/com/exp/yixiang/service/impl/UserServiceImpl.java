package com.exp.yixiang.service.impl;
import com.exp.yixiang.dao.UserDao;
import com.exp.yixiang.entity.*;
import com.exp.yixiang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    @Override
    public void register(int userid, String username, String password) {
        userDao.register(new User(userid,username,password));
    }

    @Override
    public boolean checkLogin(int userid, String password) {
        return userDao.check(userid,password)==1;

    }
}
