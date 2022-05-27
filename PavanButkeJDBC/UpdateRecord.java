/*Program to update an record*/
package core_javaBeginner;
import java.sql.*;  

public class UpdateRecord {

		public static void main(String args[]){  
		try{  
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/zensar"
				+ "","root","ZEns@r123");  
			 
		  
		PreparedStatement stmt=con.prepareStatement("update games set nameofgame where game_id=102");  
		stmt.setString(1,"Pubg");
		  
		int i=stmt.executeUpdate();  
		System.out.println(i+" records updated"); 
		
		  
		con.close();  
		  
		}catch(Exception e){ System.out.println(e);}  
		  
		}  
		}  


/*o/p-->
1 records updated
*/

