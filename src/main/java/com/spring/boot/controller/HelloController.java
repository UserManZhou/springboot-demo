package com.spring.boot.controller;

import com.spring.boot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private User user;

    @RequestMapping("/helloword")
    public String helloWord(){
        return "hello Spring Boot 你好奥维好哇好哇"+user.toString();
    }

}
