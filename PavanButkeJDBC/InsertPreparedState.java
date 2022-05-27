/* Java Program to Insert a Record into existing DB */

package core_javaBeginner;
import java.sql.*;  

public class InsertPreparedState {
 
	public static void main(String args[]){  
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	  
	Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/zensar"
			+ "","root","ZEns@r123");  
		 
	  
	PreparedStatement stmt=con.prepareStatement("insert into games values(?,?,?,?,?)");  
	stmt.setInt(1,104);
	stmt.setString(2,"Ricky Ponting ");  
	stmt.setString(3,"Cricket ");  
	stmt.setInt(4,104);
	stmt.setInt(5,104);
	
	  
	int i=stmt.executeUpdate();  
	System.out.println(i+" records inserted");  
	  
	con.close();  
	  
	}catch(Exception e){ System.out.println(e);}  
	  
	}  
	}  

/*o/p-->
Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
1 records inserted
*/

*/
101	GodOfWar	Action	107	
102	Briana Lara	Cricket	111	
103	Fifa	Football	110	
104	Ricky Ponting 	Cricket 	104	104 <-- Newly added record
*/