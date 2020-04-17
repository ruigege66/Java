package com.bjpowernode.java_learning;

public class D110_3_DaemonThread {
	public static void main(String[] args) {
		Thread t1 = new Processer110_1();
		t1.setName("守护线程");
		//将t1这个用户线程修改为守护线程
		t1.setDaemon(true);
		t1.start();
		try {
			Thread.sleep(1000);
		}catch(Exception e) {
			e.printStackTrace();
		}
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getName()+"-->"+i);
			
		}
		
	}

}
class Processer110_1 extends Thread{
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName()+"-->");
			try {
				Thread.sleep(500);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
