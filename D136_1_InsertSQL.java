package com.bjpowernode.java_learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class D136_1_InsertSQL {
	private static final String URL = "jdbc:Access:///e:xsgl.mdb";
	static {
		try {
			Class.forName("com.hxtt,sql.access.AccessDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();//输出捕获到的异常信息
		}
	}
	
	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(URL);
			Statement statement = conn.createStatement();
			String sql = "insert into studentInfo(studentID,studentName) values (201701,'老陈')";
			statement.executeUpdate(sql);
			statement.close();
			conn.close();
			System.out.println("数据更新成功");
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
