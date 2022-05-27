package day13;

import java.sql.*;

public class MysqlCon {

	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer1", "root", "root");
//here Customer1 is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from customerInfo");
			while (rs.next()) {
				String customer1data = "";

				customer1data += rs.getInt(1) + " : " + rs.getString(2) + " : " + rs.getString(3) + " : "
						+ rs.getString(4);

				System.out.println(customer1data);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}

/*

Output:
Loading class `com.mysql.jdbc.Driver'. This is deprecated. The new driver class is `com.mysql.cj.jdbc.Driver'. The driver is automatically registered via the SPI and manual loading of the driver class is generally unnecessary.
1 : A : 55 : Mech
2 : B : 45 : Civil
3 : C : 65 : CSE

*/