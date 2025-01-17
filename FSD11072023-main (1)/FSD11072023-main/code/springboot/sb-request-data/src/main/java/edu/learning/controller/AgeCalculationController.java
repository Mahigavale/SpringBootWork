package edu.learning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import edu.learning.service.AgeCalculationService;

@RestController // to declare this as the Controller or the bean class so that
// the spring handles the methods and to use the methods in this class in link.
public class AgeCalculationController {
	
	@Autowired
	AgeCalculationService calculationService;
	// this is used for injecting the dependancy in this class.
	// to add the object of the different class into this class.

	//localhost:8080/get-age-by-param?name=Abc&year=2000
	@GetMapping("/get-age-by-param")
	public String calculateAgeByParam(@RequestParam("name") String name
			,@RequestParam("year") int year) {
		System.out.println("Name : " + name);
		System.out.println("Birth Year : " + year);
		int age = calculationService.getAge(year);
		String message = "Hello User, " + name + " Your age is : " + age;
		return message;
	}
	
	// http://localhost:8080/get-age-by-path-varaible/Abc/2000
	@GetMapping("/get-age-by-path-varaible/{name}/{year}")
	public String calculateAgeByPathVaraible(@PathVariable("name") String name,
			@PathVariable("year") int year) {
		int age = calculationService.getAge(year);
		String message = "Hello User, " + name + " Your age is : " + age;
		return message;
	}
	
}
