package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.institute.Entity.student;
import com.institute.repository.studentrepo;

@RestController
public class studentcontroller {
	
	@Autowired
	studentrepo repo3;
	
	@PostMapping("/add-student")
	public String add(@RequestBody student sr)
	{
		repo3.save(sr);
		return "the student with the name"+sr.getStudent_name()+"is added sucessfully";
	}
	
	@GetMapping("/get-students")
	public List<student> getstudents()
	{
		return repo3.findAll();
	}
	@GetMapping("/get-that-student")
	public student getstudentwithid(@RequestParam("id")int id)
	{
		return repo3.findById(id).get();
	}
	
	@PutMapping("/update-student")
	public String update(@RequestParam("name")String name,@RequestParam("name1") String name1)
	{
		repo3.updatestudent(name, name1); 
		
		return "the student with the name"+name1+"is updated sucessfully..!";
		
	}
	
	@DeleteMapping("/delete-student")
	public String delete(@RequestParam("id") int id)
	{
		repo3.deleteById(id); 
		return "the student with the id"+id+"is deleted sucessfully...!";
	}
	
	@GetMapping("/get-by-city")
	public List<student> getbycity(@RequestParam("city") String city)
	{
		return repo3.getstudentbycity(city);
	}

}
