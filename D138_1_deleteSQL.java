package com.bjpowernode.java_learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class D138_1_deleteSQL {
	private static final String URL = "jdbc:Access:///e:/xsgl.mdb";
	static {
		try {
			Class.forName("com.hxtt.sql.access.AccessDriver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static void main(String args) {
		try {
			Connection conn = DriverManager.getConnection(URL);
			Statement statement = conn.createStatement();
			String sql = "delete from tb_record where Salary<1000";
			statement.executeUpdate(sql);
			statement.close();
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
