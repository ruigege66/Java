package com.bjpowernode.java_learning;

public class D55_5_test {
	public static void main(String[] args) {
		//生产引擎
		D55_1_Engine e1 = new D55_2_Benz();
		D55_1_Engine e2 = new D55_3_Audi();
		//生产汽车
		D55_4_Car c1 = new D55_4_Car(e1);
		D55_4_Car c2 = new D55_4_Car(e2);
		c1.testEngine();
		c2.testEngine();
		
	}
}
