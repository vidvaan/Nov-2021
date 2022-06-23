package com.createiq.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
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
	
	
	public void addWithPsCallback(Employee employee) {
		String sql = "INSERT INTO EMP_TAB VALUES(?,?,?)";
		
		PreparedStatementCallback<Boolean> psc = (ps) -> {
			ps.setInt(1, employee.getEid());
			ps.setString(2, employee.getEname());
			ps.setDouble(3, employee.getEsal());
			return ps.execute();
		};
		
		jdbcTemplate.execute(sql, psc);
	}

	public void update(Employee employee) {
		jdbcTemplate.update("UPDATE EMP_TAB SET ENAME = ? , ESAL = ? WHERE EID = ?",
				new Object[] { employee.getEname(), employee.getEsal(), employee.getEid() });
	}

	public void deleteById(Integer eid) {
		jdbcTemplate.update("DELETE FROM EMP_TAB WHERE EID = ?", new Object[] { eid });
	}
	
	public List<Employee> findAll() {
		
//		RowMapper<Employee> employeeRowMapper = (rs, rowNum) -> {
//			Employee employee = new Employee();
//			employee.setEid(rs.getInt("eid"));
//			employee.setEname(rs.getString("ename"));
//			employee.setEsal(rs.getDouble("esal"));
//			return employee;
//		};		
		
//		return jdbcTemplate.query("SELECT * FROM EMP_TAB", employeeRowMapper);
		
//		return jdbcTemplate.query("SELECT * FROM EMP_TAB", new BeanPropertyRowMapper<Employee>(Employee.class));
		
		
		ResultSetExtractor<List<Employee>> rse = (rs) -> {
			List<Employee> employees = new ArrayList<Employee>();
			  while(rs.next()) {
				  Employee employee = new Employee();
				  employee.setEid(rs.getInt("eid"));
				  employee.setEname(rs.getString("ename"));
				  employee.setEsal(rs.getDouble("esal"));
				  employees.add(employee);
			  }
			return employees;
		};
		
		return jdbcTemplate.query("SELECT * FROM EMP_TAB", rse);
	}

}
