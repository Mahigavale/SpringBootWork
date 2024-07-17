package com.institute.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.institute.Entity.Address;
import com.institute.Repositories.Addressrepo;

public class AddressController {

	
	@Autowired
	Addressrepo repo4;
	
	@PostMapping("/add-address")
	public String addaddress(@RequestBody Address address)
	{
		repo4.save(address);
		return "the address of the student id:"+address.getStudent()+"added sucessfully..!";
	}
	
	@GetMapping("/get-all-addresses")
	public List<Address> getalladdress()
	{
		return repo4.findAll();
	}
}
