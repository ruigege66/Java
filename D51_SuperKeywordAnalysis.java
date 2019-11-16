package com.bjpowernode.java_learning;

public class D51_SuperKeywordAnalysis {
	public static void main(String[] args) {
		Manager51 m1 = new Manager51();
		m1.m1();
	}
}

class Employee51{
	//成员函数
	public void work() {
		System.out.print("员工在工作");
	}
}
class Manager51 extends Employee51{
	public void work() {
		System.out.print("经理在工作");
	}
	public void m1() {
		super.work();
	}
}
