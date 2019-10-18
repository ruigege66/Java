package com.bjpowernode.java_learning;

public class D42_theSitustionOfNotOmitTihsKeyword {
	public static void main(String[] args) {
		User2 u1 = new User2(2155,"张三");
		//这里说明了两个问题
		//首相可以传入参数，说明这是调用了User2类中的构造方法，可以看一下函数原型是需要两个参数的
		//如果不写这连个参数，那么我们需要在类User2中增加不带参数的构造方法（也就是重载函数）
		//虽然id和name是private类型的，但是我们传入参数可以看出来，照样可以修改，但是我们后面再修改的时候
		//就必须得调用那两个实例函数了
		System.out.println(u1.getName());
		
	}
 
}
class User2{
	private int id;
	private String name;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;//这里如果写成了id=id，那么根据就近原则，第一个id就是形式参数，第二个id也是形式
		//参数，所以这里必须要加上this才行，类似于python中的self
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public User2(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
}
