package com.bjpowernode.java_learning;

public class D67_1_GoDeepIntoArrays {
	public static void main(String[] args) {
		//创建一个数组，这个数组既可以存储Dog,也可以存储Cat
		Animal67[] as = new Animal67[4];
		//给数组每个元素赋值
		Dog67 d1 = new Dog67();
		Dog67 d2 = new Dog67();
		Cat67 c1 = new Cat67();
		Cat67 c2 = new Cat67();
		as[0] = d1;
		as[1] = d2;
		as[2] = c1;
		as[3] = c2;
		//需求：遍历数组，取出每个对象，如果是Dog67那么就执行eat方法，如果是Cat67就执行move方法
		for(int i = 0;i<as.length;i++) {
			Animal67 a = as[i];
			if (a instanceof Cat67) {
				Cat67 c3 = (Cat67)a;
				c3.move();
			}else {
				Dog67 d3 = (Dog67)a;
				d3.eat();
			}
		}
	}
}
class Animal67{
	
}
class Dog67 extends Animal67{
	public void eat() {
		System.out.println("Dog eat");
	}
}
class Cat67 extends Animal67{
	public void move() {
		System.out.println("Cat move");
	}
}
