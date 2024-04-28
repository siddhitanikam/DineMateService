package com.ood.employeeManagementService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ood.employeeManagementService.entity.Employee;
import com.ood.employeeManagementService.service.EmployeeService;

@RestController
@RequestMapping("/employeeservice/api/v1")
public class EmployeeMgmtController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/employee/{empId}")
	public ResponseEntity<?> getEmployee(@PathVariable(name = "empId", required = true) int empId) {
		System.out.println(" ");
		return new ResponseEntity<>(employeeService.getEmployeebyId(empId), HttpStatus.OK);
	}
	
	@PostMapping("/addEmployee")
	public ResponseEntity<?> getScheduleById(@RequestBody Employee employee) {
		System.out.println("In controller"+employee.toString());
		return new ResponseEntity<>(employeeService.addEmployee(employee), HttpStatus.OK);

	}

}
