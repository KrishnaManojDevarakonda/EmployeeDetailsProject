package com.companyEmployees.employeeDetails;

import org.apache.logging.log4j.LogManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class EmployeeDetailsApplication {
	private static final org.apache.logging.log4j.Logger logger=LogManager.getLogger(EmployeeDetailsApplication.class);
	

	public static void main(String[] args) {
		SpringApplication.run(EmployeeDetailsApplication.class, args);
		logger.info("Entered into EmployeeDetailsApplication" );
//		System.out.println(new EmployeeDetailsApplication().message);
		
	}

}
