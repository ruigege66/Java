package com.bjpowernode.java_learning;

import java.util.LinkedList;

public class D143_3_Test {
	public static void main(String[] args) {
		D143_1_SuperClass superObj = new D143_1_SuperClass();
		superObj.MethodA();
		System.out.println(superObj.var);
		
		D143_2_SubClass subObj = new D143_2_SubClass();
		subObj.MethodB();
		
		//下面的注释用于抑制其下面的语句的编译警告信息
		//如果去掉注解，则编译时会出现警告信息
		@SuppressWarings("rawtypes")
		LinkedList list = new LinkedList();
		
		//下面两条语句没有加@SuppressWarnings,编译时会出现警告信息
		list.add(123);
		list.add("Beijing");
		for(int i=0;i<2;i++) {
			System.out.println(list.get(i));
		}
	}
}
