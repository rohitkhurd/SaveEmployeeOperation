package com.save.operation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.save.operation.model.Employee;
import com.save.operation.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/save/employee")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		
		Employee emp2=employeeService.saveEmployee(employee);
		
		return ResponseEntity.ok().body(emp2);
		
	}
	
//	@GetMapping("/getemployee")
//	public List<Employee> getAllEmployee(){
//		
//		return employeeService.getAllEmployee();
//	}
	
}
