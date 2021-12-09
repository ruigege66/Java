package com.bjpowernode.java_learning;
import java.util.Arrays;
public class D71_2_ArraysToolsClass {
	public static void main(String[] args) {
		int [] a1 = {45,7,5,9,21,25,98};
		Arrays.sort(a1);
		for (int i= 0;i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		System.out.println("==================");
		int index = Arrays.binarySearch(a1,98);
		System.out.println(index);
		
		
	}
}
