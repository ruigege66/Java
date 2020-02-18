package com.bjpowernode.java_learning;

import java.util.*;
import java.lang.Iterable;

public class D85_3_DeepIntoRemoveMethod {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add(1);//这里复习了自动装箱，int类型直接转化为Integer类型
		c.add(2);
		c.add(3);
		//遍历
		Iterator it = c.iterator();
		while(it.hasNext()) {
			Object element = it.next();
			//删除
			it.remove();//通过迭代器的remove方法删除
		}
		System.out.println(c.size());
		Collection c2 = new ArrayList();
		c2.add(1);//这里复习了自动装箱，int类型直接转化为Integer类型
		c2.add(2);
		c2.add(3);
		Iterator it2 = c2.iterator();
		while(it2.hasNext()) {
			Object element = it2.next();
			c2.remove(element);
		}
		
	}

}
