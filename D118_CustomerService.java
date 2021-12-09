package com.bjpowernode.java_learning;

public class D118_CustomerService {
	public boolean login(String name,String  pwd) {
		if("admin".contentEquals(name) && "123".contentEquals(pwd)) {
			return true;
		}
		return false;
	}
	public void logout() {
		System.out.println("系统已经安全退出");
	}

}
