package com.bjpowernode.java_learning;

import java.util.Scanner;

public class D87_1_HotelManageSystem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Hotel87 h = new Hotel87();
		h.print();
		while (true) {
			System.out.println("请输入您要预定的房间");
			String number = s.next();
			h.order(number);
			h.print();
		}
	}
}
class Room87{
	private String no;
	private String type;//标准间、双人间、豪华间
	private boolean isUse;//false表示空间，true表示占用
	/**
	 * @param no
	 * @param type
	 * @param isUse
	 */
	Room87(String no, String type, boolean isUse) {
		super();
		this.no = no;
		this.type = type;
		this.isUse = isUse;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isUse() {
		return isUse;
	}
	public void setUse(boolean isUse) {
		this.isUse = isUse;
	}
	public String toString() {
		return "{" + no +"," +(isUse?"占用":"空间") + "}";
	}
}
class Hotel87 {
	//房间
	Room87[][] rooms;
	//Constructer
	Hotel87(){
		//五层 每层十间
		rooms = new Room87[5][10];
		//赋值
		//1,2标准间
		//3，4双人间
		//5 豪华间
		for(int i=0;i<rooms.length;i++) {
			for(int j=0;j<rooms[i].length;j++) {
				if (i==0 || i==1) {
					rooms[i][j] = new Room87((i+1)*100+j+"","标准间",false);
				}
				if (i==2 || i==3) {
					rooms[i][j] = new Room87((i+1)*100+j+"","双人间",false);
				}
				if (i==4) {
					rooms[i][j] = new Room87((i+1)*100+j+"","豪华间",false);
				}

			}
		}
	}
	//对外提供一个打印酒店房间列表的方法
	public void print() {
		for(int i=0;i<rooms.length;i++) {
			for(int j=0;j<rooms[i].length;j++) {
				System.out.print(rooms[i][j] + " ");;
			}
			System.out.println();
		}
	}
	public void order(String no) {
		for(int i=0;i<rooms.length;i++) {
			for(int j=0;j<rooms[i].length;j++) {
				if(rooms[i][j].getNo().equals(no)) {
					//将该房间改为占用
					rooms[i][j].setUse(true);
					return;
				}
			}
		}
	}
}
