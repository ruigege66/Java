package com.bjpowernode.java_learning;

public class D40_this_keyword {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		c1.name = "zhangsan";
		Customer c2 = new Customer();
		c2.name = "lisi";
		c1.shopping();
		c2.shopping();
	}

}
​
