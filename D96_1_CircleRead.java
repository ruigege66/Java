package com.bjpowernode.java_learning;
import java.io.*;
public class D96_1_CircleRead {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("C:\\Users\\lenovo1\\Workspaces\\MyEclipse CI\\Java_learning\\src\\com\\bjpowernode\\java_learning\\D95_1_FileInputStreamAnalysis.java");
		byte[] bytes = new byte[1024];
		//1.available方法
		System.out.println(fis.available());
		System.out.println("===========");
		//2.skip方法
		fis.skip(2);//跳过读取 两个字节
		System.out.println("===========");		
		//3.循环打印出内容
		while(true) {
			int temp = fis.read(bytes);
			if(temp==-1) break;
			//将byte数组中有效的数据转换成字符串
			System.out.print(new String(bytes,0,temp));
			//注意这里是字符串的截取，我们需要知晓这里read这个方法的返回值，所以相当于我们创建了一个数组，用来存储每一次
			//读到的1kb，然后1kb，1kb的输出。之所以会使用0到temp,前面读取的时候都好说，都可以把数组填满了，但是当读到
			//最后的时刻的时候，就会有占据了数组的一部分，如果我们使用定长1024那么就会，把上一次的部分内容打印了出来
		}
		
		//4.int read(byte[] b)从输入流中最多b.length个字节的数据读入到byte数组中
		
		System.out.println("===========");
		//可以看出available方法是用于查看还剩余多少个字节没有读取
		System.out.println(fis.available());
		//5.记得关闭这个流
		fis.close();
	}
}
