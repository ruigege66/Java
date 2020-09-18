package com.bjpowernode.java_learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class D139_1_CompileProcess {
	
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement ps;
		ResultSet rs = null;
		
		try {
			Class.forName("com.hxtt.sql.access.AccessDriver");
			String URL = "jdbc:Access:///e:xsgl.mdb";
			con = DriverManager.getConnection(URL);
		}catch(Exception e) {
			
		}
		
		try {
			String update = "update tb_record set name=? where ID = ?";
			ps = con.prepareStatement(update);
			ps.setString(1,"项羽");
			ps.setInt(2,4);
			for(int i=0;i<10;i++) {
				ps.setInt(2, i);
				ps.setString(1, String.valueOf((char)(65+i)));
				int rowCount = ps.executeUpdate();
			}
			ps.close();
			con.close();
		}catch(Exception e) {
			
		}
	}

}
