package com.bjpowernode.java_learning;

public class D57_2_MethodOfFinalize {
	public static void main(String[] args) {
		Person57 p1 = new Person57();
		p1 = null;//没有引用在指向它，等待被回收
		//程序员只能去“建议”垃圾回收器回收垃圾
		System.gc();//这个就是系统
		
		//使用hashcode方法，返回的是该对象的哈希值，java对象的内存地址经过哈希算法得到的int类型的值
		Person57 p2 = new Person57();
		System.out.println(p2.hashCode());
		
		//使用clone()方法，可以对一个对象进行复制一份，防止把原来的对象内容给破坏了
	}
}
class Person57{
	//重写Object方法中的fianlize方法
	public void fianlize() throws Throwable{//至于为什么这么写，暂时不用知道，因为源码中就是这样写的，我们重写里面的函数体就行了
		System.out.println(this + "马上就要被回收了");
		//可以重写finalize方法，比如里面重写给对象指定引用，以此来缓解，对象要被垃圾回收器回收
	}
}
