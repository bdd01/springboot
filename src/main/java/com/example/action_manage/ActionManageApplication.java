package com.example.action_manage;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.action_manage.dao")
@SpringBootApplication
public class ActionManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(ActionManageApplication.class, args);
    }

}
