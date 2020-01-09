package com.bjpowernode.java_learning;

public class D70_2_SelectionSort {
	public static void main(String[] args) {
		int [] a = {45,4,8,2,69,31,2,0};
		int min = 0;
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
}
