package com.bjpowernode.java_learning;

public class D38_object_encapsulation {
	public static void main(String[] args) {
		//闯将user对象
		User user = new User();
		user.setAge(1000);
		int age1 = user.getAge();
		System.out.println(age1);
		user.setAge(100);
		int age2 = user.getAge();
		System.out.println(age2);
	}

}
