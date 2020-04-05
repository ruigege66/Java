package com.bjpowernode.java_learning;

public class D106_3_ThreadYield {
	public static void main(String[] args) throws InterruptedException  {
		Processer106_3 p = new Processer106_3();
		Thread t = new Thread(p);
		t.setName("t");
		t.start();
		//在主线程中
		for(int i=0;i<1000;i++) {			
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}	
	}
}
class Processer106_3 implements Runnable{
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			if(i%20 == 0) {
				Thread.yield();
			}
		}
		
		
	}
}
