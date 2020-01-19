package com.bjpowernode.java_learning;

public class D76_3_IntegerPackedClass {
	public static void main(String[] args) {
		//获取Int类型的最大值和最小值
		System.out.println("int最大值：" + Integer.MAX_VALUE);
		System.out.println("int最小值：" + Integer.MIN_VALUE);
		//以int推byte
		System.out.println("byte最大值：" + Byte.MAX_VALUE);
		System.out.println("byte最小值：" + Byte.MIN_VALUE);
		//创建Integer类型的对象
		Integer i1 = new Integer(10);
		Integer i2 = new Integer("123");
		System.out.println(i1);
		System.out.println(i2);
	    //Integer i3 = new Integer("abc");//这个语句编译是可以通过的，但是运行的时候会报出“数字格式异常”，NumberFormException
		//虽然可以将字符串转化成Integer类型，但是该字符串也必须是“数字字符串”
		
	}

}
