package com.nacos.consumer.controller;

import com.nacos.consumer.Feign.UserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sumer")
public class controller {


    @Autowired
    private UserFeign userFeign;
    @GetMapping("/test1")
    public String test(){

        return "我是Feign调用:"+userFeign.gettest();
    }

    @GetMapping("/test")
    public String test2(){

        return "我是自家使用comsumer";
    }
}
