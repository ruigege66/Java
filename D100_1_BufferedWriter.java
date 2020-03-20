package com.bjpowernode.java_learning;
import java.io.*;

public class D100_1_BufferedWriter {
	public static void main(String[] args) throws Exception{
		//创建带有缓冲区的字符输出流
		String address = "C:\\\\Users\\\\lenovo1\\\\Workspaces\\\\MyEclipse CI\\\\Java_learning\\\\src\\\\com\\\\bjpowernode\\\\java_learning\\\\temp1.txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(address));
		//或者如下这么写
		//BufferedWriter bw = new BufferedWriter(OutputStreamWriter(new FileOutputStream(address,true)));
		//开始写
		bw.write("jdfoishjfuji");
		//写入一个行分隔符
		bw.newLine();
		bw.write("这是一个测试的语句");
		
		//刷新
		bw.flush();
		//关闭
		bw.close();
		
		//使用BufferedReader和BufferedWriter来完成复制
		String address2 = "C:\\\\Users\\\\lenovo1\\\\Workspaces\\\\MyEclipse CI\\\\Java_learning\\\\src\\\\com\\\\bjpowernode\\\\java_learning\\\\temp2.txt";
		BufferedReader br = new BufferedReader(new FileReader(address));
		BufferedWriter bw2 = new BufferedWriter(new FileWriter(address2));
		String temp = null;
		while((temp=br.readLine())!=null) {
			bw2.write(temp);
			bw2.newLine();
		}
		bw2.flush();
		br.close();
		bw2.close();
		
	}

}
