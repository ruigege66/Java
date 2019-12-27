package com.bjpowernode.java_learning;

public class D66_ArryInitialMethods {
	public static void main(String[] args) {
		//静态初始化一个int类型的一维数组
		int[] a1 = {10,22,21};
		//取得第一个元素
		System.out.println("第一个元素：" + a1[0]);
		System.out.println("最后一个元素：" + a1[2]);
		System.out.println("最后一个元素：" + a1[a1.length-1]);
		//去的个数
		System.out.println("数组中的的元素个数为："+a1.length);
		//遍历一维数组
		for(int i = 0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		//将第二个元素改为100
		a1[1] = 100;
		System.out.println("===================");
		for(int i= 0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		
		int[] a2 = new int[4];

		//引用类型的数组
		Object[] objs = new Object[3];
		for(int index=0;index<objs.length;index++) {
			Object o = objs[index];
			//o.toString();//注意空指针异常
			System.out.println(o);//null null null这里就没有出现空指针异常，这是因为pirintln
			//这个函数的源码里面对这种空指针做了筛选，可以见源码
			
			int a3[] = {12,12,45};
		}
	}

}
