package com.institute.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.Services.EmployeeService;
import com.institute.bean.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService esr;
	//localhost:8080/insert-Employee
	@PostMapping("/insert-Employee")
	public String PostEmployee(@RequestBody Employee enf )
	{
		esr.AddEmployee(enf);
		return "the employee added successfully....";
		
	}
	//localhost:8080/get-Employee
	@GetMapping("/get-Employee")
	public List<Employee> getEmployee()
	{
		return esr.ShowEmployee();
	}
	//localhost:8080/update-Employee
	@PutMapping("/update-Employee")
	public String updateEmployee()
	{
		return "employee updated sucessfully......!";
	}
	//localhost:8080/delete-Employee
	@DeleteMapping("/delete-Employee")
	public String DeleteEmployee(@RequestParam("id")int id)
	{
		 esr.DeleteEmployee(id);
		return "employee deleted sucessfully.....!";
	}
}
