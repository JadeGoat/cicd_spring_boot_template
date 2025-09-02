package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeServices;

@RestController
@RequestMapping("/api/employees") //http://localhost:8088/api/employees (Base URL Path)
public class EmployeeController {

	@Autowired
	private EmployeeServices employeeServices;

	// http://localhost:8088/api/employees/add
	/*
	 {    
    		"department": "IT",
    		"name": "John",
    		"email": "john@abc.com"
	 }
	 */
	@PostMapping("/add")
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		
		Employee emp = employeeServices.saveEmployee(employee);
		System.out.println("Employee POST service successfully");
		return ResponseEntity.ok(emp);
	}
	
	// http://localhost:8088/api/employees/get_all
	@GetMapping("/get_all")
	public List<Employee> getEmployeeAll() {
		
		List<Employee> emp_list = employeeServices.getAllEmployee();
		System.out.println("Employee GET service successfully");			
		return emp_list;
	}
		
	// http://localhost:8088/RestAPIExample/api/employees/get_one/1
	@GetMapping("/get_one/{id}") 
	public ResponseEntity<Employee> getEmployeeOne(@PathVariable("id") Long id) {
		
		Employee emp = employeeServices.getEmployeeById(id).orElseThrow();
		System.out.println("Employee GET service successfully");
		return ResponseEntity.ok(emp);
	}
	
	// http://localhost:8088/api/employees/put
	/*
	 {    
	  		"id": 1,
    		"department": "IT",
    		"name": "S. John",
    		"email": "john@abc.com"
	 }
	 */
	@PutMapping("/put")
	public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
		
		Employee emp = employeeServices.updateEmployee(employee.getId(), employee);
		System.out.println("Employee PUT service successfully");
		return ResponseEntity.ok(emp);
	}
	
	// http://localhost:8088/api/employees/delete/1
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("id") Long id) {
		
		employeeServices.deleteEmployee(id);
		System.out.println("Employee DELETE service successfully");
		return ResponseEntity.noContent().build();
		
	}
}
