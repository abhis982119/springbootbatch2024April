package com.test.demo.scopeofbean.controller;

import com.test.demo.scopeofbean.bean.RequestScopeBean;
import com.test.demo.scopeofbean.bean.SessionScopeBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

@RestController
public class HttpRequestController {

    private RequestScopeBean requestScopeBean;

    private SessionScopeBean sessionScopeBean;

    public HttpRequestController(RequestScopeBean requestScopeBean, SessionScopeBean sessionScopeBean) {
        this.requestScopeBean = requestScopeBean;
        this.sessionScopeBean = sessionScopeBean;
    }

    @GetMapping("/requestScope")
    public String  requestScope(){
        String result =  requestScopeBean.getText();
        requestScopeBean.setText(String.valueOf(System.currentTimeMillis() + "  : new value "));
        return result;
    }


    @GetMapping("/sessionScope")
    public String sessionScope(){
        String result =  sessionScopeBean.getText();
        sessionScopeBean.setText(String.valueOf(System.currentTimeMillis() + "  : new value "));
        return result;
    }



}
