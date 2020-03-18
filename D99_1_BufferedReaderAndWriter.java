package com.bjpowernode.java_learning;
import java.io.*;
public class D99_1_BufferedReaderAndWriter {
	public static void main(String[] args) throws Exception{
		//创建一个带有缓冲区的字符输入流
		String address = "C:\\\\Users\\\\lenovo1\\\\Workspaces\\\\MyEclipse CI\\\\Java_learning\\\\src\\\\com\\\\bjpowernode\\\\java_learning\\\\temp1.txt";
		FileReader fr = new FileReader(address);//创建一个文件字符输入流
		BufferedReader br = new BufferedReader(fr);//将文件字符输入流包装成带有缓冲区的字符输入流
		//根据流出现的位置，流又分为：包装流或者处理流和节点流
		//FileReader fr是一个节点流
		//BufferedReader br是一个包装流，或者处理流
		//上面的两行代码可以简写为如下一行
		//BufferedReader fr = new BufferedReader(new FileReader("C:\\\\Users\\\\lenovo1\\\\Workspaces\\\\MyEclipse CI\\\\Java_learning\\\\src\\\\com\\\\bjpowernode\\\\java_learning\\\\temp1.txt"));
		
		//开始读
		String temp = null;
		while((temp = br.readLine()) != null) {//br.readline()方法读取一行，但是行尾是不带换行符的
			System.out.println(temp);//输出一行
		}
		//关闭
		//注意：关闭的时候只需要关闭外层的包装流即可(这里有一个包装者模式）
		fr.close();
		
		
		//创建一个带有缓冲区的字符输入流
		FileInputStream fis = new FileInputStream(address);
		//转换流,字节输入流转换为字符输入流，为了就是能够传入BufferedReader中
		InputStreamReader isr = new InputStreamReader(fis);
		
		BufferedReader br2 = new BufferedReader(isr);
		
		//开始读
		String temp2 = null;
		while((temp2=br2.readLine())!= null) {
			System.out.println(temp2);
		}
		//关闭，关闭最外层的流即可，（装饰者模式）
	}

}
