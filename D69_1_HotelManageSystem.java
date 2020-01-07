package com.bjpowernode.java_learning;

public class D69_1_HotelManageSystem {
	//编写一个程序模拟酒店的管理系统：预定房间、退房.......
	public static void main(String[] args) {
		
	}
}
class Room{
	String no;
	String type;//“标准间”“双人间”“豪华间”
	boolean isUse;//true表示占用，false表示空闲
}
class Hotel{
	//规定酒店：五层，每层十个房间，1，2层标准间，3，4双人间，5层豪华间
	Room[][] rooms;
	//无参数
	Hotel(){
		this(5,10);
	}
	Hotel(int rows,int cols){
		rooms = new Room[rows][cols];
		/*
		 * rooms[0][0]....
		 * rooms[4][9]....
		 */
		
	}
	//对外提供预定方法
}
