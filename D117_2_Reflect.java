package com.bjpowernode.java_learning;
import java.lang.reflect.*;

public class D117_2_Reflect {
	public static void main(String[] args) throws Exception{
		//获取一个类
		Class c = Class.forName("com.bjpowernode.java_learning.D117_1_Reflect");
		//获取id属性
		Field idF = c.getDeclaredField("id");
//		System.out.println(idF);
		
		//获取到某个特定的属性？set,get
		Object o = c.newInstance();
		
		//因为id是private，所以需要打破封装,下面这个方法可以打破权限
		idF.setAccessible(true);
		//使用反射机制可以打破java程序的封装性，导致了Java对象的属性变得不安全了
		
		//set方法，void idF.set(Object obj,Object value);
		idF.set(o, "004512");//给对象o的idF属性赋上“004512”这个值
		
		
	}

}
