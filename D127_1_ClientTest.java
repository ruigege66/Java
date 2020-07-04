package com.bjpowernode.java_learning;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class D127_1_ClientTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = null;
		Socket socket = null;
		DataInputStream in = null;
		DataOutputStream out = null;
		String serverIP = "127.0.0.1";                           //服务器端IP
		int port = 5050;
		
		try {
			socket = new Socket(serverIP,port);                  //连接服务器
			in = new DataInputStream(socket.getInputStream());   //创建输入流
			out = new DataOutputStream(socket.getOutputStream());//创建输出流
			System.out.println("请输入一个待计算的四则运算表达式");
			
			while(scanner.hasNext()) {
				input = scanner.nextLine();                       //从键盘输入一个待计算的四则运算表达式
				if(!input.contentEquals("0")) {
					out.writeUTF(input);                          //向服务器发送运算请求
					String result = in.readUTF();                 //等待读取运算结果
					System.out.println("服务器返回的计算结果："+result);
					System.out.println("请输入一个正整数的四则运算表达式（输入0退出）：");
					
				}else {
					break;                                        //请求结果
				}
			}
		}catch(Exception e) {
			System.out.println("与服务器连接中断");
		}finally {
			try {
				in.close();                                       //关闭网络连接
				out.close();
				socket.close();
				System.out.println("连接结束");
			}catch(Exception e) {
				
			}
		}
	}
}
