package com.example;

import org.apache.catalina.core.ApplicationContext;
//import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import com.example.config.democonfig;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
		  
		
	}
	
//	@Primary
	
	  public democonfig demo1() 
	{ 
		
		democonfig dm1= new democonfig(); 
		return dm1;
	  
	  }
	 
	/*
	 * public democonfig demo2() { democonfig dm2= new democonfig(); return dm2; }
	 */
}

