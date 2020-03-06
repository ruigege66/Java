package com.bjpowernode.java_learning;
import java.util.*;

public class D93_2_GenericityInitial {
	public static void main(String[] args) {
		SortedSet<Manager93> ss = new TreeSet<Manager93>();
		//添加
		Manager93 m1 = new Manager93(1000.0);
		Manager93 m2 = new Manager93(1500.0);
		Manager93 m3 = new Manager93(1300.0);
		
		ss.add(m1);
		ss.add(m2);
		ss.add(m3);
		//遍历
		Iterator<Manager93> it = ss.iterator();//迭代器也要使用泛型，写的时候忘了
		while(it.hasNext()) {
			Manager93 m = it.next();
			System.out.println(m);
		}
		System.out.println("=============");
		MyClass93<String> mc = new MyClass93<String>();
		//mc.m1(100);这个语句就报错了，因为我们上面指定了MyClass93类中存储String类型；
		mc.m1("100");
	}
}
class Manager93 implements Comparable<Manager93>{//实现的Comparable也要使用泛型，用的时候也忘了
	double sal;
	Manager93(double sal){
		this.sal = sal;
	}
	public String toString() {
		return sal+"";
	}
	public int compareTo(Manager93 m) {
		double sal1 = this.sal;
		double sal2 = m.sal;//这里使用了泛型不需要强制类型转换了
		if(sal1>sal2) {
			return 1;
		}else if (sal1==sal2){
			return 0;
		}else {
			return -1;
		}
	}
}
//自定义泛型，这里的T代表可以指定任意类型
class MyClass93<T>{
	public void m1(T t) {
		System.out.println(t);
	}
}
