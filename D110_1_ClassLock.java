package com.bjpowernode.java_learning;



public class D110_1_ClassLock {
	public static void main(String[] args) throws Exception{
		Thread t1 = new Thread(new Processor110());
		Thread t2 = new Thread(new Processor110());
		t1.setName("t1");
		t2.setName("t2");
		t1.start();
		//延迟，保证t1先执行
		Thread.sleep(1000);
		//下面的方法没有等t1结束，因为这个方法不函数有锁。如果这个方法加上synchronized就会等着t1结束。
		t2.start();
		//即使是实例化对象了，这个类锁也是有效的，跟对象也没有，底层用的是类锁
	}
}
class Processor110 implements Runnable{
	public void run() {
		if("t1".equals(Thread.currentThread().getName())){
 			MyClass110.m1();
		}
		if("t2".equals(Thread.currentThread().getName())){
			MyClass110.m2();
		}
	}
}

class MyClass110{
	//synchronized添加到静态方法上，线程执行方法的时候会找类锁。
	public synchronized static void m1() {
		try {
			Thread.sleep(10000);			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("m1......");
	}
	public static void m2() {
		System.out.println("m2......");
	}
}
