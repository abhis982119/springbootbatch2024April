package com.orm.hibernate.controller;

import com.orm.hibernate.entities.Employee;
import com.orm.hibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @PostMapping("/save")
    public void save(@RequestBody Employee employee){
        System.out.println("employee object : " + employee);
        employeeService.save(employee);
    }



    @GetMapping("/get")
    public Employee getEmployee(@RequestParam int employeeId){
        System.out.println("about to get employee with id " + employeeId) ;
        return  employeeService.get(employeeId);
    }
}
