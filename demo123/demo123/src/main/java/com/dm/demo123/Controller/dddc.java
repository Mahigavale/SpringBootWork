package com.dm.demo123.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.dm.demo123.Repository.dddr;
import com.dm.demo123.entity.ddd;

public class dddc {

	
	@Autowired
	dddr r1;
	
	@PostMapping("/add")
	public String add(@RequestBody ddd d)
	{
		r1.save(d);
		return "addded sucessfully..!";
	}
	
}
