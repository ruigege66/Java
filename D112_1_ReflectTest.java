package com.bjpowernode.java_learning;
import java.util.Date;

public class D112_1_ReflectTest {
	public static void main(String[] args) throws Exception {
		//获取Class类型对象的三种方式
		//第一种方式
		Class c1 = Class.forName("com.bjpowernode.java_learning.D112_2_Emploe112");
		//c1引用保存内存地址指向堆中对象，该对象代表的是D112_2_Emploe112整个类
		
		//第二种方式
		//java中每个类型class属性
		Class c2 = D112_2_Emploe112.class;
		
		//第三种方法
		//java语言中任何一个java对象都有getClass方法
		D112_2_Emploe112 d = new D112_2_Emploe112();
		Class c3 = d.getClass();//c3是运行时类（d的运行时类是D112_2_Emploe112
		
		Class c4 = Date.class;//c4代表Date这个类
		Class c5 = Class.forName("java.util.Date");//必须写类的全名，类全名带有包名
		Date d1 = new Date();
		Class c6 = d1.getClass();
		
	}
}

