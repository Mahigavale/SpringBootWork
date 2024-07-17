package com.JSON.EMPLOYEE.Service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.JSON.EMPLOYEE.Bean.Employee;

@Service
public class EmployeeService {


	ArrayList<Employee> lst= new ArrayList<Employee>();
	
	public void AddEmployee(Employee emp1)
	{
		
		lst.add(emp1);
	}
	public Employee SearchEmployee(int id)
	{
		Employee e=null;
		
		for(Employee n:lst)
		{
			if(n.getEmp_Id()==id)
			{
				e=n;
			}
			break;
		}
		return e;
	}	
	
	public void DeleteEmployee(int id)
	{
		lst.remove(SearchEmployee(id));
	}
	
	public void UpdateEmployee()
	{
		System.out.println("employee updated sucessfully....!");
	}
	public ArrayList<Employee> GetEmployee()
	{
		return lst;
	}
}
