package com.bjpowernode.java_learning;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class D135_2_PreparedStatementSQL {
	private static final String URL = "jdbc:Access:///e:/xsgl.mdb";
	static {
		try {
			Class.forName("com.hxtt.sql.access.AccessDriver");
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace(); //输出捕获到异常信息
		}
	}
	
	public static void main(String[] args) {
		try {
			Connection conn = DriverManager.getConnection(URL);          
			Statement stmt = conn.createStatement(sql);
			String sql = "select * from studentInfo";                  //定义静态Select语句
			PreparedStatement prpdStmt = conn.preparedStatement(sql);  //预处理动态INSERT语句
			ResultSet rs = prpdStmt.executeQuery();                    //执行动态INSERT语句
			ResultSetMetaData metaData  = rs.getMetaData();            //获得ResultSetMetaData类的实例
			System.out.println(metaData.getColumnName(1) + "         ");//通过索引获得指定列的名称
			System.out.println(metaData.getColumnName(2) + "         ");
			System.out.println(meatData.getColumnName(3) + "         ");
			while(rs.next()) {
				int id = rs.getInt(1);                                  //通过索引获得指定列的值
				String name = rs.getString(2);
				String sex = rs.getString(3);
				System.out.println(id + " " + name + " " + sex);
			}
			rs.close();
			prpdStmt.close();
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
