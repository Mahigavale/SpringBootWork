package edu.learning.student;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import edu.learning.config.DBConnectionConfig;

@Component
public class StudentInfo {
	
	@Autowired  // Is use to Inject the Object of one class into another class which a Dependency Injection (DI) process 
	@Lazy
	@Qualifier("mysqlConn") // use to specify the object to be injected.
	DBConnectionConfig abc;
	// HAS-A relation (StudentInfo HAS-A DBConfiguration)
	Scanner scan= new Scanner(System.in);
	public StudentInfo() {
		System.out.println("StudentInfo Object Created");
	//	System.out.println(abc.getUrl());
//		System.out.println(abc.getUsername());
		System.out.println("enter url:");
		String URL= scan.next();
		abc.setUrl(URL);
		System.out.println("you set the url here......");
		abc.getUrl();
	}
	public void print() {
		System.out.println("This is Test method from StudentInfo");
	}
	
	public void saveStudentData() {
		System.out.println("Save Student Information....");
	}
	public StudentInfo(String url)
	{
		System.out.println("this is the url"+url);
	}
}




