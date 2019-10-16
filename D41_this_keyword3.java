
package com.bjpowernode.java_learning;

public class D41_this_keyword3 {
	
	public void do1() {
		System.out.println("youxiu");
	}
	public void do2() {
		System.out.println("youxiu");
		do1();//编译成功，因为do2调用就必须创建了对象，因此do1这个实例方法肯定能调用
	}
}
