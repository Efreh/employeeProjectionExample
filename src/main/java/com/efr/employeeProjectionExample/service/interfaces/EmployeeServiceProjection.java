package com.efr.employeeProjectionExample.service.interfaces;

import com.efr.employeeProjectionExample.repository.projection.EmployeeProjection;

import java.util.List;

// Интерфейс для сервиса, работающего с проекциями сотрудников
public interface EmployeeServiceProjection {
    // Метод для получения списка всех проекций сотрудников
    List<EmployeeProjection> getAllEmployeesProjection();
}