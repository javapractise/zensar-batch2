package java_connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatement {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/empdata";
		String uname = "root";
		String password = "root123";
		String query = "select * from emp";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(url, uname, password);
			Statement statement = con.createStatement();
			java.sql.PreparedStatement p = con.prepareStatement("select * from emp where empage = ?");
			
			p.setString(1, "sri");
			ResultSet result = p.executeQuery();
			
			while(result.next()) {
				String data ="";
				for(int i = 1; i < 5; i++) {
					data += result.getString(i) + "    ";
				}
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

/**
5    sri    23   
**/