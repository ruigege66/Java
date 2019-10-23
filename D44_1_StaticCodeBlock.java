package com.bjpowernode.java_learning;

public class D44_1_StaticCodeBlock {
	static {
		System.out.println("类加载1");
	}
	static {
		System.out.println("类加载2");
	}
	static {
		System.out.println("类加载3");
	}
	public static void main(String[] args) {
		System.out.println("j");
	}

}
