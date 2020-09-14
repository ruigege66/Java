package com.bjpowernode.java_learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class D138_2_PreparedStatementDelete {
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
			String[] names = {"部门经理","会计"};
			String sql = "delete from tb_record where duty=?";
			PreparedStatement prpdStmt = conn.prepareStatement(sql);
			prpdStmt.clearBatch();
			for(int i=0;i<names.length;i++) {
				prpdStmt.setString(1,names[i]);
				prpdStmt.addBatch();
			}
			prpdStmt.executeBatch();
			prpdStmt.close();
			conn.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
