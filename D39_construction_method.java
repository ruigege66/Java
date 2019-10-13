package com.bjpowernode.java_learning;

public class D39_construction_method {
	
	public static void main(String[] args) {
		//创建User对象，调用User类的构造方法来完成对象的创建
		//以下程序创建了4个对象，只要构造函数调用就会创建对象，并且一定是在”堆内存“中开辟出来的内存空间
		String s1 = "jfsiauhf";
		int i1 = 5;
		User u1 = new User(s1);
		User u2 = new User(i1);
		User u3 = new User();
		System.out.println("fjisf");
		//调用带有static的方法
		u3.sum();
		//调用不带static的方法
		/**
		 * javadoc的格式
		 */
		u3.getAge();
		
		Account act1 = new Account();
		act1.getActno();

	}
}

