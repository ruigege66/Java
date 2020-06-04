package com.bjpowernode.java_learning;
import java.lang.reflect.*;

public class D120_2_ParentClassAndInterfaceOfClass {
	public static void main(String[] args) throws Exception{
		Class c = Class.forName("java.lang.String");
		
		//获取父类
		Class superClass = c.getSuperclass();
		
		System.out.println(superClass.getName());
		System.out.println("================");
				
	    //获取父接口
	    Class[] ins = c.getInterfaces();
	    for(Class in:ins) {
	    	System.out.println(in.getName());
	    }
	}
}
