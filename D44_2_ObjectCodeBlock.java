package com.bjpowernode.java_learning;

public class D44_2_ObjectCodeBlock {
	{
		System.out.println("实例代码块1");
	}
	{
		System.out.println("实例代码块1");
	}
	public static void main(String[] args) {
		System.out.println("shaof");
		new D44_2_ObjectCodeBlock();
	}
}
