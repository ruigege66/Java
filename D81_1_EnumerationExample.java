package com.bjpowernode.java_learning;

public class D81_1_EnumerationExample { 
	public static void main(String[] args) {
		/**
		 * 需求：定义一个方法，该方法的作用是计算两个int类型数据的商
		 * 如果计算成功则该方法返回1，如果执行失败则该方法返回0
		 * 
		 * 程序执行成功，但是该程序存在风险，分析：存在什么风险？
		 * 
		 * 程序中的问题在编译阶段解决的，绝对不会放在运行期解决。所以以下程序可以引入枚举类型
		 */
		int a = 10;
		int b = 0;
		Result retValue = divide(a,b);
		if(retValue==Result.SUCCESS) {
			System.out.println("成功");
		}else if (retValue==Result.FALL) {
			System.out.println("失败");
		}
	}
	public static Result divide(int a,int b) {
		try {
			int c = a/b;
		}catch(Exception e) {
//			return 0;
			return Result.FALL;
		}
//		return 1;
		return Result.SUCCESS;
	}
}


//定义一个枚举类型
enum Result{
	//成功和失败
	//规范要求：大写
	SUCCESS,FALL //有限的
	
}
//四季
enum Season{
	SPRING,SUMMER,AUTUMN,WINTER
}
