package com.bjpowernode.java_learning;
import java.util.*;
/**
 * java.util.Set
 * 	java.util.SortedSet;无序不可以重复，但是存进去的元素可以按照元素大小顺序自动进行排列
 * 	  java.utile.TreeSet;
 */
import java.text.*;
public class D89_1_SortedSet {
	public static void main(String[] args) throws ParseException{
		//创建集合
		SortedSet ss = new TreeSet();
		//添加元素
		ss.add(10);//自动装箱
		ss.add(12);
		ss.add(5);
		ss.add(78);
		
		Iterator i = ss.iterator();
		while(i.hasNext()) {
			Object element = i.next();
			System.out.println(element);
		}
		//String
		SortedSet sts = new TreeSet();
		sts.add("Jack");
		sts.add("SUN");
		sts.add("COOK");
		sts.add("LUCKY");
		Iterator i2 = sts.iterator();
		while(i2.hasNext()) {
			Object element = i2.next();
			System.out.println(element);
		}
		//日期Date
		String t1 = "2008-08-08";
		String t2 = "2009-08-08";
		String t3 = "2008-09-08";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dt1 = sdf.parse(t1);
		Date dt2 = sdf.parse(t2);
		Date dt3 = sdf.parse(t3);
		
		
		SortedSet sss = new TreeSet();
		sss.add(t1);
		sss.add(t2);
		sss.add(t3);
		
		//遍历
		Iterator its = sss.iterator();
		while(its.hasNext()) {
			Object element = its.next();
			if(element instanceof Date) {
				Date d = (Date)element;
				System.out.println(sdf.format(d));
			}		
		}
	}
}
