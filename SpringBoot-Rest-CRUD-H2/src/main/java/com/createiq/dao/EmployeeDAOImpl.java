package com.createiq.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.createiq.model.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> findAll() {
		return jdbcTemplate.query("SELECT * FROM EMP_TAB", new BeanPropertyRowMapper<Employee>(Employee.class));
	}

	@Override
	public Employee findById(Integer eid) {
		return jdbcTemplate.queryForObject("SELECT * FROM EMP_TAB WHERE EID = ?",
				new BeanPropertyRowMapper<Employee>(Employee.class), eid);
	}

	@Override
	public Integer save(Employee employee) {
		return jdbcTemplate.update("INSERT INTO EMP_TAB VALUES(?,?,?)",
				new Object[] { employee.getEid(), employee.getEname(), employee.getEsal() });
	}

	@Override
	public Integer update(Employee employee) {
		return jdbcTemplate.update("UPDATE EMP_TAB SET ENAME  = ? , ESAL = ? WHERE EID = ?",
				new Object[] { employee.getEname(), employee.getEsal() , employee.getEid()});
	}

	@Override
	public Integer deleteById(Integer eid) {
		return jdbcTemplate.update("DELETE FROM EMP_TAB WHERE EID = ?",
				new Object[] { eid });
	}

}
