package com.bjpowernode.java_learning;

public class D58_1_OuterClass {
	//静态变量
	static String s1 = "A";
	//成员变量
	private String s2 = "B";
	//静态方法
	private static void m1() {
		System.out.println("static m1 method execute");
	}
	//成员方法
	private void m2() {
		System.out.println("m2 method execute");
	}
	
	//静态内部类
	//可以访问控制权限的修饰符修饰
	//public,protected.private.缺省
	static class InnerClass58{
		//静态方法
		public static void m3() {
			m1();
			System.out.println(s1);
			
//			m2();			
//			System.out.println(s2);
			
		}
		//成员方法
		public void m4() {
			
		}
	}
	
	public static void main(String[] args) {
		//执行m3
		D58_1_OuterClass.InnerClass58.m3();
		//执行m4
		InnerClass58 inner = new InnerClass58();
		inner.m4();
	}
}
