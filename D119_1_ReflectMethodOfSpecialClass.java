package com.bjpowernode.java_learning;
import java.lang.reflect.*;

public class D119_1_ReflectMethodOfSpecialClass {
	public static void main(String[] args) throws Exception{
		/**
		 * D118_CustomerService cs = new D118_CustomerService();
		 * boolean isSucess = cs.login("admin","123");
		 * 
		 *  接下来通过反射的方法，来获取某一个类的某个函数
		 *  
		 */
		//1.获取类
		Class c = Class.forName("com.bjpowernode.java_learning.D118_CustomerService");
		//2.获取某个特定的方法
		//通过：方法名+形参列表
		Method m = c.getDeclaredMethod("login",String.class,String.class);
		//login是D118_CustomerSercice中存在的类
		
		//通过反射机制执行login方法
		Object o = c.newInstance();
		
		//调用o对象的m方法，传递"admin","123"参数，方法的执行结果是retValue
		Object retValue = m.invoke(o,"admin","123");
		//打印出来
		System.out.println(retValue);

	}

}
