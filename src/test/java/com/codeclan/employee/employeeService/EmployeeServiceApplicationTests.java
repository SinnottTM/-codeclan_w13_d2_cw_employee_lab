package com.codeclan.employee.employeeService;

import com.codeclan.employee.employeeService.models.Department;
import com.codeclan.employee.employeeService.models.Employee;
import com.codeclan.employee.employeeService.models.Project;
import com.codeclan.employee.employeeService.repositories.DepartmentRepository;
import com.codeclan.employee.employeeService.repositories.EmployeeRepository;
import com.codeclan.employee.employeeService.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest

class EmployeeServiceApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeDepartmentAndProjects(){

		Department department1 = new Department("Code Lads");
		departmentRepository.save(department1);

		Employee employee1 = new Employee("Bob", "Workerman", 2, department1);
		employeeRepository.save(employee1);

		Project project1 = new Project("Super cool fun times plan", 120);
		projectRepository.save(project1);

		employee1.addProject(project1);
		employeeRepository.save(employee1);

	}

}
