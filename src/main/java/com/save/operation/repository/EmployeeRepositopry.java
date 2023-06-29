package com.save.operation.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.save.operation.model.Employee;

public interface EmployeeRepositopry extends JpaRepository<Employee, Integer> {

}
