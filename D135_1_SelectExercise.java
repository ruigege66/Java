package com.bjpowernode.java_learning;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class D135_1_SelectExercise {
	private static final String URL = "jdbc:Access:///e:/xsgl.mdb";
	
	static {
		try {
			Class.forName("com.hxtt.sql.access.AccessDriver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();//捕获未找到该类的异常信息
		}
	}
	
	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(URL);
			Statement stmt = conn.createStatement();
			String sql = "select * from studentInfo";                //定义静态的SELECT语句
			ResultSet rs = stmt.executeQuery(sql);                   //执行静态的SELECT语句
			while(rs.next()) {
				//遍历结果集，通过next()方法可以判断是否还存在符合条件的记录
				int id = rs.getInt(1);                               //通过列索引获得指定列的值
				String name = re.getString(2);                      
				String sec = rs.getString(3);
				System.out.println(id + " " + name + " " + sex);
			}
			stmt.close();
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
