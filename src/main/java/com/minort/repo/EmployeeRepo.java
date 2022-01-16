package com.minort.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minort.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
