package com.orm.hibernate.filter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.hibernate.annotations.Filter;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;


public class FirstFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        System.out.println("Executing first filter ");

        filterChain.doFilter(request,response);
    }
}
