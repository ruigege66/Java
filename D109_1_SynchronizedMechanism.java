package com.bjpowernode.java_learning;

public class D109_1_SynchronizedMechanism {
	public static void main(String[] args) throws InterruptedException{
		MyClass109 mc = new MyClass109();
		Processer109 p = new Processer109(mc);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(p);
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		
		//延迟（保证t1线程先启动，并执行run)
		Thread.sleep(1000);
		t2.start();
	}

}
class Processer109 implements Runnable{
	MyClass109 mc;
	public Processer109(MyClass109 mc){
		this.mc = mc;
	}
	public void run() {
		if(Thread.currentThread().getName().equals("t1")) {
			mc.m1();
		}
		if(Thread.currentThread().getName().equals("t2")) {
			mc.m2();
		}
	}
}
class MyClass109{
	public synchronized void m1() {
		//休眠
		try {
			Thread.sleep(1500);
			System.out.println("m1.....");
		} catch(Exception w) {
			
		}
	}
	//m2方法会等m1方法结束，因为t1和t2共享了一个mc，并且m1和m2方法上都这个关键字，共享了一个对象mc
	public synchronized void m2() {
		System.out.println("m2......");
	}
//	//m2方法执行不需要等待m1结束，因为m2方法上没有synchronized
//	public void m2() {
//		System.out.println("m2......");
//	}
}

