package com.bjpowernode.java_learning;

public class D67_2_TwoWaysOfInvolingArray {
	public static void main(String[] args) {
		//第一种方式
		int[] a = {12,3,4,5,6};
		m1(a);
		//第二种方式
		m1(new int[] {34,4,5,6});
		//m1({34,4,5,6});这种方式是不行的，编译报错
	}
	
	public static void m1(int[] a) {
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
