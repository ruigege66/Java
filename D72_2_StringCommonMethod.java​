package com.bjpowernode.java_learning;

public class D72_2_StringCommonMethod {
	public static void main(String[] args) {
		//常用的构造方法
		String s1 = "abc";
		String s2 = new String("abc");
		byte[] bytes = {97,98,99,100};
		String s3 = new String(bytes);
		System.out.println(s3);//从输出结果可以看出，String已经重写了Object中的toString
		
		String s4 = new String(bytes,0,2);//第二个参数是开始位置，第三个参数是长度
		System.out.println(s4);
		
		char[] c1 = {'我','是','中','国','人'};
		String s5 = new String(c1);
		System.out.println(s5);
		
		String s6 = new String (c1,2,2);
		System.out.println(s6);
		
	}
}
