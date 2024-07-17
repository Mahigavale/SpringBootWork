package com.learning.services;



import org.springframework.stereotype.Service;

@Service
public class getAgeService {

	
	
	public int GetYear(int year)
	{  int current=2023;
		int finall=current-year;
		
		return finall;
	}
}
