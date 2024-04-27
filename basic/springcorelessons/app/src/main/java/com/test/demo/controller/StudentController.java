package com.test.demo.controller;

import com.test.demo.beans.Student;
import jakarta.annotation.PostConstruct;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@ToString
@Controller
public class StudentController {


    @Autowired             // Autowiring type : byType with @Primary
    private Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public StudentController(Student student) {
        this.student = student;
    }


    /*
      1. How it found student object

         type : className
         name : userdefined


      2. Singleton, per-injection,per-request, per-session
      3. Injection type : setter, constructor, field
     */


    @PostConstruct
    public void postConstruct(){
        System.out.println(toString());
    }
}
