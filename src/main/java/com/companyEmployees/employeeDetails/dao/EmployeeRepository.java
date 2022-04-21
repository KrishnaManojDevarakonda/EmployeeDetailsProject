package com.companyEmployees.employeeDetails.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.companyEmployees.employeeDetails.entity.*;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
