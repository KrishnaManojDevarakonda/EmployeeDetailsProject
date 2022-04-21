package com.companyEmployees.employeeDetails.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Employee {
	
	@Id
	
	private int emp_id;
	private String emp_name;
	private String unit;
	@ManyToOne
	@JoinColumn(name="company_id", referencedColumnName = "company_id")
	private Company company;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int id, int emp_id, String emp_name, String unit, Company company) {
		super();
//		this.id = id;
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.unit = unit;
		this.company = company;
	}
//	public int getId() {
//		return id;
//	}
//	public void setId(int id) {
//		this.id = id;
//	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	@JsonBackReference
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	
	
	

}

