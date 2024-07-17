package com.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.services.getAgeService;

//import com.learning.services.getAgeService;

//now this class is controller and can be used for the rest api requests and responses with the services.
@RestController
public class getAgeController {

	@Autowired
	getAgeService ctrl;
	// if you use the same class name for the autowired annotation then it will give the circular reference to dependacy injection.
	//remember the fact that you have to use the autowired for services in the controller.
	//now the dependacy is injected successfully in the given class from the service class.
	// in the url use the getmapping name and not the name of the method
	//localhost:8080/dmm?year=2001
	@GetMapping("/dmm")
	public String returnage(@RequestParam("year") int year)
{
	
		int s=ctrl.GetYear(year);
		System.out.println("the age is:"+s);
		
		return "hi user your age is"+s+"years";
}
	

	// remember the fact comments are not allowed immediately after the annotations.
}
