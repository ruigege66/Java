package com.bjpowernode.java_learning;
import java.lang.reflect.*;


public class D144_4_ClassTest {
	public static void main(String[] args) {
		try {
			//获取指定类的Class对象
			Class c = Class.forName("java.util.Date");
			//获取类的包信息
			Package p = c.getPackage();
			//包名
			String pname = p.getName();
			System.out.println("Date类包信息："+p);
			System.out.println("Date类包名"+pname);
			//获取类的修饰符
			int m = c.getModifiers();
			String str = Modifier.toString(m);
			System.out.println("Date的修饰符："+str);
			System.out.println("Date类名："+c.getName());
			
			//获取Date类的字段
			Field[] f = c.getDeclaredFields();
			System.out.println("---循环输出Date类中的字段名---");
			for(Field field:f) {
				System.out.print(field.getName() + " ");
			}
			System.out.println();
			
			//获取类的构造方法
			Constructor[] con = c.getDeclaredConstructors();
			System.out.println("--循环输出Date类中的构造方法信息---");
			for(Constructor cc:con) {
				System.out.println(cc.getName() + "的修饰符："+Modifier.toString(cc.getModifiers()));
				Parameter[] ps = cc.getParameters();
				System.out.println(cc.getName() + "的参数：");
				for(Parameter pp :ps) {
					System.out.print(pp.getName() + " ");
				}
				System.out.println();
			}
			
			
			
			
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}

