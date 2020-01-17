package com.bjpowernode.java_learning;

public class D74_1_StringCommonMethod { 
	public static void main(String[] args) {
		//1.转为大写
		System.out.println("Abhdugfi".toUpperCase());
		
		//2.转换为小写
		System.out.println("AHUJGjhid".toLowerCase());
		
		//3.去除字符串前后的 空白
		System.out.println("     a    bcd d e     ".trim());
		
		//4.String valueOf(Object obj);
		Object o = new Object();
		o = null;
		System.out.println(o);//不会出现空指针异常，因为这里并不是直接调用toString方法，String.valueOf(Object)这个方法对空值进行处理了
		System.out.println(String.valueOf(o));
		//System.out.println(o.toString());//这条语句会出现空指针异常
	}

}
