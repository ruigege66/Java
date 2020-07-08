package com.bjpowernode.java_learning;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class D128_2_ClientTest {
	public static void main(String[] args) {
		DatagramSocket socket = null;
		DatagramPacket packet_send = null;
		DatagramPacket packet_receive = null;
		String server = "127.0.0.1";                               //服务器IP地址
		int port = 5151;                                           //服务器端口号
		String str = "Hello,I am Client A";
		byte[] data = str.getBytes();                               //将要发送的信息转换为字节数组
		try {
			socket = new DatagramSocket();                         //创建连接socket对象
			InetAddress addr = InetAddress.getByName(server);      //将服务器端的IP地址封装成InetAddress对象
			packet_send = new DatagramPacket(data,data.length,addr,port);//创建数据包对象
			socket.send(packet_send);                              //向服务器发送数据
			byte[] r = new byte[1024];                             //设置缓冲区
			packet_receive = new DatagramPacket(data,data.length,addr,port);//创建数据包对象
			socket.receive(packet_receive);                        //接收数据包
			byte[] response = packet_receive.getData();            //读取数据包中的数据信息
			int len = packet_receive.getLength();                  //读取数据长度
			String str1 = new String(response,0,len);              //将字节数据转换成字符串
			System.out.println("服务器响应的信息是："+str1);
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			socket.close();
		}
	}

}
