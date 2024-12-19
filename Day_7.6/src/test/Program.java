package test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import utils.DBUtils;

public class Program {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stat = null;
		try {
			
			conn = DBUtils.getConnection();
			stat = conn.createStatement();
			String sql = "select * from books";
			ResultSet rs = stat.executeQuery(sql);
			while (rs.next()) {
				int bookId = rs.getInt("book_id");
				String subjectName = rs.getString("subject_name");
				String bookName = rs.getString("book_name");
				String authorName = rs.getString("author_name");
				float price = rs.getFloat("price");

				System.out.printf("%-10d%-15s%-60s%-40s%-10.2f\n", bookId, subjectName, bookName, authorName, price);
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
