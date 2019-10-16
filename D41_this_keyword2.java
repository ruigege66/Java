package com.bjpowernode.java_learning;

public class D41_this_keyword2 {
	String name2 = "fjajf";
	public static void main(String[] args) {
		String name1 = "zhangsan";
		Customer2 c1 = new Customer2();
		c1.name = name1;
		Customer2.dosome(name1);
		c1.dosome2();
		//System.out.println(name2);编译报错，下面才是对的
		D41_this_keyword2 d1 = new D41_this_keyword2();
		System.out.println(d1.name2);
	}

}
class Customer2{
	String name;
	public static void dosome(String name) {
		System.out.println(name);//一开始写了this.name，导致编译错误，这是因为这是个静态方法，所以
		//不能用this,this只可以用于对象调用的情况，也就是实例方法。
	}
	public void dosome2() {
		System.out.println(this.name);//这种不带static的方法才是对象的方法。
	}
}

