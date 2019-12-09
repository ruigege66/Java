package com.bjpowernode.java_learning;

public class D59_2_AnonymousInnerClass {
	public static void main(String[] args) {
//		test(new CustomerService59)//这种调用方法是不对的，因为接口是不能创建对象的
		CustomerServiceImp1 c1 = new CustomerServiceImp1();
		test(c1);
		
		//接下来使用匿名内部类来进行创建，这是只需要保留接口就行，下面的接口实现的类可有可无了
		test(new CustomerService59() {
			public void logout(){
				System.out.println("再一次退出了");
			}
		});
		
	}
	//静态方法
	public static void test(CustomerService59 cs) {
		cs.logout();
	}
	
}
interface CustomerService59{
	void logout();
	
}
class CustomerServiceImp1 implements CustomerService59{
	public void logout(){
		System.out.println("系统已经退出了");
	}
}
