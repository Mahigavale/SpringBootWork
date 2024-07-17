package com.learning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//used to declare the class as the controller which will communicate the request and response of the server.
public class demorest {

	@GetMapping("/show")
	//get mapping annotation is used for the getting the methods in the url of the given spring Application
	public String Returndata()
	{
		return " hi this is the demo project for the rest apis";
	}
	

}
