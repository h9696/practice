package com.itheima.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//请求处理类
@RestController
public class hello {
    @RequestMapping("/sayHello")
    public String sayHello() {
        System.out.println("hello world");
        return "hello world";
    }
}
