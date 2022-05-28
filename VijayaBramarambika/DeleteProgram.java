package example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteProgram {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/main","root","Ambika@91");  
			PreparedStatement stmt=con.prepareStatement("delete from  employees where emp_id=?"); 
			stmt.setInt(1, 889);
			int i = stmt.executeUpdate();
			System.out.println(i+" record deleted");
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}


/*
Output:
1 record deleted
Before:
12	Omar	Scientist
54	Chad	Quality Assurance
67	David	Developer
101	Ratan	Supporting Engineer        
617	Tracy	Tester
889	Emily	Engineering Manager
After:
	12	Omar	Scientist
	54	Chad	Quality Assurance
	67	David	Developer
	101	Ratan	Supporting Engineer
	617	Tracy	Tester
*/