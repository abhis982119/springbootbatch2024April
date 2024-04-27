package com.test.demo.beans;

import jakarta.annotation.PostConstruct;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype")
@ToString
@Component
public class Employee {

    private int empId;

    private String name;


    @PostConstruct
    public void postConstruct(){
        System.out.println(getClass().getName() + " bean created with name " + name);
    }


}
