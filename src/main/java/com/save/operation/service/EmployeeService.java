package com.save.operation.service;

import java.util.List;

import com.save.operation.model.Employee;

public interface EmployeeService {

      public Employee saveEmployee(Employee employee);
      
      public List<Employee> getAllEmployee();
}
