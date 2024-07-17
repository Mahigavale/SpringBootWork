package com.example.e2e6.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.e2e6.Entity.Passengerdetails;
import com.example.e2e6.Repository.Passengerrepo;

@RestController
public class Passengercontroller {
   
	@Autowired
	Passengerrepo repo1;
	
	@PostMapping("/add-passenger")
	public String addpassenger(@RequestBody Passengerdetails pd)
	{
		repo1.save(pd);
		
		return "passenger added sucessfully...";
	}
	
	@GetMapping("/get-passengers")
	public List<Passengerdetails> getpassengers()
	{
		
		return repo1.findAll();
	}
	
	@PutMapping("/update-passengers")
	public String updatepassengers()
	{
		return "passenger updated sucessfully...:";
	}
	
	@DeleteMapping("/delete-passenger")
	public String deletepassenger(@RequestParam("id") int id)
	{ 
		repo1.deleteById(id);
		
		return "passenger deleted sucessfully....";
	}
}
