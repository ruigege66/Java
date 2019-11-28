package com.bjpowernode.java_learning;

public class D54_4_ImplementCustomer{
	public static void main(String[] args) {
		//以下程序面向接口去调用
		D54_3_CustomerService d1 = new D54_4_ImplementCustomerService();//多态
		d1.logout();//底层类，类型是接口，可以的是使用的接口中的方法，实际调用由于底层是类，所以实际用的类的方法
	}
}
class D54_4_ImplementCustomerService implements D54_3_CustomerService{
	//对接口中的抽象方法进行实现
	public void logout() {
		System.out.println("成功退出系统！");
	}
}
