package com.Politics.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Politics.Entity.Leader;
import com.Politics.Repository.Leaderrepo;

@RestController
public class LeaderController {


	 @Autowired
	 Leaderrepo repo2;
	 
	 
	 @PostMapping("/add-leader")
	 public String addleader(@RequestBody Leader leader)
	 {
		repo2.save(leader);
		 return "the leader added sucessfully...!";
	 }
	 
	 @GetMapping("/get-leader")
	 public List<Leader> getleaders()
	 {
		  return  repo2.findAll();
	 }
	
	 @PutMapping("/update-leader")
	 public String updateleader()
	 {
		 return "the leader is updated sucessfully...:";
	 }
	 
	 @DeleteMapping("/delete-leader")
	 public String deleteleader(@RequestParam("id") int id)
	 {
		 return "the leader with the id"+id + "is deleted sucessfully..!";
	 }
	
}
