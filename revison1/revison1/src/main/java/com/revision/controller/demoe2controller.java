package com.revision.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.revision.entity.demoe2;
import com.revision.repository.demoe2repo;

@RestController
public class demoe2controller {

	
	@Autowired
	demoe2repo repo2;
	
	
	@PostMapping("/add2")
	public String add2(@RequestBody demoe2 dm2)
	{
		repo2.save(dm2);
		return "the second person added sucessfully...";
	}
	
	@GetMapping("/getall")
	public List<demoe2> getall()
	{
		return repo2.findAll();
	}
}
