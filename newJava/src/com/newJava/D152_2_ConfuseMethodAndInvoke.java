package com.newJava;

public class D152_2_ConfuseMethodAndInvoke {
	public static void print(String... a) {
		System.out.println(a[0]);
	}
	
	public static void print(int... b) {
		System.out.println(b[1]);
	}
	
	public static void main(String[] args) {
		try {
			print(null);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			print("jdisf", "jdisfod");
		}
	}
	

}
