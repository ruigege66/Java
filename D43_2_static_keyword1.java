package com.bjpowernode.java_learning;

public class D43_2_static_keyword1 {
	public static void main(String[] args) {
//		Chinese c1 = new Chinese("zhangsan",32);//这样写报错因为，缺一个参数，即使是提前被定义了
		Chinese c2 = new Chinese("lisi",34,"fhai");	//尝试修改值，但是并不成功	
		Chinese c3 = new Chinese("lisi",34,"China");
		System.out.println(c2.country);
		System.out.println(c3.country);
	}
}
class Chinese{
	String name;
	int id;
	static String country = "China";
	public Chinese(String name,int id,String country) {
		this.name = name;
		this.id = id;
		this.country = country;
	}
	pubic Chinese() {}
}
