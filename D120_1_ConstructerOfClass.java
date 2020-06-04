package com.bjpowernode.java_learning;
import java.lang.reflect.*;

public class D120_1_ConstructerOfClass {
	public static void main(String[] args) throws Exception{
		//1.获取类
		Class c = Class.forName("com.bjpowernode.java_learning.D120_Customer");
		
		//2.获取特定的构造方法
		Constructor con = c.getDeclaredConstructor(String.class,int.class);
		
		//3.创建对象
		Object o = con.newInstance("张三",25);
		System.out.println(o);
	}

}
class D120_Customer{
	String name;
	int age;
	
	D120_Customer(String name,int age){
		this.name = name;
		this.age = age;
		
	}
	
	public String toString() {
		return "Customer[" + name + "," + age + "]";
	}
}
