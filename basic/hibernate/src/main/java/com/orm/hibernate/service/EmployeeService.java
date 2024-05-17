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

    public void save(Employee employee){
        employeeDAO.save(employee);
    }


    public Employee get(int employeeId){
       return  employeeDAO.getEmployee(employeeId);
    }
}
