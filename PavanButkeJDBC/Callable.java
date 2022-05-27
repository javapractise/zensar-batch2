package core_javaBeginner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CallablePrgm {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost:3306/zensar";
		String uname = "root";
		String password = "ZEns@r123";
		String query = "select * from games";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(url, uname, password);
			@SuppressWarnings("unused")
			Statement statement = con.createStatement();
			java.sql.CallableStatement c = con.prepareCall("{call getname(?)}");
			
			c.setString(1, "Steve Smith");
			c.execute();
		
			
			ResultSet result = c.executeQuery();
			
			while(result.next()) {
				System.out.println(result.getString(1).toUpperCase());
			}
			
			System.out.println("Work Done!");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

/*o/p-->
/**
Steve Smith
Work Done!
**/
*/
