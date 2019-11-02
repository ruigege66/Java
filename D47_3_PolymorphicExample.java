package com.bjpowernode.java_learning;

public class D47_2_EffectOfPolymorphic {
	public static void main(String[] args) {
		Master47 m1 = new Master47();
		Cat47 c1 = new Cat47();
		m1.feed(c1);
		Dog47 d1 = new Dog47();
		m1.feed(d1);
		
	}

}
class Cat47{
	public void eat() {
		System.out.println("小猫爱吃鱼");
	}
}
class Dog47{
	public void eat() {
		System.out.println("小狗爱吃骨头");
	}
}

class Master47{
	public void feed(Cat47 c) {
		c.eat();
	}
	//函数重载一下，要是养小狗也得调用
	public void feed(Dog47 d) {
		d.eat();
	}
}
