package com.bjpowernode.java_learning;
import java.util.*;

public class D84_2_Iterator {
	public static void main(String[] args) {
		//创建集合对象
		Collection c = new LinkedList();
		
		//添加元素
		c.add(100);
		c.add(3.14);//自动装箱
		c.add(false);
		
		//迭代，遍历
		//1.获取迭代器对象
		//不需要关心底层集合的具体类型，所欲集合以来的迭代器都是了java.util.Iterator;接口
		//java.util.LinkedList$ListItr类是LinkedList集合所依赖的迭代器
		//java.util.AbstractLisr$Itr类是ArrayList集合所依赖的迭代器
		Iterator it = c.iterator();
		//迭代器是面向接口编程，it是引用，保存了内存地址，指向堆中的“迭代器对象”
		System.out.println(it);//java.util.LinkedList$ListItr@30c7dale  说明这是一个内部类
		//如果c是一个ArrayList，那么这里打印的是java.util.AbstractList$Itr@de6cd
		
		
		//2.开始调用方法，完成遍历，迭代
		while(it.hasNext()) {
			Object element = it.next();
			System.out.println(element);
		}
		/**
		 * boolean b = it.hasNext();判断是否有更多的元素，如果有，就返回true
		 * Object o = it.next();将迭代器向下移动一位，并且取出指向的元素
		 * 原则：嗲用it.next()方法之前必须调用it.hasNext();
		 * 
		 */
		
		//for循环
		for(Iterator its = c.iterator();its.hasNext();) {
			Object o = its.next();
			System.out.println(o);
		}
		
		
	}
}
