package com.bjpowernode.java_learning;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class D134_1_JDBCConnection {
	public static void main(String[] args) {
		Statement stmt = null;
		ResultSet rs = null;
		Connection conn = null;
		
		try {
			//1.注册数据库的驱动程序
			Class.forName("com.hxtt.sql.access.AccessDriver");
			//2.通过DriverManager获取数据库连接
			conn = DriverManager.getConnection("jbdc:Access:///e:xsgl.mdb");
			//3.通过Connection对象获取Statement对象
			stmt = conn.createStatement();
			//4.使用Statement执行SQL语句
			String sql = "select * from studentInfo";
			rs = stmt.executeQuery(sql);
			//5.操作ResultSet结果集
			System.out.println("studentID | studentName | studentSEX");
			while(rs.next()) {
				int id = rs.getInt("studentID");//通过列名获取指定字段的值
				String name = rs.getString("studentName");
				String psw = rs.getString("studentSEX");
				System.out.println(id + " | " + name + " | " + psw);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//6.回收数据库资源
			if (rs != null) {
				try {
					rs.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
				rs = null;
			}
			if(stmt != null) {
				try {
					stmt.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
				stmt = null;
			}
			if (conn != null) {
				try {
					conn.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
				conn = null;
			}
		}
	}
}
