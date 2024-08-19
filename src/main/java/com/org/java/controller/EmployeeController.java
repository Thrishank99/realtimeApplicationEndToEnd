package com.org.java.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	
	Logger logger = LoggerFactory.getLogger(EmployeeController.class);
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/welcome")
	public String welcomeTest() {
		logger.trace("it is trace method welcome calling");
		logger.info("wel come method is working");
		return "WELCOME TO SPRING BOOT APPLICATION DEVELOPMENT MY THRISHANK APPlication UNIT TESTING AND 20% CODE COVERAGE COMPLETED DESIGN PATTERAN AND PROPERTIES ADDED.JANVERY MONTH NEWLLY ADDED THE DATA PLESE CHECK THROW JENKINS AND DOCKER";
	}

	@PostMapping("/save")
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee) {
		Employee emp = employeeService.saveEmployeeDetails(employee);
		logger.info("start for save the data");
		return new ResponseEntity("Sucessfully saved in to a Db", HttpStatus.CREATED);

	}
	@GetMapping("/findAll")
	public ResponseEntity<List<Employee>> findAllEmployess() {
		logger.info("satart for getting the data getting the data");
		List<Employee> emplist = employeeService.findAllEmployeeDetails();
		logger.info("sucessfully getting the data");
		return new ResponseEntity<List<Employee>>(emplist, HttpStatus.OK);

	}

	
	

}
