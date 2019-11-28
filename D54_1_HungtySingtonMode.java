package com.bjpowernode.java_learning;

public class D54_1_HungtySingtonMode {
	public static void main(String[] args) {
		Customer54 c1 = Customer54.getCustomer54();
		Customer54 c2 = Customer54.getCustomer54();
		System.out.println(c1==c2);
	}
}
//饿汉式单例模式
class Customer54{
	private static Customer54 c = new Customer54();
	private Customer54() {}
	public static Customer54 getCustomer54(){
		return c;
	}
}
