package com.test.demo.dependencyinjectiontype.setterinjection;

import com.test.demo.beans.Student;
import jakarta.annotation.PostConstruct;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ToString
@Component
public class SetterInjectionComponent {


    private Student student;

    @Autowired
    public void setStudent(Student student) {
        System.out.println(this.getClass().getName() + " setter method called ");
        this.student = student;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println(toString());
    }
}
