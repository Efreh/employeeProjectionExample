package com.efr.employeeProjectionExample.controller;

import com.efr.employeeProjectionExample.repository.projection.EmployeeProjection;
import com.efr.employeeProjectionExample.service.EmployeeProjectionServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/projections")
public class EmployeeProjectionController {

    // Сервис для работы с проекциями сотрудников
    private final EmployeeProjectionServiceImpl employeeService;

    public EmployeeProjectionController(EmployeeProjectionServiceImpl employeeService) {
        this.employeeService = employeeService;
    }

    // Метод для получения всех проекций сотрудников
    @GetMapping
    public List<EmployeeProjection> getAllEmployeesProjection() {
        return employeeService.getAllEmployeesProjection();
    }
}