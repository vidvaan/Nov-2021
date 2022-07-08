package com.createiq.service;

import java.util.List;

import com.createiq.model.Employee;

public interface EmployeeService {
	List<Employee> findAll();
	List<Employee> findByEname(String ename);
	Employee findById(Integer eid);
	Employee save(Employee employee);
	Employee update(Employee employee);
	void deleteById(Integer eid);
}
