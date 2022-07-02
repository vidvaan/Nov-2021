package com.createiq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;

//@Controller+@ResponseBody = @RestController
@RestController
@RequestMapping("/rest/emp")
public class EmployeeRestController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/findAll")
	public  List<Employee> findAll() {
		List<Employee> employees = employeeService.findAll();
		return employees;
	}
	
	
	@RequestMapping(value="/findById/{eid}")
	public  Employee findById(@PathVariable("eid") Integer eid) {
		return employeeService.findById(eid);
	}
	
   
}
