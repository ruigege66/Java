package com.bjpowernode.java_learning;

import java.lang.reflect.*;

public class D119_2_DecompilationOfAllConstructer {
	public static void main(String[] args) throws Exception{
		//1.获取一个类
		Class c = Class.forName("java.lang.String");
		//2.获取所有的构造方法
		Constructor[] cs = c.getDeclaredConstructors();
		
		for(Constructor con:cs) {
			//获取修饰符
			System.out.println(Modifier.toString(con.getModifiers()));
			
			//获取构造方法名
			System.out.println(c.getName());
			
			//构造方法的形式参数列表
			Class[] parameterTypes = con.getParameterTypes();
			for(Class parameterType:parameterTypes) {
				System.out.println(parameterType.getSimpleName());
			}
			System.out.println("=================");
		}
		
		
		//反编译
		StringBuffer sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+" class"+c.getSimpleName() + "{\n");
		//构造方法
		for(Constructor con:cs) {
			sb.append("\t");
			sb.append(Modifier.toString(con.getModifiers()) + " ");
			sb.append(c.getSimpleName()+"(");
			Class[] parameterTypes = con.getParameterTypes();
			for(int i=0;i<parameterTypes.length;i++) {
				Class parameterType = parameterTypes[i];
				if(i==parameterTypes.length-1) {
					sb.append(parameterType.getSimpleName());
				}else {
					sb.append(parameterType.getSimpleName()+",");
				}
				
			}
			sb.append("){}\n");
		}
		sb.append("}");
		System.out.println(sb);
		
	}

}
