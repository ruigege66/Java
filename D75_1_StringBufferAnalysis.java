package com.bjpowernode.java_learning;

public class D75_1_StringBufferAnalysis {
	public static void main(String [] args) {
		//创建字符串缓冲区对象
		StringBuffer s1 = new StringBuffer();//16//这个类的参数里面可以传入整数，代表初始化多大的空间，如果不写，默认就是16
		//可以向StringBuffer中追加字符串
		String[] ins = {"Physical","music","sleep","gourmet"};
		//推荐字符串频繁拼接使用StringBuffer和StringBuilder,不要使用String
		for(int i =0;i<ins.length;i++) {
			if(i==ins.length-1) {
				s1.append(ins[i]);
			}else {
				s1.append(ins[i]);
				s1.append(",");
			}
		}
		System.out.println(s1);
	}
}
