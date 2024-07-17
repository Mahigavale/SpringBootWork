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

import com.institute.Entity.directors;
import com.institute.repository.directorrepo;

@RestController
public class directorcontroller {

	
	@Autowired
	directorrepo dr;
	
	@PostMapping("/add-director")
	public String adddirector(@RequestBody directors dr1)
	{
		dr.save(dr1);
		return "the director added sucessfully....";
	}
	
	@GetMapping("/get-all-directors")
	public List<directors> getdirectors()
	{
		return dr.findAll();
	}
	
	@GetMapping("/get-that-director")
	public directors getbyid(@RequestParam("id") int id)
	{
		return dr.findById(id).get();
	}
	@PutMapping("/update-director")
	public String updatedr()
	{
		
		return "director updated successfully....!";
	}
	
	@DeleteMapping("/delete-director")
	public String deletedr(@RequestParam("id") int id) {
		 
		dr.deleteById(id);
		
		return "the director with the id"+ id +"deleted sucessfully..!";
	}
	

}
