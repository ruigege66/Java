package com.bjpowernode.java_learning;

import java.text.DecimalFormat;

public class D80_1_DecimalFormat {
	public static void main(String[] args) {
		//1.创建数字格式化对象
		//需求：加入千分位
		DecimalFormat df = new DecimalFormat("####,###");
		//开始格式化
		//Number-->String
		System.out.println(df.format(1234567));
		
		//需求：加入千分位，保留两位小数
		DecimalFormat df1 = new DecimalFormat("###,###.##");
		System.out.println(df1.format(1234567.123));
		
		//需求：加入千分位，保留4位小数，并且不够补零
		DecimalFormat df2 = new DecimalFormat("###,###.00");
		System.out.println(df2.format(1234567.123));
		
		
	}

}
