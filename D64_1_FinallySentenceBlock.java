package com.bjpowernode.java_learning;
import java.io.*;

public class D64_1_FinallySentenceBlock {
	public static void main(String[] args) throws FileNotFoundException{
		try {
			System.out.println("ABC");
		}finally {
			System.out.println("jdfoaij");
		}
		
		try {
//			System.exit(0);//这句话代表退出Java虚拟机
			FileInputStream f1 = new FileInputStream("jfdioa");
			//下面这个语句不会执行
			System.out.println("ABC");
		}finally {
			//无论try里面的语句是否报错，下面的语句都会执行
			System.out.println("jfaio");
			
		}
		int i = m1();
		System.out.println(i);
		
		
		FileInputStream f2 = null;
		try {
			f2 = new FileInputStream("jfoda");
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}finally {
			if(f2 != null) {
				try {
					f2.close();
				}catch(IOException e) {
					e.printStackTrace();
				}

			}
		}
	}
	public static int m1() {
		int i = 10;
		try {
			return i;
		}finally {
			i++;
			System.out.println("m1的i=" + i);//11
		}
		/*
		 * 以上代码的执行原理，
		 * int i = 10;
		 * trt{
		 * 	int temp = i;
		 * 	return temp;
		 * }finally{
		 * 	i++;
		 * 	System.out.println("m1的i=" + i);//11
		 * }
		 */

	}
}
