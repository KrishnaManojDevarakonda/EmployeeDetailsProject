package com.companyEmployees.employeeDetails.globalExceptionHandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.companyEmployees.employeeDetails.exceptions.*;
// Global Exception Handler
@ControllerAdvice
public class ControllerAdvisor {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<String> resourceNotFoundExceptionHandler(ResourceNotFoundException ex){
		return new ResponseEntity<String>("Resource Not Found", HttpStatus.NO_CONTENT);
	}

}
