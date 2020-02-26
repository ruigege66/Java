package com.bjpowernode.java_learning;

import java.util.*;
import java.lang.*;

public class D89_2_ImplementComparable {
	public static void main(String[] args) {
		SortedSet s = new TreeSet();
		User89 u1 = new User89(3);
		User89 u2 = new User89(45);
		User89 u3 = new User89(12);
		User89 u4 = new User89(25);
		s.add(u1);
		s.add(u2);
		s.add(u3);
		s.add(u4);
		
		Iterator i = s.iterator();
		while(i.hasNext()) {
			Object o = i.next();
			System.out.println(o.toString());
		}
	}

}
class User89 implements Comparable{
	int age;
	User89(int age){
		this.age = age;
	}
	public String toString() {
		return age+"";
	}
	//实现java.lang.Comparable;接口中的compareTo方法
	//该方法程序员负责，SUN提供的程序已经调用了该方法
	//需求：按照User89的年龄进行排序
	public int compareTo(Object o) {
		//编写一个规则
		int age1 = this.age;
		int age2 = ((User89)o).age;
		return age1-age2;
		
	}
}
