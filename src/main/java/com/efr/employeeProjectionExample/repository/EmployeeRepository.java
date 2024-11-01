package com.efr.employeeProjectionExample.repository;

import com.efr.employeeProjectionExample.model.Employee;
import com.efr.employeeProjectionExample.repository.projection.EmployeeProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // Метод для получения всех сотрудников с использованием проекций
    List<EmployeeProjection> findAllProjectedBy();
}