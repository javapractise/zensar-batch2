package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PreparedStatement {

	public static void main(String[] args) throws SQLException {
		
		String url = "jdbc:mysql://localhost:3306/employee";
		String uname = "root";
		String password = "Temp1234";
		String query = "select * from zensaremp";
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection(url, uname, password);
			Statement statement = con.createStatement();
			java.sql.PreparedStatement p = con.prepareStatement("select * from zensaremp where fname = ?");
			
			p.setString(1, "Megan");
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
5    Megan    Fox    Sales  
**/