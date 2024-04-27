package com.test.demo.dependencyinjectiontype.fieldinjection;

import com.test.demo.beans.Student;
import jakarta.annotation.PostConstruct;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@ToString
@Component
public class FieldInjectionBean {

    @Autowired
    private Student student;

    @PostConstruct
    public void postConstruct(){
        System.out.println(toString());
    }
}
