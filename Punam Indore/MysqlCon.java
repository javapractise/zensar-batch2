import java.sql.*;

public class MysqlCon {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/customer3","root","root");
		    Statement stat=con.createStatement();
			System.out.println("inserting records");
			String sql="Insert into employee5 values(43)";
			stat.executeUpdate(sql);
		} catch(Exception e) {
			System.out.println(e);
		}
	} 

}
