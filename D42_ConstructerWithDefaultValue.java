package com.bjpowernode.java_learning;

public class D42_ConstructerWithDefaultValue {
	public static void main(String[] args) {
		Date2 d1 = new Date2(2019,10,19);
		Date2 d2 = new Date2();
		d1.outputDate();
		d2.outputDate();
	}
}
class Date2{
	int year;
	int month;
	int day;
	/**
	 * @param year
	 * @param month
	 * @param day
	 */
	public Date2(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	/**
	 * 需求：如果创建对象的时候不提供年月日的话，我们需要给这个对象一个默认值1970-01-01
	 */
	public Date2(){
		this(1970,1,1);
	}
	/**
	 * public Date2(){
	 * 		year = 1970;
	 * 		month = 1;
	 * 		day = 1;
	 * }
	 * 这样写运行是没有问题的，可以这样写，但是这样写代码是冗余的，因此不合适
	 * 我们还可以这样写
	 * public Date2(){
	 * 		new Date2(1970,1,1);
	 * }
	 * 这样等于我们又创建了一个对象，这样也是不好的，因此也不用这个方法 
	 */
	public void outputDate() {
		System.out.println("您想要的日期是：" + year + "年" + month + "月" + day + "日");
	}

	
}
