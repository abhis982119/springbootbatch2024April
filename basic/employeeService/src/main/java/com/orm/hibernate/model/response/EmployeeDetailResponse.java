package com.orm.hibernate.model.response;

import com.orm.hibernate.constants.Department;
import jakarta.persistence.Transient;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDetailResponse {

    private String name;
    private Department department;
    private short status;
    private int totalSalaryEarned;
    private String companyName;
}
