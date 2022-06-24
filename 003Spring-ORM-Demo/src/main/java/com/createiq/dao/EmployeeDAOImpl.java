package com.createiq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.createiq.model.Employee;

@Repository
@Transactional
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private HibernateTemplate hibernateTemplate;

	public void save(Employee employee) {
		hibernateTemplate.save(employee);
		
	}

	public void update(Employee employee) {
		// TODO Auto-generated method stub
		
	}

	public void deleteById(Integer eid) {
		// TODO Auto-generated method stub
		
	}

	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
