package com.test.demo.scopeofbean.bean;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@ToString
@Setter
@Getter
@SessionScope
@Component
public class SessionScopeBean {

    private String text = "session scope bean default text";

}
