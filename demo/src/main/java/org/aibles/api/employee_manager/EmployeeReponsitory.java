package org.aibles.api.employee_manager;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeReponsitory extends JpaRepository<Employee, Long> {
}
