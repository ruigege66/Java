package com.bjpowernode.java_learning;
/*
 * 三、手动抛出异常1.自定义无效名字异常：
 * （1）编译时异常，直接继承Exception
 * （2）运行时异常，直接继承RuntimeException
 */

public class D65_1_ManualThrowException {
	public static void main(String[] args) {
		try {
			Customer65 c1 = new Customer65();
			c1.register("ng");
		}catch(IllegalNameException i1) {
			System.out.println(i1.getMessage());
		}
	}
}
class IllegalNameException extends Exception{
	//编译时异常
	public IllegalNameException() {}
	public IllegalNameException(String msg) {
		super(msg);
	}
}
class Customer65{
	String username = "Jack";
	public void register(String username) throws IllegalNameException{
		if(username.length()<3) {
			//创建异常对象
			IllegalNameException i1 = new IllegalNameException("用户名长度不能少于3位");
			//手动抛出异常
			throw i1;
			
		}else {
			this.username = username;
		}
	}
	
}
