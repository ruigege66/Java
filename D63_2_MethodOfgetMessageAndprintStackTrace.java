package com.bjpowernode.java_learning;

import java.io.*;

public class D63_2_MethodOfgetMessageAndprintStackTrace {
	public static void main(String[] args) {
		try {
			FileInputStream f1 = new FileInputStream("C:\\fjdoa");
		}catch (FileNotFoundException e) {
			//打印异常堆栈信息
			//一般情况下都会使用该方法去调试程序
			e.printStackTrace();
			//下面这个方法与上面这个方法的功能其实是一样的，但是通常使用上面的方法，因为上面的方法能够打印出更加详细的信息
			String msg = e.getMessage();
			System.out.println(msg);
		}
		System.out.println("ABC");
	}
}
