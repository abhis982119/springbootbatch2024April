package com.orm.hibernate.dao.api;

import com.orm.hibernate.entities.Employee;

import java.util.List;

public interface IEmployeeDAO {

    public void save(Employee employee);

    public Employee getEmployee(Integer employeeId);

    public List<Employee> getEmployee(List<Integer> employeeId);
}
