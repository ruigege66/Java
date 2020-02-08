package com.bjpowernode.java_learning;
import java.util.Random;
public class D80_3_Random {
	public static void main(String[] args) {
		//创建一个新的随机数生成器
		Random r = new Random();
		//生成int类型的随机数
		//int i = r.nextInt(101);//[0-100之间的随机数]
		//System.out.println(i);
		//循环生成5个随机数
		for(int i=0;i<5;i++) {
			System.out.println(r.nextInt(101));
		}
		
	}
}
