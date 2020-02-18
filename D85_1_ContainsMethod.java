package com.bjpowernode.java_learning;
import java.util.*;

public class D85_1_ContainsMethod {
	public static void main(String[] args) {
		//创建集合
		Collection c = new ArrayList();
		//创建两个Integer类型的对象
		Integer i1 = new Integer(10);
		//添加元素
		c.add(i1);
		//判断集合中是否包含11
		System.out.println(c.contains(i1));
		///创建Integer类型的对象
		Integer i2 = new Integer(10);
		System.out.println(c.contains(i2));
		//这里包含了i2说明了，contains底层调用了equals方法。如果equals返回了true，就是包含
		
		Manager85 m1 = new Manager85(52,"jho");
		c.add(m1);
		Manager85 m2 = new Manager85(52,"jho");
		System.out.println(c.contains(m2));
		
	}
}
class Manager85{
	int no;
	String name;
	Manager85(int no,String name){
		this.no = no;
		this.name = name;
	}
	public boolean equals(Object o){
		if(this==o) return true;
		if(o instanceof Manager85) {
			Manager85 m = (Manager85)o;
			if(this.no==m.no && this.name.equals(m.name)){
				return true;
			}
		}
		return false;
	}
	//总结创建一个类，要重写equals方法，才能对类中的数据进行对比，否则继承原来的equals只能是对比对象的地址
}
