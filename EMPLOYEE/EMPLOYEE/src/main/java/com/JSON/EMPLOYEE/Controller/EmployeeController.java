package com.JSON.EMPLOYEE.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.JSON.EMPLOYEE.Bean.Employee;
import com.JSON.EMPLOYEE.Service.EmployeeService;

@RestController
public class EmployeeController {

	
	
	@Autowired
	EmployeeService srvvs;
	
	
	@PostMapping("/add")
	public String addEmployee(@RequestBody Employee e3)
	{
		srvvs.AddEmployee(e3);
		return "Employee added sucessfully....!";
	}
	
	
	public ArrayList<Employee> getEmployee()
	{
		return srvvs.GetEmployee();
	}
	
}
