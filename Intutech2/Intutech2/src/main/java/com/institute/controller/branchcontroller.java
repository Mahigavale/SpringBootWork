package com.institute.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.Entity.branch;
import com.institute.repository.branchrepo;

@RestController
public class branchcontroller {

	  @Autowired
	  branchrepo repo2;
	  
	  @PostMapping("/add-branch")
	  public String addbranch(@RequestBody branch br)
	  {
		  repo2.save(br);
		  return "the branch added successfully.....!";
	  }
	  
	  @GetMapping("/get-all-branches")
	  public List<branch> getbranch()
	  {
		  return repo2.findAll();
	  }
	  
	  
	  @PutMapping("/update-the-branch")
	  public String update()
	  {
		  return "the branch is updated sucessfully...!";
	  }
	  
	  @DeleteMapping("/delete-the-branch/{name}")
	  public String delete(@PathVariable("name") String name )
	  {  
		  repo2.deleteById(name);
		  return "the branch with the name"+name+"is deleted sucessfully...!";
	  }
}
