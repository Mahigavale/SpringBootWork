package com.example.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bean.Product;
import com.example.Service.ProductService;

@RestController
public class ProductController {

	
	
	@Autowired
	ProductService srvs;
	
	@PostMapping("/add")
	public String AddPrd(@RequestBody Product p2)
	{
		srvs.AddProduct(p2);
		return "Product addded sucessfully.....!";
	}
	@GetMapping("/get")
	public ArrayList<Product> ShowProd()
	{
		return srvs.ShowProduct();
	}
	
}
