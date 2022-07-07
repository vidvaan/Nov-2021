package com.createiq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.createiq.dao.EmployeeDAO;
import com.createiq.model.Employee;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDAO employeeDAO;

	@Override
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	public Employee findById(Integer eid) {
		return employeeDAO.findById(eid);
	}

	@Override
	public Integer save(Employee employee) {
		return employeeDAO.save(employee);
	}

	@Override
	public Integer update(Employee employee) {
		return employeeDAO.update(employee);
	}

	@Override
	public Integer deleteById(Integer eid) {
		return employeeDAO.deleteById(eid);
	}
	
	
	

}
