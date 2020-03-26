package com.bjpowernode.java_learning;

public class D103_1_MultiThread {
	public static void main(String[] args) {
		//创建线程
		Thread t1 = new Processer103();
		//启动
		t1.start();
		
		//创建线程
		Thread t2 = new Thread(new Processer104());
		//启动
		t2.start();
		
	}
}
class Processer103 extends Thread{
	//重写run方法
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		
	}
}

class Processer104 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(i);
		}
		
	}
	
}
