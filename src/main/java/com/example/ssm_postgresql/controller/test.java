package com.example.ssm_postgresql.controller;

import com.example.ssm_postgresql.dao.UserMapper;
import com.example.ssm_postgresql.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test {
   @Autowired
    UserMapper usermapper;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public void insert() {
        User user = new User();
        user.setId("11");
        user.setUsername("zhangx");
        user.setPassword("zhang123");
        user.setAge("3");
        usermapper.insert(user);
        System.out.println("test");
    }
}
