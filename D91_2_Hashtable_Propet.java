package com.bjpowernode.java_learning;
import java.util.*;

public class D91_2_Hashtable_Propet {
	public static void main(String[] args) {
		//1.创建属性类对象
		Properties p = new Properties();
		//2.存
		//注意key是不能重复，如果重复就会造成value覆盖
		p.setProperty("driver","oracle.jdbc.driver.OracleDriver");
		p.setProperty("username","scott");
		p.setProperty("password","tiger");
		p.setProperty("url","jdbc:oracle:thin:@192.167.1.100：1521:bjpowernode");
		//3.取出来，通过key获取value
		String v1 = p.getProperty("driver");
		String v2 = p.getProperty("username");
		String v3 = p.getProperty("password");
		
		System.out.println(v1);
		System.out.println(v2);
		System.out.println(v3);
		
	}

}
