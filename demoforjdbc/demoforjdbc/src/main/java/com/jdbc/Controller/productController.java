package com.jdbc.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jdbc.Entity.product;
import com.jdbc.Repository.ProductRepo;

@RestController
public class productController {

	
	@Autowired 
	ProductRepo repo;
	
	
	@PostMapping("/insert-product")
	public String addproduct(@RequestBody product pt)
	{  repo.save(pt);
		return "product added sucessfully.....";
	}
	
	@GetMapping("/get-product")
	public List<product> getproduct()
	{
		return repo.findAll();
	}
	
	@GetMapping("/find-the-product")
	public product getproductbyid(@RequestParam("id") int id)
	{
		
		return repo.findById(id).get();
	}
}
