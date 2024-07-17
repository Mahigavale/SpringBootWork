package com.institute.Services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.institute.Bean.Product;

@Service
public class ProductService {

	ArrayList<Product> lst= new ArrayList<Product>();
	
	public void AddProduct(Product P1)
	{
		lst.add(P1);
	}
	public ArrayList<Product> GetProduct()
	{
		return lst;
	}
}
 