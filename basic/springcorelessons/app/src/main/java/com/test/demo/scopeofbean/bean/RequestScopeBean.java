package com.test.demo.scopeofbean.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@ToString
@Setter
@Getter
@RequestScope
@Component
public class RequestScopeBean {

    private String text = "request scope bean default text";


}
