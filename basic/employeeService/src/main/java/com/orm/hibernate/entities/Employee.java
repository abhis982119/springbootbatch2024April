package com.orm.hibernate.entities;

import com.orm.hibernate.constants.Department;
import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Service;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =  "employeeIdPKeyGenerator")
    @SequenceGenerator(name = "employeeIdPKeyGenerator", sequenceName = "emp_id_seq",initialValue=2,allocationSize=2)
    private int employeeId;


    private String name;

    private Department department;

    private short status;

    @Transient
    private int totalSalaryEarned;


    @ManyToOne(fetch = FetchType.EAGER,  cascade = CascadeType.ALL)
    @JoinColumn(name = "company_id")
    private Company company;



}
