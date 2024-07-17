package com.example.e2e5.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.e2e5.Repository.Passengerrepo;
import com.example.e2e5.entity.PassengerEntity;

@RestController
public class PassengerController {
  
	@Autowired
	Passengerrepo repo1;
	
	@PostMapping("/add-passenger")
	public String addpassenger(@RequestBody PassengerEntity p)
	{  
		repo1.save(p);
		return "passenger added sucessfully:";
	}
	
	@GetMapping("/get-all-passengers")
	public List<PassengerEntity> getallpassengers()
	{
		return repo1.findAll();
	}
	
	@PutMapping("/update-passenger-by-id")
	@Modifying
	@Transactional
	public String updatpassenger(@RequestParam("id") int id,@RequestParam("Board") String board)
	{
		repo1.updatepassengerbyid(board, id);
		return "passenger updated sucessfully....:";
	}
	
	@DeleteMapping("/delete-passenger-by-id")
	@Modifying
	@Transactional
	public String deletepassenger(@RequestParam("id") int id)
	{
		repo1.deletepassengerbyid(id);
		return "passenger deleted sucessfully.....";
		
	}
	
	
}
