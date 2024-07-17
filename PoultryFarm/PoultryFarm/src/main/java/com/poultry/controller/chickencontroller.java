package com.poultry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poultry.entity.Chicken;
import com.poultry.repository.chickenrepo;

@RestController
public class chickencontroller {
	
	@Autowired
	chickenrepo repo2;
	 
	
	@PostMapping("/add-chicken")
	public String add(@RequestBody Chicken chicken)
	{
		repo2.save(chicken);
		return "The chicken information added sucessfully..!";
	}
	
	@GetMapping("/get-all-chicken")
	public List<Chicken> getallchicken()
	{
		return repo2.findAll();
	}
	
	@DeleteMapping("/delete-all-chicken")
	public String deleteall()
	{
		return "all chicken deleted...!";
	}
	
	@PutMapping("/update-chicken-info")
	public String updatechicken()
	{
		return "the chicken information updated successfully....!";
	}

}
