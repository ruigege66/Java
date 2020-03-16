package com.bjpowernode.java_learning;

import java.io.*;

public class D98_1_FileReaderAnalysis {
	public static void main(String[] args) {
		FileReader fr = null;
		FileWriter fw = null;
		try {
			//创建文件字符输入流
			fr = new FileReader("C:\\Users\\lenovo1\\Workspaces\\MyEclipse CI\\Java_learning\\src\\com\\bjpowernode\\java_learning\\temp1.txt");
			//开始读
			char[] chars = new char[512];//1kb
			int temp = 0;
			while((temp=fr.read(chars)) != -1) {
				//将char数组有效部分转换为字符串
				System.out.println(new String(chars,0,temp));
				//有一好处，读取文本类不会出现乱码，因为每次读取一个字符，而不是字节
			}
			
			//创建文件字符输出流
			fw = new FileWriter("C:\\Users\\lenovo1\\Workspaces\\MyEclipse CI\\Java_learning\\src\\com\\bjpowernode\\java_learning\\temp2.txt");
			//开始写
			fw.write("牛逼！");
			//将char数组的一部分写入
			char[] chars2 = {
				'我','是','中','国','人'
			};
			fw.write(chars2);
			//刷新
			fw.flush();
			//关闭
			fw.close();
			
			//文件复制,只能复制纯文本文件
			FileReader fr2 = new FileReader("C:\\Users\\lenovo1\\Workspaces\\MyEclipse CI\\Java_learning\\src\\com\\bjpowernode\\java_learning\\temp1.txt");
			FileWriter fr3 = new FileWriter("C:\\Users\\lenovo1\\Workspaces\\MyEclipse CI\\Java_learning\\src\\com\\bjpowernode\\java_learning\\temp2.txt");
			
			char[] chars3 = new char[512];
			int temp2 = 0;
			while((temp2=fr2.read())!= -1) {
				fr3.write(chars3,0,temp2);
			}
			fr3.flush();
			fr3.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {

			
		}
	}
}
