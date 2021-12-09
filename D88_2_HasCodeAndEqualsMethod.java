package com.bjpowernode.java_learning;
import java.util.*;

public class D88_2_HasCodeAndEqualsMethod {
	public static void main(String[] args) {
		//创建集合
		Set s = new HashSet();
		Employee88 e1 = new Employee88("1000","Jack");
		Employee88 e2 = new Employee88("1001","Jack");
		Employee88 e3 = new Employee88("1001","Scott");
		Employee88 e4 = new Employee88("1000","Jack");
		Employee88 e5 = new Employee88("3000","JIN");
		Employee88 e6 = new Employee88("3001","Cook");
		//添加元素
		s.add(e1);
		s.add(e2);
		s.add(e3);
		s.add(e4);
		s.add(e5);
		s.add(e6);
		
		System.out.println(s.size());
	}
}
//根据现实的业务逻辑可以得知，该公司的员工编号是：1000-9999
class Employee88{
	//编号
	String no;
	//姓名
	String name;
	//Constructor
	Employee88(String no,String name){
		this.no = no;
		this.name = name;
	}
	//我们下面重写了hashCode方法的目的就是：
	//能够对同工号同名字的员工判断为同一个元素
	//如果不重写hashCode方法，那么会对对象的内存地址进行hashCode计算，这样就不会有相同的元素了
	//重写hashCode方法之后，相同的hashCode值，就会接下来的判断
	//也就是重写equals方法
	//如果员工编号相同，并且名字相同，则是同一个对象
	public boolean equals(Object o) {
		if(this==o) {
			return true;
		}
		if(o instanceof Employee88) {
			Employee88 e = (Employee88)o;
			if(e.no.equals(this.no) && e.name.equals(this.name)) {
				return true;
			}
		}
		return false;
	}
	
	//重写hashCode方法
	public int hashCode() {
		//以员工编号分组
		return no.hashCode();
	}
}
