package com.bjpowernode.java_learning;

public class D68_2_TwoDimetionArrays {
	public static void main(String[] args) {
		int[][] a = {{1,2,3},{4,5,6},{7,8,9,10}};
		//以上这个数组有多少个一维数组
		System.out.println(a.length+"个一维数组");
		//获取第一个一维数组的第一个元素
		int[] a0 = a[0];
		int a00 = a0[0];
		System.out.println(a00);
		System.out.println(a[0][0]);
		//获取最后一个一维数组的最后一个元素
		System.out.println(a[a.length-1][a[a.length-1].length-1]);
		//遍历二维数组
		System.out.println("=============================");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
	}

}
