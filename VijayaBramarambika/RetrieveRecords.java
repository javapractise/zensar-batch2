package example;
import java.sql.*;
public class RetrieveRecords {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/main","root","Ambika@91");
			PreparedStatement stmt = con.prepareStatement("select * from employees");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+ " "+rs.getString(2)+" "+rs.getString(3));
			}
			con.close();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}


/*
Output:
12 Omar Scientist
54 Chad Quality Assurance
67 David Developer
101 Ratan Supporting Engineer
617 Tracy Tester
*/