package java_connector;

import java.sql.*;
import java.sql.PreparedStatement;
public class RetriveRec {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/zensar","root","root123");
			PreparedStatement stmt = con.prepareStatement("select *from student");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getInt(3));
			}
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}

/*

output:


101 sri 79
103 s 99
102 joh 88
103 sri 99
103 sri 99

*/