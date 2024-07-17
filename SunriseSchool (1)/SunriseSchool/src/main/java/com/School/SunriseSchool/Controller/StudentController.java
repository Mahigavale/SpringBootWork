package com.School.SunriseSchool.Controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.School.SunriseSchool.Entity.Student;
import com.School.SunriseSchool.Repository.Studentrepo;

@RestController
public class StudentController {

	@Autowired
	Studentrepo repo3;
	
	@PostMapping("/add-student")
	public String addstudent(@RequestBody Student student)
	{
		repo3.save(student);
		return "the student with the name"+ student.getStudent_name()+"is added sucessfully..!";
	}
	
	@GetMapping("/get-all-students")
	public Set<Student> getallstudents()
	{
		return (Set<Student>) repo3.findAll();
	
    }
}
