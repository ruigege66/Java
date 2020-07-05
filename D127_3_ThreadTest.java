package com.bjpowernode.java_learning;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class D127_3_ThreadTest extends Thread {
	Socket socket = null;
	DataInputStream in = null;
	DataOutputStream out = null;
	String str;
	String response;
	String ip;
	int port;
	
	public D127_3_ThreadTest(Socket socket) {
		this.socket = socket;
		start();
	}
	
	public void run() {
		try {
			in = new DataInputStream(socket.getInputStream());          //创建输入流
			out = new DataOutputStream(socket.getOutputStream());       //创建输出流
			ip = socket.getInetAddress().getHostAddress();              //客户端IP地址
			port = socket.getPort();                                    //客户端的端口号
			
			while(true) {
				str = in.readUTF();                                     //获取客户端的表达式
				System.out.println("客户端" + ip + ":" + port + "发送的请求内容：");
				System.out.println(str+"=?");
				
				if(str.contentEquals("0")) {
					System.out.println("连接结束");
					break;
				}else {
					response = doComputer(str);                         //对表达式进行计算
					out.writeUTF(response);                             //响应计算结果
				}			
			}		
		}catch(Exception e) {
			System.out.println("连接结束");
		}finally {
			try {
				in.close();
				out.close();
				socket.close();
			}catch(Exception e) {
				
			}
		}
	}
	public String doComputer(String str) {
		String input;
		String[] sym;
		String[] data;
		int a=0,b=0,result=0;
		input = str;
		data = input.split("\\D+");
		sym = input.split("\\d+");
		a = Integer.parseInt(data[0]);
		b = Integer.parseInt(data[1]);
		
		try {
			switch(sym[1]) {
			case "+":
				result = a + b;
				break;
			case "-":
				result = a - b;
				break;
			case "*":
				result = a * b;
				break;
			case "/":
				result = a / b;
			}
			System.out.println("计算结果："+input+"="+result);
			return String.valueOf(result);
		}catch(java.lang.ArithmeticException e) {
			System.out.println("数据错误！");
			return "数据错误";
		}
	}

}




