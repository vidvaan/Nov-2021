package com.createiq.dao;

import java.util.List;

import com.createiq.model.Employee;

public interface EmployeeDAO {
	
	List<Employee> findAll();
	
	Employee findById(Integer eid);
	
	
	Integer save(Employee employee);
	
	Integer update(Employee employee);
	
	Integer deleteById(Integer eid);
	

}
