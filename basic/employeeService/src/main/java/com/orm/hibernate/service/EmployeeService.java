package com.orm.hibernate.service;

import com.orm.hibernate.dao.api.IEmployeeDAO;
import com.orm.hibernate.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional( transactionManager = "platformTransactionManager")
public class EmployeeService {

    @Autowired
    private IEmployeeDAO employeeDAO;

    @Autowired
    private CacheService cacheService;

    public void save(Employee employee){
        employeeDAO.save(employee);
        cacheService.save(String.valueOf(employee.getEmployeeId()), employee);
    }


    public Employee get(int employeeId){
        Employee employee = cacheService.getEmployee(String.valueOf(employeeId));
        if(employee != null ){
            System.out.println("Returning employee from cache");
           return employee; // returned cached value
        }

        System.out.println("Employee not found in cache, so hitting database");
        employee = employeeDAO.getEmployee(employeeId); // hit the database

        if(employee != null ){
            System.out.println("Employee found in database, updating in cache.");
            cacheService.save(String.valueOf(employeeId), employee);
        }

        System.out.println("returning employee from database");
        return employee;
    }
}
