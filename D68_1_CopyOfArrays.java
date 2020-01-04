package com.bjpowernode.java_learning;

public class D68_1_CopyOfArrays {
	public static void main(String[] args) {
		int[] a1 = {2,3,4,5,6,7,8};
		int[] a2 = {10,11,12,13,14,15,16};
		System.arraycopy(a1,2,a2,3,3);//参数为：源数组、源数组的开始下标、目标数组、目标数组的开始下标、拷贝长度
		for(int i=0;i<a2.length;i++) {
			System.out.println(a2[i]);
		}
	}
}
