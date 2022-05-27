package java_connector;

import java.sql.*;  

public class DeleteRec {
 
		public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/zensar"
				+ "","root","root123");  
			 
		  
		preparedStatement stmt=con.preparedStatement("delete from emp where empname=?");  
		stmt.setInt('sri',23);  
		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records deleted");  
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
		}  



/*o/p-->
Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
1 records deleted
*/

/* database in sql-->
101	 sri  88	
102   srilu  87
103	srilaxmi  95
*/