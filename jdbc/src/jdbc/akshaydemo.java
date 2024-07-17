package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class akshaydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Class.forName("com.mysql.cj.jdbc.Driver"); // step first
		
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/akki","root","root");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter name of farmer");
		 String name=sc.next();
		 System.out.println("enter area of farmer");
		 int area=sc.nextInt();
		 System.out.println("enter loan of farmer");
		 double loan=sc.nextDouble();
		 PreparedStatement stmt=con.prepareStatement("insert into farmer values(?,?,?)");
		 stmt.setString(1, name);
		 stmt.setInt(2, area);
		 stmt.setDouble(3, loan);
		 int j=stmt.executeUpdate();
		 System.out.println("rows affected:"+j);
		}
  catch(Exception e)
		{
	  System.out.println(e.getLocalizedMessage());
		}
	}

}
