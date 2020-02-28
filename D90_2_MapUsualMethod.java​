package com.bjpowernode.java_learning;
import java.util.*;

public class D90_2_MapUsualMethod {
	public static void main(String[] args) {
		/**
		 * 关于Map集合中的常用方法
		 */
		//void clear();清空Map
		//boolean containsKey(Object key);判断Map中是否包含这样的key
		
		//boolean containsValue(Object value);判断Map中是否包含这样的value
		
		//Set<Map.Entry<K,V>> entrySet();返回此映射中包含的映射关系的Set视图
		
		//Object get(Object key);通过key获取value;
		
		//Object put(Object key,Object value);向集合中添加键值对
		
		//boolean isEmpty(); 判断该集合是否为空
		
		//Object remove(Object key);通过key将键值对删除
		
		//int size();获取Map中键值对的个数
		
		//Set keySet();获取Map中所有的键值对
		
		//Collection values();获取Map集合中所有的value
		
		//1.创建Map集合
		Map persons = new HashMap();//HashMap的默认初始化容量为16，默认加载因子时0.75
		//2.存储键值对
		persons.put("10000","JACK");
		persons.put("10001","ZHANGXINLEI");
		persons.put("10002","YAOKUN");
		persons.put("10003","ZHAOZEKUN");
		persons.put("10004","LIDUO");
		persons.put("10005","DIAOBI");
		//3.判读键值对的个数
		//Map中的key是无序不可重复的，和HashSet相同
		System.out.println(persons.size());
		
		//4.判断集合中是否包含这样的key
		System.out.println(persons.containsKey("10000"));
		
		//5.判断集合中是否包含这样的value
		System.out.println(persons.containsValue("ZHANGXINLEI"));
	
	}
}
