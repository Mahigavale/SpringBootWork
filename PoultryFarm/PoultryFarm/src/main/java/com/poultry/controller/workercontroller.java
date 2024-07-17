package com.poultry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.poultry.entity.Worker;
import com.poultry.repository.workerrepo;

@RestController
public class workercontroller {
	
	@Autowired
	workerrepo repo3;
	
	@PostMapping("/add-worker")
	public String addw(@RequestBody Worker worker)
	{
		repo3.save(worker);
		return "worker added sucessfully....!";
		}
	
	@GetMapping("/get-worker")
	public List<Worker> getallw()
	{
		return repo3.findAll();
	}
	
	@DeleteMapping("/delete-worker-by-id")
	public String deleteworker()
	{
		
		return"the worker with the id deleted sucessfully...!";
	}
	
	@PutMapping("/update-worker")
	public String updateworker()
	{
		return "the worker updated sucessfully..! ";
	}

}
