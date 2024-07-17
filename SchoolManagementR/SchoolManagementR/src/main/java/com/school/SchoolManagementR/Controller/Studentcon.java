package com.school.SchoolManagementR.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.school.SchoolManagementR.Entity.Student;
import com.school.SchoolManagementR.Repository.studentrepo;

@RestController
public class Studentcon {
	
	@Autowired
	studentrepo repo1;
	
	@PostMapping("/add-student")
	public String Addstudent(@RequestBody Student student)
	{
		repo1.save(student);
		return "student added sucessfully.....!";
	}
	
	@GetMapping("/get-all-students")
	public List<Student> getallstudents()
	{
		return repo1.findAll();
	}
	
	@PutMapping("/update-student")
	public String updatestudent()
	{
		return "student updated sucessfully....!";
	}
	
	@DeleteMapping("/delete-student")
	public String deletestudent(@RequestParam("id") int id)
	{
		repo1.deleteById(id);
		return "the student with the id"+id+"deleted successfully...!";
	}
	

}
