package cn.airbash.MavenClean.mysql.dbcp;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;

public class DbcpUtils {

	public static BasicDataSource getDateSource() throws SQLException {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/java_test");
		dataSource.setUsername("root");
		dataSource.setPassword("abc.123");
		dataSource.setInitialSize(3);//初始连接数量
		dataSource.setMaxTotal(5);
		Connection connection = dataSource.getConnection();
		System.out.println(connection);
		return dataSource;
	}
	
}
