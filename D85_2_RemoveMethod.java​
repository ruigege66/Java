package com.bjpowernode.java_learning;

import java.util.*;

public class D85_2_RemoveMethod {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new ArrayList();
		
		Integer i1 = new Integer(10);
		//添加元素
		c.add(i1);
		//删除
		Integer i2 = new Integer(10);
		c.remove(i2);
		
		System.out.println(c.size());
		Manager85 m1 = new Manager85(10,"ji");
		c.add(m1);
		Manager85 m2 = new Manager85(10,"ji");
		c.remove(m2);
		System.out.println(c.size());
		//总结：从这两次输出的结果就可以看出来，remove方法与contains方法在用法上是一致的
		//他们的底层全部都调用了equals方法来进行比较，因为在使用这个方法的时候，必须保证我们的原始类中equals方法已经被重写，否则就会得到意想不到的结果
	}

}
