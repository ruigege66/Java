package com.bjpowernode.java_learning;

public class D106_2_InterruptSleep {
	public static void main(String[] args) throws Exception{
		Processer106_2 p = new Processer106_2();
		Thread t = new Thread(p);
		t.setName("t");
		t.start();
		//5s之后终止
		Thread.sleep(5000);
		p.run1 = false;
		//这种非异常的方法更好，因为不会抛出异常。
			
	}

}
class Processer106_2 implements Runnable{
	
	boolean run1 = true;
	
	public void run() {
		for(int i=0;i<10;i++) {
			if(run1) {
				try {
					Thread.sleep(1000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"-->"+i);
			}else {
				return;
			}
			
		}
	}
}
