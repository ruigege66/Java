package com.bjpowernode.java_learning;
import java.io.*;

public class D62_1_ThrowsOfException {
	public static void main(String[] args) throws FileNotFoundException{
		//创建一个文件输入流，读取文件
		//java编译器是如何知道以下的代码在执行过程可能存在异常
		//java编译器是如何知道这个异常发生的几率比较高呢？
		//java编译器不是那么智能，因为FileInputStream这个构造方法在声明的位置上使用了
		//throws FileNotFoundException;
		//FileInputStream fls = new FileInputStream("C:\\Users\\lenovo1\\Desktop\\微信公众号运营-Java\\Java连载51-super关键字.docx");
//		try{
		m1();
			//使用throws处理异常是不是真正处理异常而是推卸责任
			//谁调用就会跑给谁
			//上面的m1方法如果出现了异常，因为采用的是向上抛出，给了JVM,JVM遇到这个异常
			//就会退出JVM，下面的这个代码不会执行
//		}catch(FileNotFoundException e) {
//			System.out.println("出现了异常");
//		}
	}
	public static void m1() throws FileNotFoundException{
		m2();
	}
	public static void m2() throws FileNotFoundException{
		m3();
	}
	public static void m3() throws FileNotFoundException{
		//FileNotFound构造方法声明位置上使用了throws（向上抛出）
		new FileInputStream("E:\\04.image\\timg.jpgu");
	}
}
