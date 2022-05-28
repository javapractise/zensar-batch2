package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class UpdateProgram {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/main","root","Ambika@91");  
			PreparedStatement stmt=con.prepareStatement("update employees set emp_designation=? where emp_id=?"); 
			stmt.setString(1, "Supporting Engineer");
			stmt.setInt(2, 101);
			int i = stmt.executeUpdate();
			System.out.println(i+" records updated");
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}

/*
Output:
1 records updated
Before:
12	Omar	Scientist
54	Chad	Quality Assurance
67	David	Developer
101	Ratan	          
617	Tracy	Tester
889	Emily	Engineering Manager
After:
12	Omar	Scientist
54	Chad	Quality Assurance
67	David	Developer
101	Ratan	Supporting Engineer        
617	Tracy	Tester
889	Emily	Engineering Manager
*/