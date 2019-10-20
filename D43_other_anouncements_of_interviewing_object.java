package com.bjpowernode.java_learning;

public class D43_other_anouncements_of_interviewing_object {
	public static void main(String[] args) {
		Test3.test3();
		Test3 t1 = new Test3();
		t1.test3();
		
		t1 = null;
		t1.test3();
	}

}
class Test3{
	String name;
	public Test3() {
		
	}
	public static void test3(){
		System.out.println("我可以执行");
	}
}
