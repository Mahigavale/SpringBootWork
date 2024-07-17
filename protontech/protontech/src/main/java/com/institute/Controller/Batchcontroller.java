package com.institute.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.Entity.Batch;
import com.institute.Repositories.Batchrepo;

@RestController
public class Batchcontroller {

	@Autowired
	Batchrepo repo2;
	
	@PostMapping("/add-batch")
	public String addbatch(@RequestBody Batch batch)
	{
		repo2.save(batch);
		return "the batch with name:"+batch.getBatch_name()+"added sucessfully..!";
	}
	@GetMapping("/get-all-batch")
	public List<Batch> getallbatches()
	{
		return repo2.findAll();
	}
}
