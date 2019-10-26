package com.bjpowernode.java_learning;

public class D45_1_InheritClassExample extends Extend1 {
	public static void main(String[] args) {
		D45_1_InheritClassExample d1 = new D45_1_InheritClassExample();
		System.out.println(d1.toString());//说明继承了JavaSE默认的类
		System.out.println(d1.a);//继承了Extend1这个类，其实继承就是指把父类的代码都拿到子类里面
		//不能继承构造方法和私有实例变量
	}

}
class Extend1 {
	int a;
}
