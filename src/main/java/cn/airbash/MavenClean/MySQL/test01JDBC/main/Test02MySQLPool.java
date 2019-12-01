package cn.airbash.MavenClean.MySQL.test01JDBC.main;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;


public class Test02MySQLPool {
	public static void main(String[] args) {
		//1.创建连接池对象
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/test");
		dataSource.setInitialSize(3);//初始连接数量
		dataSource.setMaxActive(5);;//最大连接数量
		dataSource.setUsername("root");
		dataSource.setPassword("root");
			Connection connection;
			try {
				connection = dataSource.getConnection();
				System.out.println(connection);
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
