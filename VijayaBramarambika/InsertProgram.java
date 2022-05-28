package example;
import java.sql.*;  
public class InsertProgram{  
	public static void main(String args[]){  
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/main","root","Ambika@91");  
  
			PreparedStatement stmt=con.prepareStatement("insert into employees values(?,?,?)");  
			stmt.setInt(1,101);//1 specifies the first parameter in the query  
			stmt.setString(2,"Ratan");
			stmt.setString(3, null);
  
			int i=stmt.executeUpdate();  
			System.out.println(i+" records inserted");  
  
			con.close();  
  
		}catch(Exception e){ System.out.println(e);}  
  
	}  
}  

/*
Output:
1 records inserted
Before:
12	Omar	Scientist
54	Chad	Quality Assurance
67	David	Developer	
617	Tracy	Tester
889	Emily	Engineering Manager
After:
12	Omar	Scientist
54	Chad	Quality Assurance
67	David	Developer
101	Ratan	          // Data inserted here
617	Tracy	Tester
889	Emily	Engineering Manager
		
		
*/