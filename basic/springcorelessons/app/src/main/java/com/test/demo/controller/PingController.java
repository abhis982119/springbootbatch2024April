package com.test.demo.controller;

import com.test.demo.beans.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {



    @GetMapping
    public String ping(){
        return "pong";
    }

    @GetMapping("/random")
    public String random(){
        return "random";
    }

    @PostConstruct
    public void postMapping(){
        System.out.println(getClass().getName() + " : bean created");
    }


}
