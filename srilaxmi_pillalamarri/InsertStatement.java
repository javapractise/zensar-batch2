package java_connector;

import java.sql.*; 
import java.sql.PreparedStatement;

public class InsertStatement {
 
	public static void main(String args[]){  
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	  
	Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/zensar"
			+ "","root","root123");  
		 
	  
	PreparedStatement statement=con.prepareStatement("insert into student values(?,?,?)");  
	statement.setInt(1,103);
	statement.setString(2,"sri");  
	statement.setInt(3,99);  
	
	
	  
	int i=statement.executeUpdate();  
	System.out.println(i+" records inserted");  
	  
	con.close();  
	  
	}catch(Exception e){
		System.out.println(e);
		}  
	  
	}  
	}  




/*

Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
1 records inserted
*/