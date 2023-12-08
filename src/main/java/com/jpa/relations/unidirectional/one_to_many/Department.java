package com.jpa.relations.unidirectional.one_to_many;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "uni_Department_one_to_many")
@Table(name = "uni_Department_one_to_many")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(targetEntity = Employee.class, fetch = FetchType.LAZY)
    @JoinColumn(name="department_id")
    private List<Employee> employeeList;
}
