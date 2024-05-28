package com.orm.hibernate.filter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class SecondFilter extends OncePerRequestFilter {
    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        //pre-filter
        System.out.println("Executing second filter");
        if(System.currentTimeMillis()%2 == 0 ){
            response.setStatus(HttpServletResponse.SC_OK);
            response.setContentType("application/json");
            response.getWriter().write("{\n" +
                    "  \"error\" : \"You are not authenticated to use this page\" \n" +
                    "}");
            return;
        }

        filterChain.doFilter(request, response); //forward request to other filter or method in chain



        //post-filter '
        System.out.println("Executing second filter : post method execution");
    }
}
