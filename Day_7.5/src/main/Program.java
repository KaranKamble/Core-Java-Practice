package main;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class Program {
	private final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	private final static String URL = "jdbc:mysql://localhost:3306/dac_db";
	private final static String USER = "root";
	private final static String PASSWORD = "karan";

	public static void main(String[] args) {

		Connection conn = null;
		Statement stat = null;
		
		try {
			Properties p = new Properties();
			InputStream inputStream = Program.class.getClassLoader().getResourceAsStream("config.properties");
			p.load(inputStream);
			
			conn = DriverManager.getConnection(p.getProperty("URL"), p.getProperty("USER"), p.getProperty("PASSWORD"));
			
			stat = conn.createStatement();
			
			String sql = "select * from books"; // (DQL) executeQuery method for DQL

			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()) {
				int bookId = rs.getInt("book_id");
				String subjectName = rs.getString("subject_name");
				String bookName = rs.getString("book_name");
				String authorName = rs.getString("author_name");
				float price = rs.getFloat("price");

				System.out.printf("%-10d%-15s%-60s%-40s%-10.2f\n", bookId, subjectName, bookName, authorName, price);

			}
			
		} catch (IOException |  SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main2(String[] args) {

		Connection conn = null;
		Statement stat = null;
		try {
			Class.forName(DRIVER);

			conn = DriverManager.getConnection(URL, USER, PASSWORD);

			stat = conn.createStatement();

			String sql = "select * from books"; // (DQL) executeQuery method for DQL

			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()) {
				int bookId = rs.getInt("book_id");
				String subjectName = rs.getString("subject_name");
				String bookName = rs.getString("book_name");
				String authorName = rs.getString("author_name");
				float price = rs.getFloat("price");

				System.out.printf("%-10d%-15s%-60s%-40s%-10.2f\n", bookId, subjectName, bookName, authorName, price);

			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main1(String[] args) {

		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);

			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dac_db", "root", "karan");

			stat = conn.createStatement();

			String sql = "select * from books;";

			rs = stat.executeQuery(sql);

			while (rs.next()) {
				int bookId = rs.getInt("book_id");
				String subjectName = rs.getString("subject_name");
				String bookName = rs.getString("book_name");
				String authorName = rs.getString("author_name");
				float price = rs.getFloat("price");
				System.out.printf("%-10d%-15s%-60s%-40s%-10.2f\n", bookId, subjectName, bookName, authorName, price);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				rs.close();
				stat.close();
				conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}

	}

}
