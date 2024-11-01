package com.efr.employeeProjectionExample.repository;

import com.efr.employeeProjectionExample.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

// Аннотация, указывающая, что интерфейс является репозиторием и будет доступен через REST API
@RepositoryRestResource
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}