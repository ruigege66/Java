package com.bjpowernode.java_learning;

public class D77_1_IntegerAndIntAndStringTransform {
	public static void main(String[] args) {
		Integer i1 = new Integer(10);
		//将Integer类型转换为int类型
		int i2 = i1.intValue();
		System.out.println(i2);
		//重要：static int parseInt(String s)字符串转换为数字
		int age = Integer.parseInt("25");
		System.out.println(age);
		//int price = Integer.parseInt("abe");//这个语句会编程成功，但是运行有问题，参数只能接受数字
		
		//重要：static double parseDouble(String s)
		double d1 = Double.parseDouble("3");
		System.out.println(d1);
		
		//静态方法：static String toBinaryString(int i)将一个整数i转换为（字符串）二进制返回
		//static String toHexString(int i)转换为十六进制
		//static String toOctalString(int i)转换为八进制
		System.out.println(Integer.toHexString(90));
		System.out.println(Integer.toBinaryString(89));
		System.out.println(Integer.toOctalString(89));
		
		//将一个int类型或者String类型转换为Integer类型：两种方法，直接初始化；使用Integer.valueOf()方法
		System.out.println(Integer.valueOf("45"));
		System.out.println(Integer.valueOf(45));
		System.out.println("==================================");
		
		//int->Integer
		Integer i5 = Integer.valueOf(10);
		
		//Integer->int
		int i6 = i5.intValue();
		
		//String ->Integer
		Integer i7 = Integer.valueOf("10");
		
		//Integer ->String
		String s5 = i5.toString();
		
		//String -> int
		int i8 = Integer.parseInt("10");
		
		//int -> String
		String s6 = 10 + "";
		
	}
}
