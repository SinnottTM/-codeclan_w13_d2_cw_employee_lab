package com.codeclan.employee.employeeService.controllers;

import com.codeclan.employee.employeeService.models.Department;
import com.codeclan.employee.employeeService.repositories.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    //  INDEX
    @GetMapping(value="/departments")
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }

    //  SHOW (by ID)
    @GetMapping(value="/departments/{id}")
    public Optional<Department> getDepartment(@PathVariable Long id){
        return departmentRepository.findById(id);
    }
}
