package com.bjpowernode.java_learning;

public class D108_Anotation {
	public static void main(String[] args){
		int c = add(5,4);
		System.out.println(c);
		
		@SuppressWarnings(value= {"deprecation"})
		//引用过时的类
		DeprecatedTest test = new DeprecatedTest();
		System.out.println(test);		
	}
	@Deprecated
	/**
	 * 这个函数已经不推荐使用，当然为什么不推荐，这个胡说的，就是为了做一个例子而已
	 * @param a
	 * @param b
	 * @return int
	 */
	public static int add(int a,int b) {
		return a+b;
	}

}
class DeprecatedTest{
	public String toString() {
		return"测试用的";
	}
}
