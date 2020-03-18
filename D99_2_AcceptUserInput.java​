package com.bjpowernode.java_learning;

import java.io.*;
import java.util.*;

public class D99_2_AcceptUserInput {
	public static void main(String[] args) throws Exception{
		//以前的方式
		Scanner s = new Scanner(System.in);
		//程序执行到这里停下来，等待用户输入
		String str = s.next();
		System.out.println(str);
		//next()是以空格为界限
		//接下来使用BufferedReader来接受用户的输入
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//接受输入（每次接受一行
		String str2 = br.readLine();
		System.out.println(str2);
		
		br.close();
		
	}
}
