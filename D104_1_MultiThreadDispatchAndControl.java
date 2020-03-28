package com.bjpowernode.java_learning;

import com.sun.imageio.plugins.tiff.TIFFT4Compressor;

public class D104_1_MultiThreadDispatchAndControl {
	public static void main(String[] args) {
		//如何获取当前线程对象
		Thread t = Thread.currentThread();//t保存的内存地址指向的是线程是“主线程对象”
		//获取线程的名字
		System.out.println(t.getName());
		
		Thread t2 = new Thread(new Processor104_1());
		t2.start();
		
		Thread t3 = new Thread(new Processor104_1());
		t3.start();
		//可以给线程起名字
		Thread t4 = new Thread(new Processor104_1());
		t4.setName("t4");
		t4.start();
	}
}
class Processor104_1 implements Runnable{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		
	}
}
