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

import com.school.SchoolManagementR.Entity.Schoolmanagement;
import com.school.SchoolManagementR.Repository.schoolrepo;

@RestController 
public class Schoolcon {

	@Autowired
	schoolrepo repo2;
	
	@PostMapping("/add-school")
	public String addschool(@RequestBody Schoolmanagement school)
	{
	      repo2.save(school);
		 return"school added sucessfully.....!";
	}
	
	@GetMapping("/get-school")
	public List<Schoolmanagement> getallschool()
	{
		return repo2.findAll();
	}
	
	@PutMapping("/update-school")
	public String updateschool()
	{
		return "school updated successfully....!";
	}
	
	@DeleteMapping("/delete-school")
	public String deleteschool(@RequestParam("id") int id )
	{
		repo2.deleteById(id);
		
		return "the school with id "+id+"deleted sucessfully..!";
	}
}
