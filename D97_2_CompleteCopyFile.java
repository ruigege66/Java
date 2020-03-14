package com.bjpowernode.java_learning;
import java.io.*;
public class D97_2_CompleteCopyFile {
	public static void main(String[] args) throws IOException,FileNotFoundException{
		//创建输入流
		FileInputStream f1 = new FileInputStream("C:\\Users\\lenovo1\\Workspaces\\MyEclipse CI\\Java_learning\\src\\com\\bjpowernode\\java_learning\\temp1.txt");
		//创建输出流
		FileOutputStream f2 = new FileOutputStream("C:\\Users\\lenovo1\\Workspaces\\MyEclipse CI\\Java_learning\\src\\com\\bjpowernode\\java_learning\\temp2.txt");
		//一边读一边写
		byte[] bytes = new byte[1024];//1kb;
		int temp = 0;
		while((temp=f1.read(bytes)) != -1){
			//将byte数组中的内容直接写入
			f2.write(bytes);
		}
		//刷新
		f2.flush();
		//关闭
		f1.close();
		f2.close();
				
	}
}
