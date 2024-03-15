package org.aibles.api.employee_manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeReponsitory employeeReponsitory;
    public List<Employee> getAllListEmployee() {
        return employeeReponsitory.findAll();
    }

    public Employee updateEmployee(Long id, Employee newEmployee) {
        Employee existingEmployee = employeeReponsitory.findById(id).orElse(null);
        if (existingEmployee != null) {
            existingEmployee.setEmployee_name(newEmployee.getEmployee_name());
            existingEmployee.setDayOfBirth(newEmployee.getDayOfBirth());
            existingEmployee.setPosition(newEmployee.getPosition());
            existingEmployee.setAddress(newEmployee.getAddress());
            return employeeReponsitory.save(existingEmployee);
        }
        return null;
    }
}
