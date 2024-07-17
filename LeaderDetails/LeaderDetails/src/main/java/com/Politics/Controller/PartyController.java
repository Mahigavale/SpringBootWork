package com.Politics.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.Politics.Entity.Party;
import com.Politics.Repository.Partyrepo;

@RestController
public class PartyController {

	
	@Autowired
	Partyrepo repo1;
	
	
	@PostMapping("/add-party")
	public String addparty(@RequestBody Party party)
	{
		
		 repo1.save(party);
		return "party added sucessfully....";
	}
	
	@GetMapping("/get-all-parties")
	public List<Party> getallparties()
	{
		return repo1.findAll();
	}
	
	@PutMapping("/update-party")
	public String updateparty()
	{
		return "the party information is upaterd sucessfully....!";
	
	}
	
	@DeleteMapping("/delete-party")
	public String deleteparty(@RequestParam("id")int id)
	{
		 repo1.deleteById(id);
		 
		 return "the party with the id"+id+"is deleted sucessfully...!";
	}

}
