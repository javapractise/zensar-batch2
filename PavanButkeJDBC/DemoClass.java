/*Connecting to JDBC from Pavan Butkr*/

package core_javaBeginner;
import java.sql.*;


public class DemoClass {

	public static void main(String args[]){  
	try{  
	Class.forName("com.mysql.jdbc.Driver");  
	Connection con=DriverManager.getConnection(  
	"jdbc:mysql://localhost:3306/zensar"
	+ "","root","ZEns@r123");  
 
	Statement stmt=con.createStatement();  
	ResultSet rs=stmt.executeQuery("select * from games");  
	while(rs.next())  
	System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getString(4));  
	con.close();  
	}catch(Exception e){ System.out.println(e);}  
	}  
}


/*o/p-->
101  GodOfWar  Action 107
102  Briana Lara  Cricket 111
103  Fifa  Football 110
*/
