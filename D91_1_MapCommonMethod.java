package com.bjpowernode.java_learning;

import java.util.HashMap;
import java.util.*;

public class D91_1_MapCommonMethod {
	public static void main(String[] args) {
		Map persons = new HashMap();//HashMap的默认初始化容量为16，默认加载因子时0.75
		persons.put("10000","JACK");
		persons.put("10001","ZHANGXINLEI");
		persons.put("10002","YAOKUN");
		persons.put("10003","ZHAOZEKUN");
		persons.put("10004","LIDUO");
		persons.put("10005","DIAOBI");
		//1.判断集合中是否包含这样的value
		//注意：如果Map中的key重复了，value采用的是“覆盖”
		System.out.println(persons.containsValue("LUCK"));
		//2.通过key来获取value
		String k = "10001";
		Object v = persons.get(k);
		System.out.println(v);
		//3.通过key删除键值对
		persons.remove("10002");
		System.out.println(persons.get("10002"));
		//4.获取所有的value
		Collection values = persons.values();
		Iterator it = values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//5.获取所有的key
		//以下程序演示遍历Map集合
		Set keys = persons.keySet();
		Iterator it2 = keys.iterator();
		while(it2.hasNext()) {
			Object k2 = it2.next();
			Object v2 = persons.get(k2);
			System.out.println(k2+"-->"+v2);
		}
		System.out.println("--------------------------------------");
		//6.entrySet将Map集合key和value都打印出来，中间使用等号进行连接
		Set s2 = persons.entrySet();
		Iterator i3 = s2.iterator();
		while(i3.hasNext()) {
			System.out.println(i3.next());
		}
	}
}
