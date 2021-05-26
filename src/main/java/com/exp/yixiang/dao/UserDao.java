package com.exp.yixiang.dao;

import com.exp.yixiang.entity.User;
import org.apache.ibatis.annotations.*;

public interface UserDao {

    @Delete("DELETE FROM users WHERE userid =#{userid}")
    void delete(int userid);

    @Insert("INSERT INTO user(userid,username,password) VALUES(#{userid}, #{username}, #{password})")
    int register(User newuser);

    @Select("SELECT count(*) FROM user WHERE userid = #{userid} and password=#{password}")
    int check(int userid,String password);
}
