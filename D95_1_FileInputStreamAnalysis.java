package com.bjpowernode.java_learning;
import java.io.*;

public class D95_1_FileInputStreamAnalysis {
	public static void main(String[] args) {
		try {
			//1.要读取某一个文件，先于这个文件创建一个“输入流”
			//文件路径
			String filePath = "temp1.txt";//相对路径
			FileInputStream fls = new FileInputStream(filePath);
			int i1 = fls.read();//以字节的方式读取
			System.out.println(i1);
			int i2 = fls.read();
			int i3 = fls.read();
			System.out.println(i2);
			System.out.println(i3);
			
			//2.开始读文件
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (Exception e2) {
			e2.printStackTrace();
		}finally {
			//为了保证流一定会被释放，所以在finally语句块中执行
			try {
				fls.close();
			}catch (Exception e3) {
				e3.printStackTrace();
			}
		}
	}
}
