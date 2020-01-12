package com.bjpowernode.java_learning;

public class D71_1_BinarySearch {
	public static void main(String[] args) {
		int[] a1 = {1,5,8,9,11,25,45,55};
		int destElement = 29;
		int index = binarySearch(a1,destElement);

		System.out.println((index==-1)?destElement + "元素不存在！":destElement + "在数组中的下标是：" + index);
	}
	
	public static int binarySearch(int[] a2 ,int destElement) {
		int begin = 0;
		int end = a2.length-1;

		
		while (begin<=end) {
			int mid = (begin+end)/2;
			
			if(a2[mid] == destElement) {
				return mid;
			}else if(a2[mid] >destElement) {
				end = mid -1;
			}else {
				begin = mid +1;
			}
		}
		return -1;
	}
}
