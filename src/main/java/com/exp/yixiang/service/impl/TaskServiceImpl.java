package com.exp.yixiang.service.impl;

import com.exp.yixiang.dao.TaskDao;
import com.exp.yixiang.entity.Task;
import com.exp.yixiang.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("taskService")
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskDao taskDao;

    @Override
    public int publishTask(int userid, String taskname, String category,String description,  int reward, short state, String deadline, String requirement) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        try {
            Date deadlinedate = simpleDateFormat.parse(deadline);
            Task newtask=new Task(userid,taskname,description,category,reward,state,new Date(),deadlinedate,requirement);
            taskDao.add(newtask);
            int taskid=newtask.getTaskid();
            taskDao.addUncompleted(taskid);
            return taskid;
        }catch (Exception e){
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public List<Task> getUncompletedTasks() {
        return taskDao.getUncompleted();
    }

    @Override
    public int complete(int userid, int taskid, String evaluation, int rarting) {
        return 0;
    }
}
