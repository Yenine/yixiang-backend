package com.exp.yixiang.dao;

import com.exp.yixiang.entity.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface UserDao {

    @Delete("DELETE FROM users WHERE userid =#{userid}")
    void delete(int userid);

    @Insert("INSERT INTO user(username,password,point,profile) VALUES(#{username}, #{password},#{point},#{profile})")
    @Options(useGeneratedKeys = true, keyProperty = "userid")
    int register(User newuser);

//    添加客户
    @Insert("INSERT INTO client(userid,creditrating) VALUES(#{userid}, #{creditrating})")
    int addclient(int userid,float creditrating);

    @Select("SELECT * FROM user WHERE userid = #{userid} and password=#{password}")
    @Results({
            @Result(property = "userid",  column = "userid"),
            @Result(property = "username", column = "username"),
            @Result(property = "point", column = "point"),
            @Result(property = "profile", column = "profile")
    })
    User check(int userid, String password);

    @Select("SELECT count(*) FROM user WHERE userid = #{userid}")
    int find(int userid);
}
