package com.bjpowernode.java_learning;
import java.io.*;
public class D97_1_FileOutputStream {
	public static void main(String[] args){
		//1.创建文件输出字符流
		FileOutputStream f1 = null;
		try {
			
			f1 = new FileOutputStream("C:\\Users\\lenovo1\\Workspaces\\MyEclipse CI\\Java_learning\\src\\com\\bjpowernode\\java_learning\\temp1.txt");
			
			//参数中的文件如果不存在的话，就会自动创建
			//2.开始写
			//推荐最后的时候为了保证数据完全写入硬盘，所以要刷新
			String msg = "HelloWorld";
			f1.flush();//强制写入
			//将String转换成byte数组
			byte[] bytes = msg.getBytes();
			f1.write(bytes);
			//如果带参数，即write(Object o,int a,int b)代表对象o的第a个字符到第b个字符写入文件
			
		}catch(Exception e1) {
			e1.printStackTrace();
		}finally{
			//关闭
			if(f1 != null) {
				try {
					f1.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}
