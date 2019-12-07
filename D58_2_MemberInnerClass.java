package com.bjpowernode.java_learning;

public class D58_2_MemberInnerClass {
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
	
	//成员内部类
	//可以访问控制权限的修饰符修饰
	//public,protected.private.缺省
	class InnerClass58_1{
		//静态方法编译错误，不能使用这个方法
//		public static void m3() {
//			m1();
//			System.out.println(s1);
//			
//			m2();			
//			System.out.println(s2);
//			
//		}
		//成员方法
		public void m4() {
			m1();
			System.out.println(s1);
			
			m2();			
			System.out.println(s2);
			
		
		}
	}
	public static void main(String[] args) {
		D58_2_MemberInnerClass d1 = new D58_2_MemberInnerClass();
		InnerClass58_1 i1 = d1.new InnerClass58_1();
		i1.m4();
	}
}
