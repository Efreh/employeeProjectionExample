package com.efr.employeeProjectionExample.service;

import com.efr.employeeProjectionExample.repository.EmployeeRepository;
import com.efr.employeeProjectionExample.repository.projection.EmployeeProjection;
import com.efr.employeeProjectionExample.service.interfaces.EmployeeServiceProjection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeProjectionServiceImpl implements EmployeeServiceProjection {

    private final EmployeeRepository repository;

    @Autowired
    public EmployeeProjectionServiceImpl(EmployeeRepository repository) {
        this.repository = repository;
    }

    // Метод для получения всех проекций сотрудников
    public List<EmployeeProjection> getAllEmployeesProjection(){
        // Возвращает список проекций сотрудников, полученных из репозитория
        return repository.findAllProjectedBy();
    }
}