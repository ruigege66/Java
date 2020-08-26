package com.bjpowernode.java_learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class D136_2_PreparedStatementInsert {
	private static final String URL = "jdbc:Access:///e:/xsgl.mdb";
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
			String[][] records = {{"201702","老张"},{"201703","Tony"}};
			String sql = "insert into studentInfo(studentID,studentName values(?,?)";//定义动态INSERT语句
			PreparedStatement prpdStmt = conn.prepareStatement(sql);//预处理动态INSERT语句
			for(int i=0;i<records.length;i++) {
				prpdStmt.setInt(1, Integer.valueOf(records[i][0]).intValue());  //为参数赋值
				prpdStmt.setString(2, records[i][1]);    //为参数赋值
				prpdStmt.addBatch();   //将INSERT语句添加到Batch中
			}
			prpdStmt.executeBatch();    //批量执行Batch中的Insert语句
			prpdStmt.close();
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
