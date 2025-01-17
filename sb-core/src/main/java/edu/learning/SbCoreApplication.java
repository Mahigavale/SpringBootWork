package edu.learning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

import edu.learning.config.DBConnectionConfig;
import edu.learning.student.StudentAttendence;
import edu.learning.student.StudentInfo;

@SpringBootApplication
public class SbCoreApplication {
    
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SbCoreApplication.class, args);
		
		
	}
	@Bean
	public StudentInfo get()
	{
		System.out.println("this is studentInfo get() from main class.");
		StudentInfo str= new StudentInfo("www.wer.com");
		str.print();
		return str;
	}
	
	@Bean(name = "mysqlConn")
	@Primary // to make the object by default in the dependency injection process
	public DBConnectionConfig getDBObject1() {
		DBConnectionConfig config = new DBConnectionConfig("mysql url","root","too"); // Constructor Injection (CI)
		/*
		 * config.setUrl("MYSQL URL"); // Setter Injection (SI)
		 * config.setUsername("root"); config.setPassword("root");
		 */
		//System.out.println(config);
//		System.out.println(config.Connection());
		return config;
	}
	
	@Bean(name = "oracleConn")
	public DBConnectionConfig getDBObject2() {
		DBConnectionConfig config = new DBConnectionConfig("OracleSQL URL", "Orcl", "orcl"); // Constructor Injection (CI)
		return config;
	}

}
