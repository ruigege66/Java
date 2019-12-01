package com.bjpowernode.java_learning;

public class D56_2_equalsMethodAnalysis {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		boolean b1 = o1.equals(o2);
		System.out.println(b1);
		Star56 s1 = new Star56(100,"xiaoming");
		Star56 s2 = new Star56(100,"xiaoming");
		System.out.println(s1.equals(s2));
		//这样比较出来的是false,因为比较的是两个对象的内存地址，但是这样显然是不符合我们的预期
		//其实我们想要比较的是两个对象里面的内容是不是一致的。于是我们重写
		
	}
}
class Star56{
	int id;
	String name;
	public Star56(int id,String name) {
		this.id = id;
		this.name = name;
	}
}
