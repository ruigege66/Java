package com.bjpowernode.java_learning;
import java.net.InetAddress;

public class D124_InetAddressMethod {

	public static void main(String[] args) throws Exception{
		InetAddress localAddress = InetAddress.getLocalHost();
		InetAddress remoteAddress = InetAddress.getByName("www.baidu.com");
		System.out.println("本机的IP地址："+localAddress.getHostAddress());
		System.out.println("baidu的IP地址："+remoteAddress.getHostAddress());
		System.out.println("3s是否可以达到："+remoteAddress.isReachable(3000));
		System.out.println("baidu的主机名为："+remoteAddress.getHostName());
	}
}
