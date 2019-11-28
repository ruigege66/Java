package com.bjpowernode.java_learning;

public interface D54_2_InterfaceExercise {
	public static final String SUCCESS = "sucess";
	public static final double PI = 3.1415926;
	
	//public static final在接口中是可以省略的，因为由于语法规则知道，只能是常量
	byte MAX_VALUE = 127;
	
	public abstract void m54();//抽象方法
	
	void test54();//这也是抽象方法，这里的public abstract也是可以省略的。原因同上
}

interface B54 {
	void m2();
}
interface C54{
	void m3();
}
interface D54{
	void m4();
}
interface E53 extends B54,C54,D54{
	void m5();
}
//implements是实现的意思
//由于类是单继承的，所以这里使用新的关键字implements来实现
class MyClass implements B54,C54{
	public void m2() {}//由于m2原来是抽象方法，这里我们新的类必须覆盖重写m2方法
	public void m3() {}
}

class F54 implements E54{
	public void m2() {}
	public void m3() {}
	public void m4() {}
	public void m5() {}
}
