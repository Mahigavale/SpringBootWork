package com.datavalidation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.datavalidation.entity.employee;
import com.datavalidation.service.employeeservice;

@RestController
public class employeecontroller {

	
	
	@Autowired
	employeeservice service;
	
	
	@PostMapping("/add-employee")
	public String addemployee(@RequestBody employee emp)
	{
	  
		return service.saveemployee(emp);
	}
	
	
}

