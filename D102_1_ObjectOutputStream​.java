package com.bjpowernode.java_learning;
import java.io.*;
import java.io.Serializable;

public class D102_1_ObjectOutputStream {
	public static void main(String[] args) throws IOException,ClassNotFoundException{
		//1.创建java对象
		User102 u1 = new User102("彭于晏");
		
		//2.创建输出流（序列化流）（JVM中的对象状态保存到硬盘中）
		String address = "C:\\\\Users\\\\lenovo1\\\\Workspaces\\\\MyEclipse CI\\\\Java_learning\\\\src\\\\com\\\\bjpowernode\\\\java_learning\\\\temp1.txt";
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(address));
		
		//3.写入
		oos.writeObject(u1);//写进去的不是几个文字，而是一个字符串对象
		
		//4.刷新
		oos.flush();
		//5.关闭
		oos.close();
		
		//接下来我们需要把序列化的对象给读出来，也就是反序列化
		//6.创建反序列化流
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(address));
		//7.反序列化
		Object o = ois.readObject();
		System.out.println(o);
		//关闭
		ois.close();
	}
}
class User102 implements Serializable{//该接口是一个可序列化的，该接口没有任何方法，该接口是一个
	//标志性的接口，像这样的接口还有java.util.Cloneable
	String name;
	User102(String name){
		this.name=name;
	}
	public String toString() {
		return "User[name="+name+"]";
	}
}
