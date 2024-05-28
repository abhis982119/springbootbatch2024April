package com.orm.hibernate.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {


    @Bean
    public FilterRegistrationBean<FirstFilter> firstFilter(){
        FilterRegistrationBean<FirstFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new FirstFilter());
        registrationBean.addUrlPatterns("/simpleGreeting/*");
        registrationBean.setOrder(0);
        return registrationBean;
    }

    @Bean
    public FilterRegistrationBean<SecondFilter> secondFilter(){
        FilterRegistrationBean<SecondFilter> registrationBean = new FilterRegistrationBean<>();
        registrationBean.setFilter(new SecondFilter());
        registrationBean.addUrlPatterns("/simpleGreeting/*");
        registrationBean.setOrder(1);
        return registrationBean;
    }

}
