package com.example.e2e5.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.e2e5.Repository.Addressrepo;
import com.example.e2e5.entity.PassengerAddressEntity;

@RestController
public class PassengerAddressController {
	
	@Autowired
	Addressrepo repo3;
	
	@PostMapping("/add-passenger-address")
	public String addadd(@RequestBody PassengerAddressEntity b)
	{
		  repo3.save(b);
	  return "Passenger address added sucessfully....:";	
	}

	@GetMapping("/get-passenger-addresses")
	public List< PassengerAddressEntity> getalladdresses()
	{
		return repo3.findAll();
	}
}
