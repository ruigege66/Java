package com.bjpowernode.java_learning;

public class D49_Constant {
	public static void main(String[] args) {
		System.out.println(Chinese49.GUO_JI);
		System.out.println(Math49.PI);
	}

}
class Chinese49{
	//国籍
	//需求：每一个中国人国籍都是中国，而且国籍不会发生变化，为了防止国籍被修改，建议加final修饰
	public static final String GUO_JI = "China";
	
	
}
class Math49{
	public static final double PI = 3.1415926;
}
