                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
package com.bjpowernode.java_learning;

public class D106_1_SleepMehthodAnalysis {
	public static void main(String[] args) throws InterruptedException{
		Processer106 p1 = new Processer106();
		p1.start();
		//需求：子线程启动后0.5s之后打断它的休眠
		Thread.sleep(500);
		p1.interrupt();//这样就会是子线程打断休眠
		//这个底层的实现方法是一个调用中断异常的方式，因此，这个休眠之后的操作就不会执行了
		//在这个代码中就会直接进行下一次循环
		for(int i=0;i<5;i++) {
			System.out.println(Thread.currentThread().getName()+"---->"+i);
			//下面这个语句也可以使用对象.sleep()；因为sleep方法是一个静态方法。
			//即p1.sleep(200);这个main线程也会休眠200ms
			Thread.sleep(200);
		}
	}
}
class Processer106 extends Thread{
	//Thread中的run方法不抛出异常，因此重写run方法，在run方法的声明位置不能使用throws
	//所以run方法中只能使用try...catch.....
	public void run() {
		for(int i=0;i<5;i++) {
			
			System.out.println(Thread.currentThread().getName()+"--->"+i);
			try {
				Thread.sleep(1000);//当前线程阻塞1s
				System.out.println(i);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	//m1方法是可以使用throws的
}
