package com.test.demo.controller;

import com.test.demo.beans.Student;
import jakarta.annotation.PostConstruct;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@ToString
@Controller
public class StudentSaveController {

    @Qualifier("unnisa")  // Autowiring type : byName
    @Autowired
    private Student student;


    @PostConstruct
    public void postConstruct(){
        System.out.println(toString());
    }
}
