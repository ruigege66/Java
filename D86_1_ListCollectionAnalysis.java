package com.bjpowernode.java_learning;

import java.util.*;

public class D86_1_ListCollectionAnalysis {
	public static void main(String[] args) {
		//创建一个List集合
		//Collection c = new ArrayList();//这样初始化一个列表编译没问题，但是我们就不用能用List特有的方法了
		List l = new ArrayList();
		//List l = new LinkedList();//这两种初始化方式哪种都可以，这就涉及到底层的数据结构问题了，可参见《算法》一书
		//向列表的尾部添加元素
		l.add(100);
		l.add(99);
		l.add(23);
		l.add(250);
		l.add("hiosaf");
		//add(int index,E e)向指定位置插入e
		l.add(5,"jioasf");
		System.out.println(l.get(1));
		System.out.println("====================");
		//遍历
		Iterator it = l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//这也看出来，既可以使用迭代器来遍历，也可以使用get方法进行遍历
		
	}
}
