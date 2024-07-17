package com.practise.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practise.entity.Party;
import com.practise.repository.PartyRepository;

@RestController
public class PartyController {

	
	
	@Autowired
	private PartyRepository repo2;
	
	@PostMapping("/add-party")
	public String addparty(@RequestBody Party pt)
	{
		repo2.save(pt);
		
		return "party information added sucessfully.....";
	}
	
	@GetMapping("/get-party")
	public List<Party> getparty()
	{
		return repo2.findAll();
	}
	
	@GetMapping("get-by-id")
	public  Party getpartybyid(@RequestParam("id") int id)
	{
		return repo2.findById(id).get();
	}
	@GetMapping("get-all")
	public List<Party> select()
	{
		return repo2.Selectall();
	}
}
