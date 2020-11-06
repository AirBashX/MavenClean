package cn.airbash.MavenClean.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test01MySQLClient {
	public static void main(String[] args) {
		try {
			//Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
			System.out.println(connection);
		//} catch (ClassNotFoundException e) {
		//	e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
