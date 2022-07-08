package com.createiq.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.createiq.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	List<Employee> findByEname(String ename);
	
	List<Employee> findByEnameAndEsal(String ename,Double esal);
	
	//Select * from Employee Where ENAME  = ?
	
	@Query("from Employee e where e.ename = ?1 and e.esal = ?2")
	List<Employee> hqlFindByEname(String ename,Double esal);

}
