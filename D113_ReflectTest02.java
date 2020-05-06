package com.bjpowernode.java_learning;
import com.bjpowernode.java_learning.A113;

public class D113_ReflectTest02 {
	public static void main(String[] args) throws Exception{
		//将A113.class文件转载到JVM中的过程。
//		Class.forName("A113");
		
		//不会执行静态语句块
		Class c = A113.class;
		System.out.println("=====");
		//下面的语句会执行静态语句块
		A113 a = new A113();
		Class c2 = a.getClass();
		
		//获取Class类型的对象之后，可以创建该“类”的对象
		Object o = c.newInstance();//调用了A113的无参数构造方法
		
		System.out.println(o.toString());
								
	}
}
