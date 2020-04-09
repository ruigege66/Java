package com.bjpowernode.java_learning;

public class D107_1_JoinMethod {
	public static void main(String[] args) throws InterruptedException{
		Thread t = new Thread (new Processer107());
		t.setName("t");
		t.start();
		
		//合并线程
		t.join();//t和主线程合并，可以理解为两个栈合并成一个栈了,也就是子线程与主线程合并成一个单线程了
		
		//主线程
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}
class Processer107 implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				
			}
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
	}
}
