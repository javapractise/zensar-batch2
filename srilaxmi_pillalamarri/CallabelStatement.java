package java_connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CallabelStatement {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/empdata";
		String uname = "root";
		String password = "root123";
		String query = "select * from emp";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(url, uname, password);
			Statement statement = con.createStatement();
			java.sql.CallableStatement c = con.prepareCall("{call getname(?)}");
			
			c.setString(1, "sri");
			c.execute();
			System.out.println("Successfully executed the procedure....");
			
			ResultSet result = c.executeQuery();
			
			while(result.next()) {
				System.out.println(result.getString(1).toUpperCase());
			}
			
			System.out.println("Retreieved the output on the console !!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

/**
Successfully executed the procedure....
sri
Retreieved the output on the console !!
**/