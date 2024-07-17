package com.institute.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.institute.Bean.Product;
import com.institute.Services.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService prs;
	//localhost:9090/addProduct
	@PostMapping("/addProduct")
	public String Add(@RequestBody Product p1)
	{
		System.out.println(p1.getId());
		System.out.println(p1.getPrice());
		prs.AddProduct(p1);
		return "value added successfully....";
		
	}
	//localhost:9090/getProduct
	@GetMapping("/getProduct")
	public ArrayList<Product> Get()
	{
		ArrayList<Product> p2=prs.GetProduct();
		/*
		 * for(Product p4: p2) { System.out.println(p4.getId());
		 * System.out.println(p4.getPrice()); }
		 */
	//	System.out.println(prs.GetProduct());
		
		return prs.GetProduct();
	}
}
