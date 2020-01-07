package com.bjpowernode.java_learning;

import java.util.Scanner;

public class D69_2_AcceptUserInput {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//程序运行到此处，停下来，等待用户的输入
		String userInput = s.next();
		System.out.println("您输入了："+userInput);
	}
}
