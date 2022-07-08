package com.createiq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	
	
	
	@GetMapping("/findAll")
	public List<Employee> findAll(){
		return employeeService.findAll();
	}
	
	@GetMapping("/findByEname/{ename}")
	public List<Employee> findByEname(@PathVariable String ename){
		return employeeService.findByEname(ename);
	}
	
	
	
	@GetMapping("/findById/{eid}")
	public Employee findById(@PathVariable Integer eid){
		return employeeService.findById(eid);
	}
	
	
	@PostMapping("/add")
	public String save(@RequestBody Employee employee){
		System.out.println(employee);
		employeeService.save(employee);
		return "Inserted fully Success";
	}

	
	@PutMapping("/update")
	public String update(@RequestBody Employee employee){
		employeeService.update(employee);
		return "Updated  Successfully";
	}

	
	@DeleteMapping("/deleteById/{eid}")
	public String deleteById(@PathVariable Integer eid){
		employeeService.deleteById(eid);
		return "Deleted  Successfully";
	}

}
