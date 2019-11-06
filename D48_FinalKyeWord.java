package com.bjpowernode.java_learning;

public class D48_FinalKyeWord {
	public static void main(String[] args) {
//		Exercise_48_1 e1 = new Exercise_48_1();
		final int i = 89;
		//i = 8;//不能重新赋值了
	}

}
//final class Exercise_48{
//	final int i = 23;
//}
//class Exercise_48_1 extends Exercise_48{
//	int i = 89;
//}


final int i ;//编译错误，因为没赋值。

//或者使用构造方法给它赋值
public class test1{
  final int i ;
  public test1{
    self.i = 100;
   }
  final User u1 = new User("jfoae");
  u1 = new User("iefr");//这样会编译报错，因为引用u1是final修饰的，里面的存的对象地址不能再重新赋值。
  u1.id = 89;//编译成功，final修饰的引用虽然指向了某个对象之后，但是所指向的对象内部的内存是可以修改的。
