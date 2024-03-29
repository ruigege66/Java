package com.bjpowernode.java_learning;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class D79_1_CalendarAnalysis {
	public static void main(String[] args) throws ParseException {
		//1000是自1970-1-1 00：00：00 000的毫秒数
		Date d = new Date(1000);
		//Date -> String
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy,MM,dd,HH:mm:ss SSS");
		System.out.println(sdf.format(d));//因为在东+8区，所以是早上八点零分1秒
		
		//获取当前系统时间的前10分钟时间
		Date t2 = new Date(System.currentTimeMillis()-1000*60*10);
		System.out.println(sdf.format(t2));
		
		//日历
		Calendar c1 = Calendar.getInstance();
		//查看当前日历的“星期几”
		int i = c1.get(Calendar.DAY_OF_WEEK);
		System.out.println(i);//注意今天周二，本来应该返回值是2的，但是这里返回3了，这是因为国外是把周日看作是一周开始的第一天
		System.out.println(c1.get(Calendar.DAY_OF_MONTH));//获取今天的日期
		
		//获取2008 08 08 是星期几
		String strTime2 = "2008//08//08";
		SimpleDateFormat s1 = new SimpleDateFormat("yyyy//MM//dd");
		Date d3 = s1.parse(strTime2);
		c1.setTime(d3);
		//获取星期几
		System.out.println(c1.get(Calendar.DAY_OF_WEEK));//

	}

}
