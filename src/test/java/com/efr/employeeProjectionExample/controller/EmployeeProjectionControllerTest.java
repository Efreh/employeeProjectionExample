package com.efr.employeeProjectionExample.controller;

import com.efr.employeeProjectionExample.repository.projection.EmployeeProjection;
import com.efr.employeeProjectionExample.service.EmployeeProjectionServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class EmployeeProjectionControllerTest {

    @InjectMocks
    private EmployeeProjectionController employeeProjectionController;

    @Mock
    private EmployeeProjectionServiceImpl employeeService;

    // Метод, который выполняется перед каждым тестом
    @BeforeEach
    void setUp() {
        // Инициализация моков
        MockitoAnnotations.openMocks(this);
    }

    // Тестирование метода получения всех проекций сотрудников
    @Test
    void testGetAllEmployeesProjection() {
        // Создание первого мока для EmployeeProjection
        EmployeeProjection employee1 = new EmployeeProjection() {
            @Override
            public String getFullName() {
                return "John Doe";
            }

            @Override
            public String getPosition() {
                return "Developer";
            }

            @Override
            public String getDepartmentName() {
                return "IT";
            }
        };

        // Создание второго мока для EmployeeProjection
        EmployeeProjection employee2 = new EmployeeProjection() {
            @Override
            public String getFullName() {
                return "Jane Smith";
            }

            @Override
            public String getPosition() {
                return "Manager";
            }

            @Override
            public String getDepartmentName() {
                return "HR";
            }
        };

        // Создание списка проекций сотрудников
        List<EmployeeProjection> projections = Arrays.asList(employee1, employee2);
        // Определение поведения мока при вызове метода
        when(employeeService.getAllEmployeesProjection()).thenReturn(projections);

        // Act: вызов тестируемого метода
        List<EmployeeProjection> result = employeeProjectionController.getAllEmployeesProjection();

        // Assert: проверки корректности результата
        assertEquals(2, result.size()); // Проверка размера списка
        assertEquals("John Doe", result.get(0).getFullName()); // Проверка полного имени первого сотрудника
        assertEquals("Developer", result.get(0).getPosition()); // Проверка должности первого сотрудника
        assertEquals("IT", result.get(0).getDepartmentName()); // Проверка отдела первого сотрудника

        assertEquals("Jane Smith", result.get(1).getFullName()); // Проверка полного имени второго сотрудника
        assertEquals("Manager", result.get(1).getPosition()); // Проверка должности второго сотрудника
        assertEquals("HR", result.get(1).getDepartmentName()); // Проверка отдела второго сотрудника
    }
}