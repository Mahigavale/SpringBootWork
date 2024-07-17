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

import com.example.e2e6.Entity.Addressdetails;
import com.example.e2e6.Repository.Addressrepo;

@RestController
public class Addresscontroller {	

	
	 @Autowired
	 Addressrepo repo2;
	 
	 @PostMapping("/add-add")
	 public String addaddress(@RequestBody Addressdetails add)
	 {
		 repo2.save(add);
		 return "address added sucessfully.....:";
	 }
	 
	 @GetMapping("/get-address")
	 public List<Addressdetails>  getaddresses()
	 {
		return  repo2.findAll();
		 
	 }
	  
	 @PutMapping("/update-address")
	 public String  updateaddress()
	 {
		 return "addresses updated sucessfully......:";
	 }
	@DeleteMapping("/delete-address")
	public String deleteaddress(@RequestParam("id") int id)
	{
		repo2.deleteById(id);
		return "Address deleted sucessfully...:";
	}
}
