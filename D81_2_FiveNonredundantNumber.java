package com.bjpowernode.java_learning;
import java.util.Random;

public class D81_2_FiveNonredundantNumber {
	public static void main(String[] args) {
		/**
		 * 生成五个不重复的随机数
		 */
		Random r = new Random();
		
		int[] a = new int[5];
		int index = 0;
		while(index<5) {
			int temp = r.nextInt(6);
			if(temp!=0 && !contains(a,temp)) {
				a[index++] = temp;
				System.out.println(temp);
			}else {
				System.out.println("重复了");
			}
		}
		
	}
	public static boolean contains(int[] a,int temp) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==temp) {
				return true;
			}
		}
		return false;
	}
}
