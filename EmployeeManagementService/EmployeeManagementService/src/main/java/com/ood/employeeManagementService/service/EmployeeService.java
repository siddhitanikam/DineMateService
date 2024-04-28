package com.ood.employeeManagementService.service;

import com.ood.employeeManagementService.entity.Employee;

public interface EmployeeService {
	
	public Employee getEmployeebyId(int empId);
	
	public String addEmployee(Employee employee);

}
