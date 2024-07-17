package com.revision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revision.entity.demoe;
import com.revision.repository.demoerepo;

@RestController
public class demoecontroller {

	
	@Autowired
	demoerepo repo1;
	
	@PostMapping("/add-person")
	public String addperson(@RequestBody demoe dm)
	{
		 repo1.save(dm);
		return "the person with the name "+dm.getName()+" added sucessfully...";
	}
	
	@GetMapping("/get-all-persons")
	public List<demoe> getall()
	{
		return repo1.findAll();
	}
}
