package com.poultry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.poultry.entity.Farm;
import com.poultry.repository.Farmrepo;

@RestController
public class farmcontroller {

	@Autowired
	Farmrepo repo1;
	
	@PostMapping("/add-farm")
	public String addfarm(@RequestBody Farm farm)
	{
		repo1.save(farm);
		
		return "Farm added sucessfully....!";
	}
	
	@GetMapping("/get-farm")
	public List<Farm> getallfarms()
	{
		return repo1.findAll();
	}
	
	@PutMapping("/update-farm")
	public String updatefarm()
	{
		return "farm updated sucessfully...!";
	}
	
	@DeleteMapping("/delete-farm-by-id")
	public String deletefarm(@RequestParam("id") int id)
	{
		repo1.deleteById(id);
		return "the farm with the id"+id+"deleted successfully....!";
	}
	
}
