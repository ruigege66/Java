package com.bjpowernode.java_learning;
import java.util.*;

public class D94_1_EnhanceForCirculation {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5,6};
		//遍历
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("=================");
		//使用foreach
		for(int e:a) {//int e代表的是集合或者数组中的每一个元素
			System.out.println(e);
		}
		System.out.println("=================");
		//集合
		Set<String> strs = new HashSet<String>();
		strs.add("hdosafj");
		strs.add("hdosafdfgdfgj");
		strs.add("hdoyikiljsafj");
		strs.add("hdojhgjsafj");
		//使用foreach遍历
		for(String s:strs) {
			System.out.println(s);
		}
		System.out.println("=================");
		//练习一个反例：集合不使用泛型
		List l = new ArrayList();
		l.add("josdajf");
		l.add(45);
		l.add(false);
		//如果不使用泛型，那么需要哦使用Object类型来定义集合中的元素
		for(Object o :l){
			System.out.println(o);
		}
		System.out.println("=================");
		
		String[] ins = {"运动","音乐","旅行","美食"};
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<ins.length;i++) {
			if(i==ins.length-1) {
				sb.append(ins[i]);
			}else {
				sb.append(ins[i]);
				sb.append(",");
			}
		}
		//以上的循环就不适用增强for,因为最后一个元素无法特殊处理

	}
}
