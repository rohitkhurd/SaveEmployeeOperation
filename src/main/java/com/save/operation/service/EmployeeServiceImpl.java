package com.save.operation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.save.operation.model.Employee;
import com.save.operation.repository.EmployeeRepositopry;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private  EmployeeRepositopry employeeRepository;

	@Override
	public Employee saveEmployee(Employee employee) {
	
		return employeeRepository.save(employee);
		
	}

	@Override
	public List<Employee> getAllEmployee() {
		return  employeeRepository.findAll();
		
	}

}
