package com.bjpowernode.java_learning;

public class D51_2_ {
	public static void main(String[] args) {
		DebitAccount51 d1 = new DebitAccount51();
	}
}
class Account51{
	//
	private String actno;
	private double balance;
	public String getActno() {
		return actno;
	}
	public void setActno(String actno) {
		this.actno = actno;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account51() {
		System.out.println("我是Account51的构造方法");
	}
	public Account51(String actno,double balance) {
		this.actno = actno;
		this.balance = balance;
	}
	
}
class DebitAccount51 extends Account51{
	private double debit;

	public double getDebit() {
		return debit;
	}

	public void setDebit(double debit) {
		this.debit = debit;
	}
	public DebitAccount51() {
		super();//这里写不写这个super()都行，不写默认写。会调用父类的构造函数
	}
	public DebitAccount51(String actno,double balance,double debit) {
		super(actno,balance);//因为这两个参数在父类中是私有的成员变量，所以在子类中不能直接赋值，
		//所以采用super(参数)的方式进行调用
		this.debit = debit;
	}
}
