package com.orm.hibernate.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.apache.tomcat.util.buf.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.FormSubmitEvent;
import java.net.http.HttpRequest;

@Controller
@RestController
public class SessionClassController {



  //  @RequestMapping(name = "greeting", method = RequestMethod.POST)
    @GetMapping("/greeting")
    public String sessionRequest(HttpServletRequest request, @RequestParam String userName) {
        HttpSession session = request.getSession();
        String sessionUserName = (String) session.getAttribute("name");

        if (sessionUserName != null && sessionUserName.length() > 0) {
            userName = sessionUserName;
        }else{
            session.setAttribute("name", userName);
        }

        return "Hello, " + userName;
    }
}
