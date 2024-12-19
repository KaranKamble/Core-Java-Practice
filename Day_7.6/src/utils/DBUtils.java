package utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import test.Program;

public class DBUtils {
	private static final Properties p;
	
	static {
		p = new Properties();
		InputStream inputStream = Program.class.getClassLoader().getResourceAsStream("config.properties");
		try {
			p.load(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(p.getProperty("URL"), p.getProperty("USER"), p.getProperty("PASSWORD"));
	}
}
