package com.bjpowernode.java_learning;

public class D100_2_DecoratorMode {
	public static void main(String[] args) throws Exception{
		A100 a = new A100();
		B100 b = new B100();
		a.m1();
		b.m1();
		System.out.println("=============");
		//1.创建被装饰者
		
		FileReader fr = new FileReader();
		//2.创建装饰者
		BufferedReader br = new BufferedReader(fr);
		
		//3.通过执行装饰者中的方法间接去执行被装饰者中的方法
		br.close();
	}

}
class A100{
	public void m1() {
		System.out.println("m1");
	}
}
class B100 extends A100{
	public void m1() {
		super.m1();
		System.out.println("重写了");
	}
}
//使用BufferedReader对FileReader中的close方法进行扩展
class BufferedReader extends parent100{//BufferedReader100是装饰者
	//关联关系
	FileReader reader;//FileReader就是被装饰者
	//构造方法
	BufferedReader(FileReader reader){
		this.reader = reader;
	}
	//对FileReader中的close方法进行扩展
	public void close() {
		//扩展
		System.out.println("扩展代码1");
		reader.close();
		System.out.println("扩展代码2");
	}
}
class FileReader extends parent100{
	public void close() {
		System.out.println("guanbi");
	}
}
abstract class parent100{
	public abstract void close();
}
