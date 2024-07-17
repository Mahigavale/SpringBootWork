package jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnectionMySql {
	public static void main(String[] args) {
		try {
			
			// 1. Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2","root","root");
			//3.prepare the query to execute
			
			PreparedStatement stmt=con.prepareStatement("insert into intutech values(15,'krish','28000');");
			
			int i=stmt.executeUpdate();
			System.out.println("number of rows affected are:"+i);
			
		
			//System.out.println("MySql Db Connection Successful...");
			
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
