package com.bjpowernode.java_learning;

public class D53_2_SingletonMode {
	public static void main(String[] args) {
		Singleton53 s1 = Singleton53.getInstance();
		Singleton53 s2 = Singleton53.getInstance();
		System.out.println(s1==s2);//返回结果是true，说明这两个对象是同一个对象，这就达到了我们的目的	
	}
}

class Singleton53{
	private static Singleton53 s;//这个很关键，因为静态变量是存储在方法区内存的，这里的s一旦被赋值了，就不会变了
	//第二次调用这个类不会执行这段语句语句因为第一次调用类之前已经创建，第一次调用类改变了它，就一直不用变了
	//将构造方法私有化
	private Singleton53() {	
		
	}
	//对外提供一个公开获取Singleton对象的方法
	public static Singleton53 getInstance() {
		if(s==null) {
			s = new Singleton53();
		}
		return s;
	}//这里必须是静态方法，如果是实例方法，我们对象都不能在外面创建，那么如果调用这个方法呢？
}
