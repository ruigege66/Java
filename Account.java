package com.bjpowernode.java_learning;

public class Account {
	//账号
	private String actno;
	
	/**
	 * @param actno
	 * @param balance
	 */
	public Account(String actno, double balance) {
		super();
		this.actno = actno;
		this.balance = balance;
	}

	//余额
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


}
