package com.bjpowernode.java_learning;

public class D107_2_SynchronizedMethod {
	public static void main(String[] args) throws InterruptedException{
		//创建一个公共账户
		Accout107_2 a = new Accout107_2("actno-001",8000.0);
		Processer107_2 c = new Processer107_2(a);
		//创建线程对同一个账户进行取款
		Thread t1 = new Thread(c);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
		
	}
}
class Accout107_2 {
	private String actno;
	private double balance;
	
	public Accout107_2(String actno,double balance) {
		this.actno = actno;
		this.balance = balance;
	}

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
	//对外提供一个取款的方法
	public void withdraw(double money)  {
		
		double after = this.balance - money;
		try {
			//这里我们故意延迟了一下，可以看出余额不对了
			Thread.sleep(1000);
		}catch(InterruptedException e){
			
		}
		this.setBalance(after);
	}
}
class Processer107_2 implements Runnable{
	//账户
	Accout107_2 act;
	//Constructer
	public Processer107_2(Accout107_2 act) {
		this.act = act;
	}
	public void run() {
		act.withdraw(1000.0);
		System.out.println("取款成功，余额为："+act.getBalance());
	}
}
