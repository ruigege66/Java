package com.bjpowernode.java_learning;
import java.util.Collections;
import java.util.*;

public class D92_1_CollecitonsToolsClass {
	public static void main(String[] args) {
		//使用Collections工具完成集合的排序
		List l = new ArrayList();
		//添加元素
		l.add(10);
		l.add(5);
		l.add(9);
		l.add(20);
		l.add(30);
		//遍历
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		System.out.println("=============");
		//或者这么写,使用迭代器
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=============");
		//排序
		Collections.sort(l);
		for(Iterator it2 = l.iterator();it2.hasNext();) {
			System.out.println(it2.next());
		}
		System.out.println("=============");
		//给定Set集合
		Set s = new HashSet();
		s.add(1);
		s.add(10);
		s.add(9);
		s.add(8);
		s.add(7);
		//对set集合进行排序
		//collections.sort(s);//这个编译时失败，不能使用这个方法
		//将set集合转化为List集合
		List listS = new ArrayList(s);
		Collections.sort(listS);
		for(int i=0;i<listS.size();i++) {
			System.out.println(listS.get(i));
		}
		System.out.println("=============");
		//创建List集合，，List集合中存储Person类型，是否可以排序？
		List ps = new ArrayList();
		ps.add(new Person92());
		ps.add(new Person92());
		ps.add(new Person92());
		ps.add(new Person92());
		
		Collections.sort(ps);//如果不把Person92类中的compareTo方法实现，这里就会报错，因为没有定义排序方法，就无法进行排序
		//将ArrayList集合转换成线程安全的
		List myList = new ArrayList();
		Collections.synchronizedList(myList);
		
		
		
	}
}
class Person92 implements Comparable{
	public int compareTo(Object o){
		return 1;
	}
}
