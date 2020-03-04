package com.bjpowernode.java_learning;

import java.util.*;

public class D92_2_GenericityInitial {
	public static void main(String[] args) {
		//创建一个集合，存储A,B,C
		Set s = new HashSet();
		//创建对象
		A92 a = new A92();
		B92 b = new B92();
		C92 c = new C92();
		s.add(a);
		s.add(b);
		s.add(c);
		//需求：遍历集合，如果是A92类型调用m1方法，B92类型调用m2方法，C92类型调用m3方法
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			//只能做大量的强制类型转换
			if(o instanceof A92) {
				A92 a1 = (A92)o;
				a1.m1();
			}else if(o instanceof B92) {
				B92 b1 = (B92)o;
				b1.m2();
			}else if(o instanceof C92) {
				C92 c1 = (C92)o;
				c1.m3();
			}
		}
	}

}
class A92{
	public void m1() {
		System.out.println("A 's m1..");
	}
}
class B92{
	public void m2() {
		System.out.println("B 's m1..");
	}
}
class C92{
	public void m3() {
		System.out.println("C 's m1..");
	}
}
