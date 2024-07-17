package com.institute.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.Entity.Student;
import com.institute.Repositories.Studentrepo;

@RestController
public class StudentController {

	@Autowired
	Studentrepo repo1;
	
	@PostMapping("/add-student")
	public String addstudent(@RequestBody Student student) {
		
		repo1.save(student);
		return "the student is added sucessfully.....!";
	}
	
	@GetMapping("/get-all-student")
	public List<Student> getallstudent()
	{
		return repo1.findAll();
	}
	
}
