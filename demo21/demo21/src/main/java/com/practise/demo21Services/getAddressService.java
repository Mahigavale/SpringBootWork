package com.practise.demo21Services;

import org.springframework.stereotype.Service;

@Service
//step first is to declare the class as the service class.
public class getAddressService {
  private String City;
  //private String divison;
	public  String SetAd(String j)
	{
		this.City=j;
		//this.divison=K;
		return "the total adress is"+City;
		//System.out.println("total adresss is"+j+K);
		
	}
	
}
