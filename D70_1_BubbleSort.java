package com.bjpowernode.java_learning;

public class D70_1_BubbleSort {
	public static void main(String[] args) {
		/*
		 * 冒泡排序算法：有一个int类型的数组：3 1 6 2 5
		 */
		int[] a = {3,1,6,2,5,45,8,9,86};
		//开始排序
		for (int i=a.length-1;i>0;i--) {
			for (int j=0;j<i;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
	}
}
