package com.orm.hibernate.dao.impl;

import com.orm.hibernate.dao.api.IEmployeeDAO;
import com.orm.hibernate.entities.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Repository
public class EmployeeDAO implements IEmployeeDAO {

    @Autowired
    private EntityManager entityManager;


    @Override
    public void save(Employee employee) {
        getCurrentSession().persist(employee);
    }

    @Override
    public List<Employee> getEmployee(List<Integer> employeeId){

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = builder.createQuery(Employee.class);
        Root<Employee> employee = criteriaQuery.from(Employee.class);

        criteriaQuery.select(employee);

        return   getCurrentSession().createQuery(criteriaQuery).getResultList();
    }

    @Override
    public Employee getEmployee(Integer employeeId){

        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> criteriaQuery = builder.createQuery(Employee.class);
        Root<Employee> employee = criteriaQuery.from(Employee.class);


        criteriaQuery.select(employee);
        criteriaQuery.where(builder.equal(employee.get("employeeId"),employeeId));

       return entityManager.createQuery(criteriaQuery).getSingleResult();
    }

    private Session getCurrentSession() {
        return entityManager.unwrap(Session.class);
    }




}
