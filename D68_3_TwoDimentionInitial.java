package com.bjpowernode.java_learning;

public class D68_3_TwoDimentionInitial {
	public static void main(String[] args) {
		//3个一维数组
		//每个一维数组中有4个元素
		int[][] a = new int[2][2];
		//遍历
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
		}
		
		m1(new int[][] {{1,2,3},{4,5,6}});
		
	}
	public static void m1(int[][] a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
