package com.efr.employeeProjectionExample.repository.projection;

import org.springframework.beans.factory.annotation.Value;

// Интерфейс для проекции данных сотрудников
public interface EmployeeProjection {
    // Метод, возвращающий полное имя сотрудника (имя + фамилия)
    @Value("#{target.firstName + ' ' + target.lastName}")
    String getFullName();

    // Метод, возвращающий должность сотрудника
    String getPosition();

    // Метод, возвращающий название отдела, к которому принадлежит сотрудник
    @Value("#{target.department.name}")
    String getDepartmentName();
}