package com.bjpowernode.java_learning;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;

public class D101_2_PrintStream {
	public static void main(String[] args) throws Exception {
		System.out.println("HelloWorld");
		
		PrintStream ps = System.out;
		ps.println("JAVA");
		
		String address = "C:\\\\Users\\\\lenovo1\\\\Workspaces\\\\MyEclipse CI\\\\Java_learning\\\\src\\\\com\\\\bjpowernode\\\\java_learning\\\\temp1.txt";
		
		//setOut方法可以改变输出方向，PrintStream(FileOutputStream f)可以接受字节输出流
		
		System.setOut(new PrintStream(new FileOutputStream(address)));
		//再次输出
		System.out.print("HAHA");
		//通常使用上述方法来记录日志
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		System.out.println(sdf.format(new Date()));
		m1();
		System.out.println(sdf.format(new Date()));
		
		
	}
	public static void m1() {
		System.out.println("m1 method execute");
	}

}
