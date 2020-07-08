package com.bjpowernode.java_learning;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class D128_1_ServerTest {
	public static void main(String[] args) {
		DatagramSocket socket = null;
		DatagramPacket packet_send = null;
		DatagramPacket packet_receive = null;
		int port = 5151;                                 //服务器监听端口号
		try {
			socket = new DatagramSocket(port);           //创建连接对象
			System.out.println("服务器启动");        
			byte[] r = new byte[1024];                   //创建缓存数组
			packet_receive = new DatagramPacket(r,r.length);//创建数据包对象
			socket.receive(packet_receive);              //接收数据包
			InetAddress client_ip = packet_receive.getAddress();//客户端地址
			int client_port = packet_receive.getPort();          //客户端的端口号
			byte[] data = packet_receive.getData();      //客户端字节数据
			int len = packet_receive.getLength();        //数据有效长度
			String str1 = new String(data,0,len);        //将字节数据转换为字符串
			System.out.println("客户机"+client_ip+":"+client_port+"\n发送的信息是："+str1);
			String response = "Hello,I am Server B";
			byte[] s = response.getBytes();
			packet_send = new DatagramPacket(s,s.length,client_ip,client_port);//创建响应数据包对象
			socket.send(packet_send);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			socket.close();
		}
	}

}
