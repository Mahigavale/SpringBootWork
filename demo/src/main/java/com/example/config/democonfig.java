package com.example.config;

import java.beans.JavaBean;

import org.springframework.stereotype.Component;


@Component
public class democonfig {

	/*
	 * Integer number; String name;
	 */
	
	 public democonfig()
	 {
			/*
			 * this.number=j;
			 * 
			 * this.name=n;
			 */
		 
		 System.out.println("this is the constructor injection......");
	 }
	//constructor injection ^
	//setter injection
	/*
	 * public void SetNumber(int b) { this.number=b; } public void SetName( String
	 * b) { this.name=b; }
	 * 
	 */
}
