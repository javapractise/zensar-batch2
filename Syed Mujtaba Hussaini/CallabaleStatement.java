package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CallableStatement {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/employee";
		String uname = "root";
		String password = "Temp1234";
		String query = "select * from zensaremp";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(url, uname, password);
			Statement statement = con.createStatement();
			java.sql.CallableStatement c = con.prepareCall("{call getname(?)}");
			
			c.setString(1, "Ava");
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
AVA
Retreieved the output on the console !!
**/