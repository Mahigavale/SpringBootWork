package com.datavalidation.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.datavalidation.entity.employee;
import com.datavalidation.repository.employeerepo;

@Service
public class employeeservice {

	@Autowired
	employeerepo repo1;
	
	
	public String saveemployee( employee emp)
	{  
		 String num=emp.getEmp_mobile();
		 String desg=emp.getEmp_designation();
		 
		 ArrayList<String> designations = new ArrayList<>();
		 designations.add("hr");
		 designations.add("tl");
		 designations.add("vp");
		 designations.add("fresher");
		 designations.add("manager");
		 designations.add("associate");
		 boolean flag=true;
		 while(flag==true)
		 { if(num.length() !=10)
		 {
			 flag=false;
			 return "please enter the valid phone number...!";
			 
		 }
		 else if(designations.contains(desg)==false)
		 {
			 flag=false;
			  return "please enter one of the following designations only:"
			  		+ "hr,tl,vp,fresher,manager,associate";
		 
		 }
		 else if(emp.getEmp_state().toUpperCase()=="MAHARASHTRA")
		{
			 flag=true;
		}
		else
		{
			flag=false;
		}
		
	}
	
	repo1.save(emp);
	return "the employee with the name"+emp.getEmp_name()+ "is added sucessfully....!";
		 }
	
		 
	}

