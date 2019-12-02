package cn.airbash.MavenClean.MySQL.test01JDBC.main;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class Test02MySQLPool {
	public static void main(String[] args) throws SQLException {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		dataSource.setInitialSize(3);//初始连接数量
		dataSource.setMaxTotal(5);
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
	}
}
