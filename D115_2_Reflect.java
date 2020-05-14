package com.bjpowernode.java_learning;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class D115_2_Reflect {
	public static void main(String[] args) throws Exception {
		//获取整个类
		Class c = D115_1_User.class;
		
		//获取属性
		//获取所有的public修饰的属性
//		Field[] fs = c.getFields();
//		System.out.println(fs.length);
//		System.out.println(fs[0].getName());
		
		
		//获取所有的属性
		Field[] fs =c.getDeclaredFields();
		for(Field field:fs) {
		    int i = field.getModifiers();
		    //getModifiers是用来显示修饰符的
		    String strModifier = Modifier.toString(i);
		    System.out.println(i);
		    System.out.println(strModifier);
		    //Modifier.toString()方法传入数字用于解释是哪种修饰符
		    
			Class type = field.getType();
			System.out.println(type.getName());//类的名字
			System.out.println(type.getSimpleName());//类的简易名字
			System.out.println(field.getName());//域的名字
			System.out.println("-----------");
		}
		
		StringBuffer  sb = new StringBuffer();
		sb.append(Modifier.toString(c.getModifiers())+" class "+c.getSimpleName() + "{\n");
		for(Field field:fs) {
			sb.append("\t");
			sb.append(Modifier.toString(field.getModifiers())+" ");
			sb.append(field.getType().getSimpleName() + " ");
			sb.append(field.getName()+";\n");
		}
		sb.append("}");
		System.out.println(sb);
		
	}

}
