package com.example.product3.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.product3.bean.Product;
import com.example.product3.service.ProductService;
@RestController
public class product3Controller {

	
	@Autowired
	ProductService prs;
	
	@PostMapping("/add")
	public String addProduct(@RequestBody Product p6)
	{
		 prs.AddProduct(p6);
		return "product added sucessfull......!";
	}
	
	@GetMapping("/showproducts")
	public ArrayList<Product> showp()
	{
		return prs.ShowProduct();
	}
	
}
