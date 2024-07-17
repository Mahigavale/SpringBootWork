package com.hibernate.endtoend1.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.endtoend1.Entity.StudentTable;
import com.hibernate.endtoend1.Repository.StudentTableRepository;



@RestController
public class StudentController {

	
	@Autowired
	StudentTableRepository repo;
	
	
	// remember that the object of the repository and the object of the entity class mustn't the same.
	
	@PostMapping("/insert-student")
	public String InsertStudent(@RequestBody StudentTable student)
	{	
		repo.save(student);
		
		
		return " student updated sucessfully...";
	}
	
	@PutMapping("/update-student")
	public String update(@RequestBody StudentTable student)
	{ 
		repo.save(student);
		return "student updated sucessfully.....!";
	}
	
	@DeleteMapping("/delete-student")
	public String delete( @PathVariable("id") int id)
	{
		repo.deleteById(id);
		return "Student deleted sucessfully.....!";
	}
	
	@GetMapping("/get-all-students")
	public List<StudentTable> getall()
	{
		return  repo.findAll();
	}
	
	@GetMapping("get-by-id/")
	public StudentTable getbyid(@PathVariable("id") int id)
	{
		return repo.findById(id).get();
	}
}
