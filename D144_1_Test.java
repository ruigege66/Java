package com.bjpowernode.java_learning;

import java.lang.annotation.Retention;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)//元注解，运行时保留注解，必须有，否则注解值读不出来
@interface ApplianceMaker     //定义注解
{
	//定义注解元素，都有默认值
	public String type() default "电视机";
	public String id() default "001";
	public String maker() default "TCL有限公司";
	public String address() default "广东省惠州市";
}

@Retention(RetentionPolicy.RUNTIME)
@interface ApplianceSaler {
	public String name() default "京东";
	public String id() default "001";
	public String address() default "北京";

}

@Retention(RetentionPolicy.RUNTIME)
@interface AppliancePrice{
	//注解元素只有一个，名为value
	public int value() default 1200;
}

class Appliance{
	//为域maker加注解，给部分元素赋值，其余使用默认值
	//如果注解元素都用默认值，则直接写@ApplianceMaker
	@ApplianceMaker(type="电脑",id="201")
	public String maker;
	
	@ApplianceSaler(name="苏宁",id="222",address="南京")
	public String saler;      //域有注解
	
	@AppliancePrice(999)     //也可以写成"value=999",因为只有一个，此处只写出值即可
	public int price;        //域有注解
	
	public void setMaker(String m) {
		maker = m;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public void setSaler(String saler) {
		this.saler = saler;
	}
	
	public String getSaler() {
		return saler;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}


public class D144_1_Test {
	public static void main(String[] args) {
		System.out.println(readAnnotation(Appliance.class));
	}
	
	//读取注解信息
	private static String readAnnotation(Class aClass) {
		String maker="制造商：";
		String saler="销售商：";
		String price="价格：";
		
		Field fields[] = aClass.getDeclaredFields();   //获取Appliance类的所有字段
		
		for(Field aField:fields) {
			//对每一个字段判断其注解类型
			if(aField.isAnnotationPresent(ApplianceMaker.class)) {
				ApplianceMaker aMaker;         //声明一个注释变量
				//调用getAnnotation()方法获得在aField域上的注解“实例”
				aMaker = (ApplianceMaker)aField.getAnnotation(ApplianceMaker.class);
				maker+=aMaker.type() + " ";  //获取type元素的值
				maker+=aMaker.id() + " ";
				maker+=aMaker.maker() + " ";
				maker+=aMaker.address() + "\n";
			}else if(aField.isAnnotationPresent(ApplianceSaler.class)) {
				//字段的注解是ApplianceSaler类型
				ApplianceSaler aSaler;
				aSaler=(ApplianceSaler)aField.getAnnotation(ApplianceSaler.class);
				saler+=aSaler.name()+" ";
				saler+=aSaler.id() +" ";
				saler+=aSaler.address() + "\n";
			}else if(aField.isAnnotationPresent(AppliancePrice.class)) {
				AppliancePrice thePrice;
				thePrice = (AppliancePrice)aField.getAnnotation(AppliancePrice.class);
				price+=thePrice.value();
			}
			     
		}
		return maker+saler+price;
	}
}
