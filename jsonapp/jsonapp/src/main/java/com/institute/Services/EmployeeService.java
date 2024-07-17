package com.institute.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.institute.bean.Employee;

@Service
public class EmployeeService {

	ArrayList<Employee> emplist= new ArrayList<Employee>();
	
	
	public void AddEmployee(Employee emp)
	{
		emplist.add(emp);
	}
	
	public ArrayList<Employee> ShowEmployee()
	{
		return emplist;
	}
	
	public void  DeleteEmployee(int id)
	{
		    emplist.remove(getEmployee(id));   //we can remove the object directly from the ArrayList
		
	}
	
	public Employee getEmployee(int id)
	{
		Employee emp1=null;
		for(Employee eml:emplist)
		{
			if(eml.getEmp_id()==id)
			{
				emp1=eml;
				break;
			}
			
		}
		return emp1;
	}
	
}
