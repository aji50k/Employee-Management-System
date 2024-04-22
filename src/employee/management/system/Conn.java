package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conn {
	
	Connection c;
	Statement s;
	
	public Conn() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql:///employeemanagementsystem", "root", "JaiSadguru@123");
			s = c.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
	}

}
