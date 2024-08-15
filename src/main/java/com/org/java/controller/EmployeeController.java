package com.org.java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.java.entity.Employee;
import com.org.java.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/welcome")
	public String welcomeTest() {
		return "WELCOME TO SPRING BOOT APPLICATION DEVELOPMENT MY THRISHANK APPlication UNIT TESTING AND 20% CODE COVERAGE COMPLETED DESIGN PATTERAN AND PROPERTIES ADDED.JANVERY MONTH NEWLLY ADDED THE DATA PLESE CHECK THROW JENKINS AND DOCKER";
	}

	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee emp = employeeService.saveEmployeeDetails(employee);
		return new ResponseEntity("Sucessfully saved in to a Db", HttpStatus.CREATED);

	}
	@GetMapping("/findAll")
	public ResponseEntity<List<Employee>> findAllEmployess() {
		List<Employee> emplist = employeeService.findAllEmployeeDetails();
		return new ResponseEntity<List<Employee>>(emplist, HttpStatus.OK);

	}

	
	

}
