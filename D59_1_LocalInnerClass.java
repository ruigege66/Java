package com.bjpowernode.java_learning;

public class D59_1_LocalInnerClass {
	public static void main(String[] args) {
		D59_1_LocalInnerClass d1 = new D59_1_LocalInnerClass();
		d1.m1();
		
	}
	//方法
	public void m1() {
		final int i = 10;//如果不加final的话，这个变量就会变了，那我们执行内部类中的
		//方法的时候，里面用到i的话，值就不能确定了
		//局部内部类
		//局部内部类不能访问控制权限修饰符修饰
		class InnerClass59 {
			//内部类不能有静态
//			public static void m1() {}
			//成员方法
			public void m2() {
				System.out.println(i);
			}
		}
		InnerClass59 inner = new InnerClass59();
		inner.m2();
	}
}
