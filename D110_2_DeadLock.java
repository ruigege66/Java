package com.bjpowernode.java_learning;

public class D110_2_DeadLock {
	public static void main(String[] args) throws Exception{
		Object o1 = new Object();
		Object o2 = new Object();
		
		Thread t1 = new Thread(new T110(o1,o2));
		Thread t2 = new Thread(new T111(o1,o2));
		
		t1.start();
		t2.start();
	}
}
class T110 implements Runnable{
	Object o1;
	Object o2;
	T110(Object o1,Object o2){
		this.o1 = o1;
		this.o2 = o2;
	}
	public void run() {
		synchronized(o1) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
			synchronized(o2) {
				System.out.println("没有死锁");
			}
		}
	}
}
class T111 implements Runnable{
	Object o1;
	Object o2;
	T111(Object o1,Object o2){
		this.o1 = o1;
		this.o2 = o2;
	}
	public void run() {
		synchronized(o2) {
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
			synchronized(o1) {
				System.out.println("没有死锁");
			}
		}
	}
}
