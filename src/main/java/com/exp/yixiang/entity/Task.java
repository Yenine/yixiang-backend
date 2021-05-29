package com.exp.yixiang.entity;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Task {
    private int taskid;
    private int userid;
    private String taskname;
    private  String description;
    private  String category;
    private int reward;
    private short state;
    private Date publishtime;
    private Date deadline;
    private String requirement;

    public Task(int userid, String taskname, String description, String category, int reward, short state, Date publishtime, Date deadline, String requirement) {
        this.userid = userid;
        this.taskname = taskname;
        this.description = description;
        this.category = category;
        this.reward = reward;
        this.state = state;
        this.publishtime = publishtime;
        this.deadline = deadline;
        this.requirement = requirement;
    }

    public Task(int taskid, int userid, String taskname, String description, String category, int reward, short state, Date publishtime, Date deadline, String requirement) {
        this.taskid = taskid;
        this.userid = userid;
        this.taskname = taskname;
        this.description = description;
        this.category = category;
        this.reward = reward;
        this.state = state;
        this.publishtime = publishtime;
        this.deadline = deadline;
        this.requirement = requirement;
    }

    public Date getPublishtime() {
        return publishtime;
    }

    public void setPublishtime(Date publishtime) {
        this.publishtime = publishtime;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public int getTaskid() {
        return taskid;
    }

    public void setTaskid(int taskid) {
        this.taskid = taskid;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getTaskname() {
        return taskname;
    }

    public void setTaskname(String taskname) {
        this.taskname = taskname;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }

    public short getState() {
        return state;
    }

    public void setState(short state) {
        this.state = state;
    }

    public Map<String, Object> toMap(){
        Map<String, Object> map =new HashMap<>();
        map.put("taskid",this.taskid);
        map.put("taskname",this.taskname);
        map.put("category",this.category);
        map.put("description",this.description);
        map.put("reward",this.reward);
        map.put("deadline",this.deadline);
        return map;
    }
}
