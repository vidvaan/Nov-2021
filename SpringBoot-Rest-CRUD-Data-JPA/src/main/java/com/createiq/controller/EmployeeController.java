package com.createiq.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.createiq.model.Employee;
import com.createiq.service.EmployeeService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/employee")
public class EmployeeController {
	
	private static Logger log =LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	
	
	@GetMapping(path = "/findAll")
	public ResponseEntity<List<Employee>> findAll(){
		log.debug("Find All Msg ");
		return new ResponseEntity<List<Employee>>(employeeService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/findByEname/{ename}")
	public ResponseEntity<List<Employee>> findByEname(@PathVariable String ename){
		return new ResponseEntity<List<Employee>>(employeeService.findByEname(ename), HttpStatus.OK);
	}
	
	
	
	@GetMapping(path = "/findById/{eid}",produces= {"application/json","application/xml"})
	public ResponseEntity findById(@PathVariable Integer eid){
		 Employee employee = employeeService.findById(eid);
		 if(employee == null) {
			 return new ResponseEntity("Record not Found in DB ",HttpStatus.NOT_FOUND);
		 }
		return new ResponseEntity(employee, HttpStatus.OK);
	}
	
	
	@PostMapping("/add")
	public String save(@Valid @RequestBody Employee employee){
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
