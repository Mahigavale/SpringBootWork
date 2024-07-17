package com.calculator.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.Service.calculatorlogic;

@RestController
public class CalculatorController {

	@Autowired
	calculatorlogic nvc;
	@GetMapping("/add")
	public int getadd(@RequestParam("i1") int i1, @RequestParam("i2") int i2)
	{
		
		 int result=nvc.Add(i1, i2);
		 System.out.println("result is:"+result);
		 return result;
	}
	@GetMapping("/sub")
	public int getsub(@RequestParam("i1") int i1,@RequestParam("i2") int i2)
	{
		int result=nvc.Sub(i1, i2);
		System.out.println("result is:"+result);
		return result;
	}
	
}
