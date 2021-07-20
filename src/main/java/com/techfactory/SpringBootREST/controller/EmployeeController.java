package com.techfactory.SpringBootREST.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techfactory.SpringBootREST.entity.Employee;
import com.techfactory.SpringBootREST.service.EmployeeMockDataProvider;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeMockDataProvider dummyDataProvider;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Employee>> getAllEmployees() {
		List<Employee> response = dummyDataProvider.getDummyEmployeeData();
		return new ResponseEntity<List<Employee>>(response,HttpStatus.OK);
	}

}
