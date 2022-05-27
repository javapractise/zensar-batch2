package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {

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
			ResultSet result = statement.executeQuery(query);
			
			while(result.next()) {
				String data ="";
				for(int i = 1; i < 5; i++) {
					data += result.getString(i) + "\t";
				}
				
				System.out.println(data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

/**
1	Clark	Jones	Sales	
2	Dave	Kid	Accounting	
3	Ava	Roy	Sales	
4	Bob	Vincet	Teacher	
5	Megan	Fox	Sales	
6	Raj	Murlidhar	Accounting
**/