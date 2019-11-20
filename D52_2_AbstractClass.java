package com.bjpowernode.java_learning;

public abstract class D52_2_AbstractClass {

	//Constructor
	D52_2_AbstractClass(){
		System.out.println("A......");
	}
	
	public abstract void m1();//抽象方法
	
	public static void main(String[] args) {
		D52_2_AbstractClass d1 = new B52();
	}
}

class B52 extends D52_2_AbstractClass{
	B52(){
		//这里省略了super(),实际上默认是有的,父类的构造方法虽然调用了，但是并没有创建父类对象。
		System.out.println("B......");
	}
	public void m1() {};
}
