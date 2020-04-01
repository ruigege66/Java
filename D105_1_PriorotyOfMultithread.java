package com.bjpowernode.java_learning;

public class D105_1_PriorotyOfMultithread {
	public static void main(String[] arsg) {
		
		System.out.println(Thread.MAX_PRIORITY);
		System.out.println(Thread.MIN_PRIORITY);
		System.out.println(Thread.NORM_PRIORITY);
		System.out.println("=================");
		
		Thread t1 = new Processor105();
		t1.setName("t1");
		
		Thread t2 = new Processor105();
		t2.setName("t2");
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		//设置优先级
		t1.setPriority(5);
		t2.setPriority(4);
		
		t1.start();
		t2.start();
	}
}

class Processor105 extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"--->"+i);
		}
	}
}
