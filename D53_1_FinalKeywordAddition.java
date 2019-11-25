package com.bjpowernode.java_learning;

public class D53_1_FinalKeywordAddition {
	public static void main(String[] args) {
		final Customer53 c1 = new Customer53("Jack",45);
		
//		c1 = new Customer53("liuming",45); //这个语句报错，这是因为final关键字修饰了c1这个变量
//		我们当然不能再将它进行赋值了，但是下面的对c1中的属性进行赋值就是可以的
		c1.name = "jfaolj";
	}
}

class Customer53 {
	String name;
	int age;
	Customer53(String name,int age){
		this.name = name;
		this.age = age;
	}
}
