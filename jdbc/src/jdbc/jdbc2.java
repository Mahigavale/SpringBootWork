package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class jdbc2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 
			 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2","root","root");
			// System.out.println("connection sucessfull...!");
			 
			 PreparedStatement stmt= con.prepareStatement("select * from intutech;");
			/*
			 * int id; String name; String fees; Scanner sc=new Scanner(System.in);
			 * System.out.println("please enter your name :"); name=sc.next();
			 * System.out.println("please enter your id:"); id=sc.nextInt();
			 * System.out.println("please enter your fees:"); fees=sc.next();
			 * PreparedStatement
			 * stmt=con.prepareStatement("insert into intutech values(?,?,?);");
			 * stmt.setInt(1, id); stmt.setString(2, name); stmt.setString(3, fees);
			 */
           
			// int i=stmt.executeUpdate();
			 
			 ResultSet rs=stmt.executeQuery();
			 
			 while(rs.next())
			 {
				 System.out.println("id :"+rs.getInt("id"));
				 System.out.println("name :"+rs.getString("name"));
				 System.out.println("fees :"+rs.getString("fees"));
				 System.out.println("------------------------------------------------");
			 }
			 
			 
			 
			 
		 }
		 catch(Exception ex){
			 System.out.println(ex);
			 
		 }
	}

}
