package com.example.demo.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Component
public class EmployeeServices {
	
	@Autowired
	private EmployeeRepository emp_repo;
	
	// Create
	public Employee saveEmployee(Employee employee) {
		return emp_repo.save(employee);
	}
	
	// Select all
	public List<Employee> getAllEmployee() {
		return emp_repo.findAll();
	}
	
	// Select one
	public Optional<Employee> getEmployeeById(Long id) {
		return emp_repo.findById(id);
	}
	
	// Update
	public Employee updateEmployee(Long id, Employee new_employee_details) {
		
		Employee emp1 = emp_repo.findById(id).orElseThrow();
		emp1.setName(new_employee_details.getName());
		emp1.setEmail(new_employee_details.getEmail());
		emp1.setDepartment(new_employee_details.getDepartment());
		
		return emp_repo.save(emp1);
	}
	
	// Delete
	public void deleteEmployee(Long id) {
		emp_repo.deleteById(id);
	}
}
