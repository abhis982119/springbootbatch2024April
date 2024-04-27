package com.test.demo.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Builder;
import lombok.ToString;
import org.springframework.stereotype.Component;

//@ToString
@Builder
public class Student {


    private String name;

    private int rollNo;
    @PostConstruct
    public void postConstruct(){
        System.out.println(getClass().getName() + " bean created with name " + name);
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println(getClass().getName() + " bean has been deleted " + name);
    }

}
