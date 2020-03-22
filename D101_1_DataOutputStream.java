package com.bjpowernode.java_learning;
import java.io.*;

public class D101_1_DataOutputStream {
	public static void main(String[] args) throws IOException{
		//创建数据字节输出流
		String address = "C:\\\\Users\\\\lenovo1\\\\Workspaces\\\\MyEclipse CI\\\\Java_learning\\\\src\\\\com\\\\bjpowernode\\\\java_learning\\\\temp1.txt";
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(address));
		//准备数据
		byte b = 10;
		short s = 11;
		int i = 12;
		long l = 13;
		float f = 3.2f;
		double d = 2.3;
		boolean flag = false;
		char c = 'a';
		//写入
		dos.writeByte(b);
		dos.writeShort(s);
		dos.writeInt(i);
		dos.writeLong(l);
		dos.writeFloat(f);
		dos.writeDouble(d);
		dos.writeBoolean(flag);
		dos.writeChar(c);
		//刷新
		dos.flush();
		//写进去的内容是二进制文件，我们使用文本打开都是一堆乱码
		
		//关闭
		dos.close();
		
		//创建输入流
		DataInputStream dis = new DataInputStream(new FileInputStream(address));
		//读
		//注意：要使用该流读取数据，必须提前知道该文件中的数据存储格式，顺序。
		byte b1 = dis.readByte();
		short s1 = dis.readShort();
		int i1 = dis.readInt();
		long l1 = dis.readLong();
		float f1 = dis.readFloat();
		double d1 = dis.readDouble();
		boolean flag1 = dis.readBoolean();
		char c1 = dis.readChar();
		
		
		System.out.println(b1);
		System.out.println(s1);
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(f1);
		System.out.println(d1);
		System.out.println(flag1);
		System.out.println(c1);
		//用途：有点像加密文件，多见于电信行业，我们传输数据，然后告知对方我们的格式以及数据顺序，对方才可以解析出来
		//关闭
		dis.close();
		
		
	}

}
