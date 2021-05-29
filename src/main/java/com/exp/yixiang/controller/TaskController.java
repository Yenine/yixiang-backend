package com.exp.yixiang.controller;

import com.exp.yixiang.entity.Task;
import com.exp.yixiang.service.TaskService;
import com.exp.yixiang.service.UserService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/task")
public class TaskController {
    @Autowired
    TaskService taskService;
    @PostMapping(value = "/publish")
    public Map<String, Object> register(@RequestParam("userid")int userid, @RequestParam("taskname")String taskname, @RequestParam("category")String category,
                                        @RequestParam("description")String description,@RequestParam("reward")int reward, @RequestParam("deadline")String deadline,
                                        @RequestParam("requirement")String requirement){
        Map<String, Object> map = new HashMap<>();
        int taskid=taskService.publishTask(userid,taskname,category,description,reward,(short)0,deadline,requirement);
        if(taskid>0){
            map.put("result",0);
        }else {
            map.put("result",-1);
        }
        return map;
    }
    @GetMapping(value = "/uncompletedTask")
    public Map<String, Object> getUncompletedTask(){
        Map<String, Object> map = new HashMap<>();


        List<Task> taskList=taskService.getUncompletedTasks();
        //使用json-lib会简化操作，但是date类型会被转换成了非预期的字符串，待解决
        JSONArray json=JSONArray.fromCollection(taskList);

        List< Map<String, Object>> taskmap=new ArrayList<>();
        for(Task task:taskList){
            taskmap.add(task.toMap());
        }
        map.put("result",0);
        map.put("list",taskmap.toString());
        return map;
    }
}
