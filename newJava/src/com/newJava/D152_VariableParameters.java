package com.newJava;

public class D152_VariableParameters {
	public static void main(String[] args) {
		System.out.println("��ӡ����");
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
			System.out.println("�ղ���Ҳ�ǿ��Ե�");
		}
		System.out.println("������");
	}
}
