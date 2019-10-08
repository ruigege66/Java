package com.bjpowernode.java_learning;

public class D37_encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.age = -5;
		System.out.println(user.age);		
	}	
}
class User{
	String name;
	int age;
	
}
