package com.endtoend2.demoe2e2.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.endtoend2.demoe2e2.Entity.studentdemo;
import com.endtoend2.demoe2e2.Repository.studentdemorepository;

@RestController
public class studentdemoController {

	@Autowired
	studentdemorepository repo;
	
	@PostMapping("/add-student")
	public String addstudent(@RequestBody  studentdemo demo)
	{
		repo.save(demo);
		
		return "Student added sucessfully....!";
	}
	@DeleteMapping("/delete-student")
	public String deletestudent(@RequestParam("id") int id)
	{
		repo.deleteById(id);
		
		return "student deleted sucessfully with the id"+id;
	}
	
	@PutMapping("/upate-student")
	public String updatestudent(@RequestBody studentdemo demo)
	{  
		repo.save(demo);
		
		return "student updated sucessfully.....!";
	}
	@GetMapping("/get-all-students")
	public List<studentdemo> getallstudnets()
	{
		return repo.findAll();
	}
	
	@GetMapping("/get-student-by-id")
	public studentdemo getstudent(@RequestParam("id") int id)
	{
		return repo.findById(id).get();
	}
}
