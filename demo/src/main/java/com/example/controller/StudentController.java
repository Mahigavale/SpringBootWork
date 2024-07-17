package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
 
	@GetMapping("/show") //
	 public String  showInfo()
	 {
		  return " this is the show method of the Student Controller.....! ";
	 }
	@GetMapping("/sdt")
	public int showdate()
	{
		return 78563;
	}
}
