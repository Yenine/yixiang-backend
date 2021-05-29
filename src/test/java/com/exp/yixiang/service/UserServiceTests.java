package com.exp.yixiang.service;

import com.exp.yixiang.controller.UserController;
import com.exp.yixiang.dao.UserDao;
import com.exp.yixiang.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class UserServiceTests {
    @Autowired
    private UserController userController;
    @Autowired
    private UserService userService;
    @Autowired
    private UserDao userDao;

    @Test
    void testUserDao(){
//        System.out.println(userDao.find(1));
        System.out.println(userDao.register(new User()));
    }
    @Test
    void testLogin() {
        User loginUser=userDao.check(1,"123456");
//        User loginUser=userService.checkLogin(123,"123456");
        assert(loginUser.getUsername().equals("xxx"));
        assert (loginUser.getPoint()==100);
    }
    @Test
    void testService() {
        User loginUser=userService.checkLogin(1,"123456");
        assert(loginUser.getUserid()==1);
        assert(loginUser.getUsername().equals("xxx"));
        assert (loginUser.getPoint()==100);
    }
    @Test
    void testRegister() {
        assert (userService.register("xxx","789123").getUserid()==3);
    }
    @Test
    void testController(){
        Map<String,Object> map=userController.login(1,"123456");
        assert (((String)map.get("username")).equals("xxx"));;
        assert ((int)map.get("point")==100);
    }
}
