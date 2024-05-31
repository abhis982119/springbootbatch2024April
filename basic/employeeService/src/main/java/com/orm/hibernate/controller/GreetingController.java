package com.orm.hibernate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GreetingController {

    /*
       returning name of view
       after viewResolver : /WEB-INF/jsp/simplegreeting.jsp
     */
    @GetMapping("/simpleGreeting")
    public String greet( ){
        System.out.println("Controller : simpleGreeting executed");
        return "simplegreeting";
    }


    /*
    Model with returning view-name
     */
    @GetMapping("/hello")
    public String hello(@RequestParam String name, Model model){
        System.out.println("Controller : /hello exectuted");
        model.addAttribute("username", name);
        return "hello";
    }


    /*
       ModelAndView
     */
    @GetMapping("/hellomv")
    public ModelAndView hellomv(@RequestParam String name){
        System.out.println("Here I'm");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username", name);
        modelAndView.setViewName("hello");
        return modelAndView;
    }

}
