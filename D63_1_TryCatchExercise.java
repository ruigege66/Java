package com.bjpowernode.java_learning;
import java.io.*;
public class D63_1_TryCatchExercise {
	public static void main(String[] args) {
		try {
			FileInputStream f1 = new FileInputStream("C:\\user");
			f1.read();
		}catch(ArithmeticException a) {
			
		}catch(FileNotFoundException f) {
			
		}
	}
}
