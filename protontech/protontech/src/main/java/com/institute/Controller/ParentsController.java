package com.institute.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.Entity.Parents;
import com.institute.Repositories.Parentrepo;

@RestController
public class ParentsController {

	
	@Autowired
	Parentrepo repo3;
	
	public String addparents(@RequestBody Parents parents)
	{
		 repo3.save(parents);
		return "the parents with name :"+parents.getParent_mobile()+"added sucessfully..!";
	}
	
	public List<Parents> getallparents()
	{
		return repo3.findAll();
	}
	
}
