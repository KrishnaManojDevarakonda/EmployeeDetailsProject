package com.companyEmployees.employeeDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyEmployees.employeeDetails.dao.EmployeeRepository;
import com.companyEmployees.employeeDetails.entity.Employee;
import com.companyEmployees.employeeDetails.exceptions.ResourceNotFoundException;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public Employee insertEmployeeData(Employee employee) throws NullPointerException{
		if(employee==null) {
			throw new NullPointerException();
		}
	
		Employee newEntry=employeeRepository.save(employee);
		System.out.println("Object saved");
		return newEntry;
	}
	
	public Employee getEmpInfo(int empId) throws ResourceNotFoundException {
		return employeeRepository.findById(empId).orElseThrow(()->new ResourceNotFoundException("Resource not found"));
	}

	
	public String removeEmp(int empId) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(empId);
		return "Successful";
	}

	public String removeAllEmp() {
		// TODO Auto-generated method stub
		employeeRepository.deleteAll();
		return "Deleted All Employee Records";
	}

}
