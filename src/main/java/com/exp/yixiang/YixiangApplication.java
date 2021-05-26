package com.exp.yixiang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.exp.yixiang.dao")
public class YixiangApplication {

    public static void main(String[] args) {
        SpringApplication.run(YixiangApplication.class, args);
    }

}
