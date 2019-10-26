package com.bjpowernode.java_learning;

public class D45_2_MethodCover {
	public static void main(String[] args) {
		Animal1 a1 = new Animal1();
		a1.name = "jfai";
		a1.move();
		Bird1 b1 = new Bird1();
		b1.name = "jfioaweh";
		b1.move();
	}

}
class Animal1{
	String name;
	public void move() {
		System.out.println(this.name+"正在移动"); 
	}
	
}
class Bird1 extends Animal1{

	public void move() {
		System.out.println(this.name+"不再移动");//方法重写，
	}
	
}
