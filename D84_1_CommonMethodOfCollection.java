package com.bjpowernode.java_learning;

import java.util.*;

public class D84_1_CommonMethodOfCollection {
	public static void main(String[] args) {
		//1.创建集合
		Collection c = new ArrayList();//多态
		
		//2.添加元素
		c.add(1);//JDK5.0之后自动装箱
		c.add(new Integer(100));
		
		Object o = new Object();
		c.add(o);//Collection集合只能单个存储元素，并且只能存储引用类型
		
		Customer84 cus = new Customer84("xiaoming",47);
		c.add(cus);
		
		//3.获取元素的个数
		System.out.println(c.size());
		System.out.println("======================");
		
		//4.将集合转换为Object类型的数组
		Object[] objs = c.toArray();
		for(int i =0;i<objs.length;i++) {//数组中length是属性，列表中是方法
			System.out.println(objs[i]);
		}
		
		//5.清空
		c.clear();		
		System.out.println("======================");
		System.out.println(c.size());
		
		
	}
}
class Customer84{
	String name ;
	int age ;
	Customer84(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return "Customer[name="+name+",age="+age+"]";
	}
}
