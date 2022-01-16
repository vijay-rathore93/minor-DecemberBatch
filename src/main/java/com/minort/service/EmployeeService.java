package com.minort.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.minort.model.Employee;
import com.minort.repo.EmployeeRepo;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepo employeeRepo;

	public List<Employee> getEmployees() {
		return employeeRepo.findAll();
	}

	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	public Employee deleteEmployee(Integer empId) {
		employeeRepo.deleteById(empId);
		return null;
	}

	public Employee getEmployee(Integer empId) {
		return employeeRepo.findById(empId).get();
	}

	public Employee updateEmployee(Integer empId, Employee employee) {
		Employee employeeFound = employeeRepo.findById(empId).get();
		employeeFound.setFirstName(employee.getFirstName());
		employeeFound.setAge(employee.getAge());
		employeeFound.setSalary(employee.getSalary());
		return employeeRepo.save(employeeFound);
	}

}
