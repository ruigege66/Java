package com.bjpowernode.java_learning;
import java.util.*;
import java.io.*;


public class D116_1_PropertitiesAndIO {
	public static void main(String[] args) throws Exception{
		//1.创建属性对象
		Properties p = new Properties();//和Map一样，只不过key和value只能存储字符串类型，key不能重复
		//如果Key重复了，value就会被覆盖；
		//2.创建输入流
		String address = "C:\\Users\\lenovo1\\Workspaces\\MyEclipse CI\\Java_learning\\src\\com\\bjpowernode\\java_learning\\temp1.txt";
		FileInputStream fis = new FileInputStream(address);
		//3.setProperties(String key,String value)该方法用来设置键值对
		p.setProperty("jdosf","-pp");
		//4.将fis流中所有的数据加载到属性对象之中
		
		p.load(fis);//现在属性对象中有（key=username,value=scott)
		//5.关闭流
		fis.close();
		//通过Key获取value
		String v = p.getProperty("username");
		String v2 = p.getProperty("jdosf");
		System.out.println(v);
		System.out.println(v2);
		//这个例子可用于，我们只需要修改文件的值，就可以通过程序来调用这些值，多用于数据调用
		//temp1.txt这样的文件可以称为配置文件，配置文件的作用就是：使程序更加灵活。
		//注意：一般在程序中可变的东西不要写死，推荐写到配置文件之中，运行同样的程序得到不同的结果。
		//像temp1.txt这样的一个具有特殊内容的配置文件，我们又称为：属性文件，java规范中要求属性文件需要以“.properties"文件结尾
		//注意：文件中可以是等号也可以是冒号，空格也可以
		//属性文件数据要求：
		//key和value之间可以使用“空格”，“冒号”，“等号”，如果在一个文件中这三种都有，按照最新出现的作为分隔符。
		
	}
}
