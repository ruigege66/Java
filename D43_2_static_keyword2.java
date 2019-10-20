package com.bjpowernode.java_learning;

public class D43_2_static_keyword2 {
	  public static void main(String[] args) {
		    Chinese2 c1 = new Chinese2("zhangsan",32);
		    System.out.println(c1.country);
		    System.out.println(Chinese2.country);
		    c1 = null;
		    System.out.println(c1.country);
		  }
}
class Chinese2{
	  String name;
	  int id;
	  static String country = "China";
	  public Chinese2(String name,int id) {
	    this.name = name;
	    this.id = id;
	  }
	  public Chinese() {}
	}
