package com.companyEmployees.employeeDetails.service;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.companyEmployees.employeeDetails.dao.CompanyRepository;
import com.companyEmployees.employeeDetails.entity.Company;

import ch.qos.logback.classic.Logger;

//import dao.CompanyRepository;
//import dao.EmployeeRepository;
//import entity.*;
//import exceptions.ResourceNotFoundException;

@Service
public class CompanyService {
	
	@Autowired
	CompanyRepository companyRepository;
	
	private static final Logger logger=(Logger) LoggerFactory.getLogger(CompanyService.class);
	
	
	public List<Company> getAllCompanies(){
		logger.trace("Entered getAllCompanies() method of CompanyService");
		List<Company> companiesList=companyRepository.findAll();
		logger.trace("Fetched list of all companies from db");
		return companiesList;
	}

	public Company addCompany(Company company) {
		// TODO Auto-generated method stub
		Company addedCompany=companyRepository.save(company);
		return addedCompany;
	}

}
