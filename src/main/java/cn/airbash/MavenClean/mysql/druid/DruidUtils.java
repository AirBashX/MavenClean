package cn.airbash.MavenClean.mysql.druid;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

public class DruidUtils {

	public void getDataSource() {
		Properties prop = new Properties();
		InputStream stream = ClassLoader.getSystemClassLoader().getResourceAsStream("dbcp2.properties");
		try {
			prop.load(stream);
			BasicDataSource dataSource = new BasicDataSource();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
