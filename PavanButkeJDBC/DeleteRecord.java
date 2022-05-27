/*Program to Delete an Entry from Existing DB*/

package core_javaBeginner;
import java.sql.*;  

public class DeleteRecord {
 
		public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/zensar"
				+ "","root","ZEns@r123");  
			 
		  
		PreparedStatement stmt=con.prepareStatement("delete from games where game_id=?");  
		stmt.setInt(1,101);  
		  
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
102	Briana Lara	Cricket	111	
103	Fifa	Football	110	
104	Ricky Ponting 	Cricket 	104	104
*/
