package cn.airbash.MavenClean.mysql.dbcp;

import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.Test;

public class Test01Connection {
	
	/**
	 * @throws SQLException 
	 * 
	 */
	@Test
	public void test01() throws SQLException {
		BasicDataSource dateSource = DbcpUtils.getDateSource();
	}
	
}
