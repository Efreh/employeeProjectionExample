package com.efr.employeeProjectionExample.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    private String firstName;
    private String lastName;
    private String position;
    private BigDecimal salary;

    @ManyToOne(fetch = FetchType.EAGER)
    private Department department;
}
