package com.bjpowernode.java_learning;

public class D46_1_polymorphic {
	public static void main(String[] args) {
//		Animal46 a1 = new Animal46();
//		a1.move();
//		
//		Cat46 c1 = new Cat46();
//		c1.move();
//		c1.catchMouse();
//		
//		Bird46 b1 = new Bird46();
//		b1.move();
		//下面使用多态语法机制
		Animal46 a2 = new Cat46();//一个Animal46类型的引用指向了Cat46对象
		a2.move();//底层是Cat46对象，如果这个方法没重写，那么就会调用Animal的原始move方法
		//a2.catchMouse();//分析这行程序为什么不能调用？
		//因为编译阶段编译器检查a2的类型是Animal类型，从Animal.class字节码文件之中查找catchMouse
		//方法，最终没有找到该方法，导致静态绑定失败，没有绑定成功，也就是编译失败，更别谈运行了。
		/**
		 * Animal和Cat之间存在继承关系，Animal是父类，Cat是子类
		 * Cat是Animal合理的
		 * new Cat()创建的对象类型是Cat，a2这个引用的数据类型是Animal，可见它们进行了类型转换
		 * 子类型转换为父类型，称为向上转型。
		 */
		
	}

}

class Animal46{
	public void move() {
		System.out.println("动物们再行走");
	}
	
}
class Cat46 extends Animal46{
	public void move() {
		System.out.println("小猫在行走");
	}//重写函数
	//下面是小猫类特有的函数
	public void catchMouse() {
		System.out.println("小猫是会抓老鼠的");
	}
}
class Bird46 extends Animal46{
	public void move() {
		System.out.println("小鸟在飞翔");
	}
}
