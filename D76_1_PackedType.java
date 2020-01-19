package com.bjpowernode.java_learning;

public class D76_1_PackedType {
	public static void main(String[] args) {

		byte b = 10;
		//引用类型
		Byte b1 = new Byte(b);
		m1(b1);//10  Byte已经将toString方法重写了，要是没重写，这里打印出来的就是对象的地址了。
	}
	public static void m1(Object o) {
		//需求：规定m1方法可以接受Java中任何一种数
		System.out.println(o);
	}

}
