package com.practise.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practise.entity.Leader;
import com.practise.repository.LeaderRepository;

@RestController
public class LeaderController {
	
	@Autowired
	private LeaderRepository repo1;
	
	@PostMapping("add-leader")
	public String addl(@RequestBody Leader ld)
	{
		repo1.save(ld);
		return "leader added sucessfully....";
	}
	
	@GetMapping("get-leader")
	public List<Leader> getl()
	{
		return repo1.findAll();
	}
	
	@GetMapping("get-leader-by-id")
	public Leader getbyid(@RequestParam("id") int id)
	{
		return repo1.findById(id).get();
	}

}
