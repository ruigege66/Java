package com.bjpowernode.java_learning;
import java.util.Date;

public class D114_1_VariableLengthParameter {
	public static void main(String[] args) throws Exception {
		m1();
		m1(1);
		m1(1,2);
		m1(1,2,3,4,5,6);
		m2("jjiosdjf","jdosf","hyouo");//这里也可以传入一个字符串类型的数组
		m3(Date.class);
		m4(45,878,64,49687,56);

		
		
				
	}
	//m1方法中有一个int类型的可变长参数
	public static void m1(int... a) {//m1方法在调用的时候，传递的实参可以是0到N个
		System.out.println("Test");
	}
	public static void m1(int s) {//如果可以精确匹配的方法， 则调用该方法，不会再去执行可变长参数的那个方法
		System.out.println("这里精确匹配了");
	}
	//可变长参数可以等同看作数组
	public static void m2(String... args) {
		for(int i=0;i<args.length;i++) {
			System.out.println(args[i]);
		}
	}
	public static void m3(Class... args) throws Exception{
		for(int i=0;i>args.length;i++) {
			Class c = args[i];
			System.out.println(c.newInstance());
		}
	}
	/*
	 * 	public static void m4(String... a,int i) {
	 *	
	 *  }
	 * 这样写是不对的，可变长参数必须写在参数的后面，python语言也是如此
	 */
	public static void m4(int i,int... a) {
		System.out.println(i);
		System.out.println(a[0]);
	}

}
