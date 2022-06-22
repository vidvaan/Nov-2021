package com.createiq.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void save(Employee employee) {
		jdbcTemplate.update("INSERT INTO EMP_TAB VALUES(?,?,?)",
				new Object[] { employee.getEid(), employee.getEname(), employee.getEsal() });
	}

	public void update(Employee employee) {
		jdbcTemplate.update("UPDATE EMP_TAB SET ENAME = ? , ESAL = ? WHERE EID = ?",
				new Object[] { employee.getEname(), employee.getEsal(), employee.getEid() });
	}

	public void deleteById(Integer eid) {
		jdbcTemplate.update("DELETE FROM EMP_TAB WHERE EID = ?", new Object[] { eid });
	}

}
