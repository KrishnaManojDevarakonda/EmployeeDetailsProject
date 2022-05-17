package com.companyEmployees.employeeDetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.companyEmployees.employeeDetails.entity.Employee;
import com.companyEmployees.employeeDetails.exceptions.ResourceNotFoundException;
import com.companyEmployees.employeeDetails.service.CompanyService;
import com.companyEmployees.employeeDetails.service.EmployeeService;

//import entity.Company;
//import entity.Employee;
//import exceptions.ResourceNotFoundException;
//import service.CompanyService;

@RestController
@RequestMapping("/report/employee")
public class EmployeeController {
	
	@Autowired
//	@Qualifier("com.companyEmployees.employeeDetails.service.CompanyService")
	EmployeeService empService;
	
	
	
	@PostMapping("/addEmployeeDetails")
	public ResponseEntity<Employee> insertData(@RequestBody Employee employee) throws NullPointerException {
		return ResponseEntity.ok().body(empService.insertEmployeeData(employee));
	}
	
	@GetMapping("/{empId}")
	public ResponseEntity<Employee> getEmpInfo(@PathVariable(value="empId") int empId) throws ResourceNotFoundException{
		return ResponseEntity.ok().body(empService.getEmpInfo(empId));
	}
	
	@DeleteMapping("/{empId}")
	public ResponseEntity<?> removeEmp(@PathVariable(value="empId") int empId) throws ResourceNotFoundException{
		return new ResponseEntity<String>(empService.removeEmp(empId),HttpStatus.ACCEPTED);
	}
	
	@DeleteMapping("/")
	public ResponseEntity<?> removeAllEmp(){
		return new ResponseEntity<String>(empService.removeAllEmp(),HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/test")
	public String testEmployeeController() {
		return "Employee Controller is working";
	}

}
