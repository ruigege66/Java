package com.bjpowernode.java_learning;

import java.util.*;

public class D90_1_SortedSet {
	public static void main(String[] args) {
		 //创建TreeSet集合的时候提供一个比较器
		SortedSet products = new TreeSet(new ProductComparator());
		Product90 p1 = new Product90(3.4);
		Product90 p2 = new Product90(4.0);
		Product90 p3 = new Product90(3.0);
		Product90 p4 = new Product90(2.0);
		Product90 p5 = new Product90(5.0);
		//添加元素
		products.add(p1);
		products.add(p2);
		products.add(p3);
		products.add(p4);
		products.add(p5);
		//遍历
		Iterator i = products.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
	}
}
class Product90 {
	double price;
	Product90(double price){
		this.price = price;
		
	}
	public String toString() {
		return price+"";
		
	}
}
class ProductComparator implements Comparator{
	public int compare(Object o1,Object o2) {
		double price1 = ((Product90)o1).price;
		double price2 = ((Product90)o2).price;
		if(price1==price2) {
			return 0;
		}else if (price1<price2) {
			return -1;
		}else {
			return 1;
		}
	}
}
