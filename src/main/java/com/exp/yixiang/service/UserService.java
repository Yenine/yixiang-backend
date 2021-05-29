package com.exp.yixiang.service;

import com.exp.yixiang.entity.User;

public interface UserService {
    User register(String username,String password);
    User checkLogin(int userid, String password);
}
