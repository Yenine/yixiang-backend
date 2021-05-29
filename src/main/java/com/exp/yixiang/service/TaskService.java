package com.exp.yixiang.service;

import com.exp.yixiang.entity.Task;

import java.util.Date;
import java.util.List;

public interface TaskService {
    public int publishTask(int userid, String taskname, String category,String description, int reward, short state,String deadline,String requirement);
    public List<Task> getUncompletedTasks();
    public int complete(int userid,int taskid,String evaluation,int rarting);
}
