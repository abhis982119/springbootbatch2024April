package com.test.demo.dependencyinjectiontype.constructorinjection;

import com.test.demo.beans.Student;
import jakarta.annotation.PostConstruct;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ToString
@Component
public class ContructorInjectionComponent {


    private Student student;


    @Autowired
    public ContructorInjectionComponent(Student student ) {
        System.out.println(this.getClass().getName() + " contructor called");
        this.student = student;
    }


    public ContructorInjectionComponent(Student student, int rollNumber) {
        System.out.println(this.getClass().getName() + " contructor called");
        this.student = student;
    }


    @PostConstruct
    public void postConstruct(){
        System.out.println(toString());
    }
}
