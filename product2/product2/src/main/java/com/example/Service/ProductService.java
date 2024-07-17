package com.example.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.Bean.Product;

@Service
public class ProductService {

	
	ArrayList<Product> list= new ArrayList<Product>();
	
	
	public void AddProduct(Product P1)
	{
		list.add(P1);
	}
	public ArrayList<Product> ShowProduct()
	{
		
		return list;
	}
	
}
