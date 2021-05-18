package com.codeclan.employee.employeeService.repositories;

import com.codeclan.employee.employeeService.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {
}
