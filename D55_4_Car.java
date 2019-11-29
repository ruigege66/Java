package com.bjpowernode.java_learning;

public class D55_4_Car {
	D55_1_Engine e;//这个类中的成员变量创建的必要性，这是为了能够让引擎的对象传进来，进行引擎对象的调用
	D55_4_Car(D55_1_Engine e){
		this.e = e;
	}
	public void testEngine() {
		e.launch();
	}
}
