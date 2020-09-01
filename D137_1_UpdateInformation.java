package com.bjpowernode.java_learning;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class D137_1_UpdateInformation {
	private static final String URL = "jbdc:Access:///e:xsgl.mdb";
	static {
		try {
			Class.forName("com.hxtt.sql.access.AccessDriver");
		}catch(ClassNotFoundException e) {
			e.printStackTrace();//输出捕捉到的异常信息
		}
	}
	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(URL);
			Statement statement = conn.createStatement();
			
			String sql = "update tb_record set Salary=Salary + 10 where Duty='部门经理' ";
			statement.executeUpdate(sql);
			
			statement.close();
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
}
