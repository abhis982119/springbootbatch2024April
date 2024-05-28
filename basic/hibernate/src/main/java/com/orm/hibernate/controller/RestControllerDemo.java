package com.orm.hibernate.controller;

import com.orm.hibernate.model.response.NameResponse;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodType;

@RestController
@RequestMapping("/demo")
public class RestControllerDemo {


    //Return primitive data
    @GetMapping("/name")
    public String getName(@RequestParam String name){
        return name;
    }


    //Return json object
    @GetMapping("/nameResponse")
    public NameResponse getNameResponse(@RequestParam String name){
         return NameResponse.builder().name(name).build();
    }


    @RequestMapping(method = RequestMethod.GET, value = "nameWithRM")
    public String getNameUsingMapping(@RequestParam String name){
        return name;
    }


    @RequestMapping(method = RequestMethod.GET, value = "/nameResponseWithRM")
    public NameResponse getNameResponseWithRm(@RequestParam String name){
        return NameResponse.builder().name(name).build();
    }

}
