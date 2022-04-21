package com.companyEmployees.employeeDetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.companyEmployees.employeeDetails.entity.Company;
import com.companyEmployees.employeeDetails.service.CompanyService;

@RestController
@RequestMapping("/report/company")
public class CompanyController {
	
	@Autowired
	CompanyService companyService;
	
	@GetMapping("/all")
	public ResponseEntity<List<Company>> getAllCompanies(){
		return new ResponseEntity<List<Company>>(companyService.getAllCompanies(),HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<Company> addCompany(@RequestBody Company company){
		return new ResponseEntity<Company>(companyService.addCompany(company),HttpStatus.ACCEPTED);
	}
	
	

}
