package com.orm.hibernate.model.request;

import com.orm.hibernate.constants.Department;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeCreateRequest {

    private String name;

    private Department department;
}
