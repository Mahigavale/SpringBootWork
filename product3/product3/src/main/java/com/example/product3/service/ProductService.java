package com.example.product3.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.product3.bean.Product;

@Service
public class ProductService {

	ArrayList<Product> list4= new ArrayList<Product>();
	
	
	public void AddProduct(Product p5)
	{
		list4.add(p5);
	}
	public ArrayList<Product> ShowProduct()
	{
		return list4;
	}
}
