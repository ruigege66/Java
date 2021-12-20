package com.newJava;

public class D152_VariableParameters {
	public static void main(String[] args) {
		System.out.println("打印出了");
		printString();
		printString("jsidofs"," josdfjs");
	}
	
	public static void printString(String... strings) {
		if (strings != null) {
			int size = strings.length;
			for (int i=0; i<size; i++) {
				System.out.println(strings[i]);
			}
		} else {
			System.out.println("空参数也是可以的");
		}
		System.out.println("空数组");
	}
}
