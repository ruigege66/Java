package com.bjpowernode.java_learning;

import com.bjpowernode.java_learning.*;
//使用导入包的方式，可以导入其他的包，这里的类可以直接使用。
import java.util.*;
public class D50_VisitControlAuthoritySymbol {
	public static void main(String[] args) {
		Math49 m1 = new Math49();
		com.bjpowernode.java_learning.Math49 m2 = new com.bjpowernode.java_learning.Math49();
		//上面这两种方式都编译通过了，当然了，第二个才是正规的，但是第一个由于类也在这个包里
		//所以编译也是可以通过的，如果是跨包就会报错
		User50 u1 = new User50();
		System.out.println(u1.i);
		System.out.println(u1.j);
		
	}
}
class User50{
	//受保护的
	protected int i = 10;
	//缺省的
	int j = 20;
	//
	
}
