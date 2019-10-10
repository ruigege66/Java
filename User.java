package com.bjpowernode.java_learning;

public class User {
	//属于私有化
	private int age;
	//setter
	public void setAge(int a) {
		if (a<0 || a>150) {
			System.out.println("对不起您输入的年龄不合法");
			return;
		}else {
			age = a;
		}
	}
	//getter
	public int getAge() {
		return age;
	}
	

}
