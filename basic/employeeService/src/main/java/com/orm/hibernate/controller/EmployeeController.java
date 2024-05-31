package com.orm.hibernate.controller;

import com.orm.hibernate.entities.Employee;
import com.orm.hibernate.model.response.EmployeeDetailResponse;
import com.orm.hibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/save")
    public void save(@RequestBody Employee employee) {
        System.out.println("employee object : " + employee);
        employeeService.save(employee);
        RestTemplate restTemplate = new RestTemplate();
    }


    @GetMapping("/get")
    public EmployeeDetailResponse getEmployee(@RequestParam int employeeId) {
        System.out.println("about to get employee with id " + employeeId);
        Employee employee = employeeService.get(employeeId);
        return EmployeeDetailResponse.builder().name(employee.getName()).companyName(employee.getCompany().getName())
                .status(employee.getStatus()).department(employee.getDepartment()).build();
    }
}
