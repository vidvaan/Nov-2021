package com.createiq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.createiq.model.Employee;
import com.createiq.template.CreateIqTemplate;

//@Repository
public class EmployeeDAOWithCreateIqTemplateImpl implements EmployeeDAO {

	@Autowired
	private CreateIqTemplate createIqTemplate;

	public void save(Employee employee) {
		createIqTemplate.update("INSERT INTO EMP_TAB VALUES(?,?,?)",
				new Object[] { employee.getEid(), employee.getEname(), employee.getEsal() });
	}

	public void update(Employee employee) {
		createIqTemplate.update("UPDATE EMP_TAB SET ENAME = ? , ESAL = ? WHERE EID = ?",
				new Object[] { employee.getEname(), employee.getEsal(), employee.getEid() });
	}

	public void deleteById(Integer eid) {
		createIqTemplate.update("DELETE FROM EMP_TAB WHERE EID = ?", new Object[] { eid });
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
}
