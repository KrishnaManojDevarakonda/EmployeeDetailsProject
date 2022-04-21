package com.companyEmployees.employeeDetails.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Company {
	
	@Id
	private int company_id;
	private int company_age;
	private String company_name;
	
	@OneToMany(mappedBy="company",cascade= {CascadeType.ALL})
//	@JoinColumn(name="emp_id",referencedColumnName="emp_id")
//	@JoinColumn(name="emp_id", referencedColumnName = "emp_id").....,cascade=CascadeType.ALL
	private List<Employee> empList=new ArrayList<Employee>();

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(int id, int company_id, int company_age, String company_name, List<Employee> empList) {
		super();
//		this.id = id;
		this.company_id = company_id;
		this.company_age = company_age;
		this.company_name = company_name;
		this.empList = empList;
	}

//	public int getId() {
//		return id;
//	}

//	public void setId(int id) {
//		this.id = id;
//	}

	public int getCompany_id() {
		return company_id;
	}

	public void setCompany_id(int company_id) {
		this.company_id = company_id;
	}

	public int getCompany_age() {
		return company_age;
	}

	public void setCompany_age(int company_age) {
		this.company_age = company_age;
	}

	public String getCompany_name() {
		return company_name;
	}

	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}

	@JsonManagedReference
	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	

	
	
	

}
