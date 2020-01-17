package com.bjpowernode.java_learning;

public class D74_2_RegularExpression {
	public static void main(String[] args) {
		String s1 = "hjifnasoodjhousnrdgoihjfviodjfg465ds46g51fdsg";
		//将ji替换成“中”
		System.out.println(s1.replaceAll("ji","中"));
		//将oo转换为“国”
		System.out.println(s1.replaceAll("o{2}", "国"));
		//将数字替换为“人”
		System.out.println(s1.replaceAll("\\d","人"));
	}

}
