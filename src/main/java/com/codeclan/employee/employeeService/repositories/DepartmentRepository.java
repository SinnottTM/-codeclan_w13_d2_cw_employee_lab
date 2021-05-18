package com.codeclan.employee.employeeService.repositories;

import com.codeclan.employee.employeeService.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
