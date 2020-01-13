package com.bjpowernode.java_learning;

public class D72_1_StringClassAnlysis {
	public static void main(String[] args) {
		//创建一个“abc”字符串对象，该对象的内存地址，让s1变量保存。
		//s1是一个引用，s1指向“abc”对象
		String s ="abc";
		//可以让s1重新指向吗？s1是局部变量，s1前面是没有final，所以s1是可以重新指向的。
		//但是"def"字符串本身是不可以变的。
		String s1 = "雄安";
		String s2 = "雄安";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		//比较两个字符串的值，不能用双等号，要使用函数.equals,双等号比较的是内存地址
		//如果字符串是new出来的，那么内存地址就肯定不相等了，这个了例子也证明了
		//直接使用字符串的话，那么就是存储在了方法区的字符串常量池
		String s3 = new String("雄安");
		String s4 = new String("雄安");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		
		//题解：以下程序创建了三个对象，两个在堆内存，一个在方法区内存
		String s5 = new String("abc");
		String s6 = new String("abc");
		
		String[] ins = {"sport","music","food","sleep"};
		//要求将上面的兴趣爱好拼接成一个字符串
		String temp = null;
		for(int i=0;i<ins.length;i++) {
			if(i==ins.length-1) {
				temp += ins[i];
			}else {
				temp += ins[i]+",";
			}
		}
		System.out.println(temp);
		//不推荐这样做因为做了大量拼接，方法区创建了很多字符串
		
	}
}
