#1 UpdateProgram:

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
------------------------------------------------------------------
#2 RetrieveRecords:

package example;
import java.sql.*;
public class RetrieveRecords {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/main","root","Ambika@91");
			PreparedStatement stmt = con.prepareStatement("select * from employees");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getString(3));
			}
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

Output:
12 Omar Scientist
54 Chad Quality Assurance
67 David Developer
101 Ratan Supporting Engineer
617 Tracy Tester
-------------------------------------------------------------------------
#3 InsertProgram:

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
-----------------------------------------------------------------------------
#4 FunctionalInterfaceExample:

package example;

interface sayable{  
    void say(String msg);  
}  
public class FunctionalInterfaceExample implements sayable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        fie.say("Hello there");  
    }  
} 

output:
Hello there
-------------------------------------------------------------------------------
#5 DeleteProgram:

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