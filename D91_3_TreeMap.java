package com.bjpowernode.java_learning;
import java.util.*;

public class D91_3_TreeMap {
	public static void main(String[] args) {
		//Map，key存储Product91,value存储个数
		SortedMap products = new TreeMap();
		/**
		 * 匿名内部类(单独写一个比较器的方法）
		 * SortedMap products = new TreeMap(new Comparator(){
		 *   	public int compareTo(Object o) {
		 *			double price1 = this.price;
		 *			double price2 = ((Product91)o).price;
		 *			if(price1<price2) {
		 *				return -1;
		 *			}else if(price1>price2) {
		 *				return 1;
		 *			
		 *			}else {
		 *				return 0;
		 *			}
		 *		}
	     *})
		 */
		//准备对象
		Product91 p1 = new Product91("西瓜",1.0);
		Product91 p2 = new Product91("黄瓜",2.0);
		Product91 p3 = new Product91("南瓜",3.0);
		Product91 p4 = new Product91("冬瓜",4.0);
		//添加
		products.put(p1,8);//后面这个value无所谓，我们暂且认为是斤数
		products.put(p2,4);
		products.put(p3,4);
		products.put(p4,4);
		//遍历
		Set keys = products.keySet();
		Iterator it = keys.iterator();
		while(it.hasNext()) {
			Object k = it.next();
			Object v =products.get(k);
			System.out.println(k+"-->"+v);
		}
		
		
	}
}
class Product91 implements Comparable{
	String name;
	double price;
	Product91(String name,double price){
		this.name = name;
		this.price = price;
	}
	public String toString() {
		return "Poduct91(name=" + name + ",price=" + price +")";
	}
	public int compareTo(Object o) {
		double price1 = this.price;
		double price2 = ((Product91
				)o).price;
		if(price1<price2) {
			return -1;
		}else if(price1>price2) {
			return 1;
		
		}else {
			return 0;
		}
	}
}
