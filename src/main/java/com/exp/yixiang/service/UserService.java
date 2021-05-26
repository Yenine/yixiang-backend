package com.exp.yixiang.service;

public interface UserService {
    void register(int userid,String username,String password);
    boolean checkLogin(int userid,String password);
}
