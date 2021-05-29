package com.exp.yixiang.service;
import com.exp.yixiang.controller.TaskController;
import com.exp.yixiang.dao.TaskDao;
import com.exp.yixiang.entity.Task;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@SpringBootTest
class TaskServiceTests {
    @Autowired
    TaskDao taskDao;
    @Autowired
    TaskService taskService;
    @Autowired
    TaskController taskController;
    @Test
    void testPublish() {
//        taskDao.add(new )
//        System.out.println(taskService.publishTask(3,"测试任务","测试描述","测试类",10,(short)0,"2021-6-1 23:58","测试需求"));
//        assert(taskService.publishTask(3,"测试任务","测试描述","测试类",10,(short)0,"2021-6-1 23:58","测试需求")==13);
        Map<String,Object> map=taskController.register(3,"测试任务","测试类","测试描述",10,"2021-6-1 23:58","测试需求");
        assert ((int)map.get("result")==0);
    }
    @Test
    void testGetUncompleted(){
//        List<Task> taskList=taskDao.getUncompleted();
//
//        List< Map<String, Object>> taskmap=new ArrayList<>();
//        for(Task task:taskList){
//            taskmap.add(task.toMap());
//        }
//        System.out.println(taskmap.toString());
//        assert (taskList.get(0).getTaskid()==7);
//        assert (taskList.get(1).getTaskid()==8);
//        assert ((taskList.get(0).getTaskname()).equals("测试任务"));
//        SimpleDateFormat sformat = new SimpleDateFormat("yyyy-MM-dd HH:mm");//日期格式
////        String time = sformat.format(taskList.get(0).getPublishtime());
//        String time = taskList.get(0).toString();
//        System.out.println(time);
        System.out.println(taskController.getUncompletedTask());
    }
//    Map<String,Object> map=
}
