package com.bjpowernode.java_learning;
import java.util.*;
public class D93_1_GenercityInitial {
	public static void main(String[] args) {
		//创建一个List集合，只能存储字符串类型
		List<String> strs = new ArrayList<String>();
		//添加元素
		strs.add("jodsf");
		strs.add("jodsffds");
		strs.add("jodsfsdf");
		strs.add("jodsfjhgfh");
		//遍历
		Iterator<String> it = strs.iterator();
		while(it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		
		Map<String,Integer> maps = new HashMap<String,Integer>();
		//存储
		maps.put("西瓜",10);
		maps.put("苹果",10);
		maps.put("香蕉",20);
		//遍历
		Set<String> keys = maps.keySet();
		Iterator<String> it2 = keys.iterator();
		while(it2.hasNext()) {
			String k = it2.next();
			Integer v =  maps.get(k);
			System.out.println(k+"----->"+v);
		}
		
		
	}

}
