package com.exp.yixiang.dao;

import com.exp.yixiang.entity.Task;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface TaskDao {

    @Insert("INSERT INTO task(userid,taskname,description,category,reward,state,publishtime,deadline,requirement) " +
            "VALUES(#{userid}, #{taskname},#{description},#{category},#{reward},#{state},#{publishtime},#{deadline},#{requirement})")
    @Options(useGeneratedKeys = true, keyProperty = "taskid")
    int add(Task newtask);

    @Insert("INSERT INTO uncompleted_task(taskid) VALUES(#{taskid})")
    int addUncompleted(int taskid);

    @Select("SELECT * FROM task WHERE state = 0")
    List<Task> getUncompleted();
}
