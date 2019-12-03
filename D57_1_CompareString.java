package com.bjpowernode.java_learning;

public class D57_1_CompareString {
	public static void main(String[] args){
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		System.out.println(s1 == s2);//false
		System.out.println(s1.equals(s2));
	}
}
