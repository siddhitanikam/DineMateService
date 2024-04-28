package com.ood.employeeManagementService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ood.employeeManagementService.entity.Employee;
import com.ood.employeeManagementService.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee getEmployeebyId(int empId) {
		return employeeRepository.findById(empId).get();
	}

	@Override
	public String addEmployee(Employee employee) {
		return employeeRepository.save(employee) != null ? "Success" : "Failed";
	}
	
	
}
