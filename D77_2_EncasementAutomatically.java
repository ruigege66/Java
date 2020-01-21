package com.bjpowernode.java_learning;

public class D77_2_EncasementAutomatically {
	public static void main(String[] args) {
		//JDK5.0之前的
		//int->Integer  装箱
		Integer i1 = new Integer(10);
		//Integer ->int  拆箱
		int i2 = i1.intValue();
		
		//JDK5.0之后，包括5.0
		Integer i3 = 10;//自动装箱
		int i4 = i3;//自动拆箱
		System.out.println(i3);
		System.out.println(i4);
		
		m1(445);//自动装箱
		System.out.println(m2(85,50));//先自动装箱，然后自动拆箱
	}
	public static void m1(Object o) {
		System.out.println(o);
	}
	public static int m2(Integer i1,Integer i2) {
		return i1-i2;
	}

}
