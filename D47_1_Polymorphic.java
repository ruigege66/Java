package com.bjpowernode.java_learning;

public class D47_1_Polymorphic {
	public static void main(String[] args) {
		Animal46 a3 = new Cat46();
		//a3.catchMouse();//这里使用的方法在Animal46中不存在，但是在Cat46中存在，所以需要强制类型转换
		Cat46 c4 = (Cat46)a3;
		
		Animal46 a5 = new Bird46();
		/**Cat46 c5 = (Cat46)a5;
		*
		 * 上面这个程序编译是没有问题的，因为编译器检查到a5的数据类型是Animal46,Animal46和Cat46之间是存在
		 * 继承关系的，并且Animal46是父类型，Cat46是子类型，父类型转换为子类型叫做向下转换类型，语法是合法的，
		 * 程序虽然编译通过了，到那时程序在运行阶段会出现异常，因为JVM堆内存中真是存在的对象是Bird类型，Bird
		 * 对象是无法转换为Cat对象的，因为两种类型之间不存在任何继承关系此时就会出现著名的异常:
		 * java.lang.ClassCastException
		 * 类型转换异常，这种异常总是在“向下转型”的时候会发生。
		 *可以修改为:
		 *if（a5 instanceof Cat46）{
		 *	Cat46 c5 = (Cat46) a5;}
		 *else if(a3 instanceof Bird46){
		 *	Bird46 b5 = (Bird46) a5;} 
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
