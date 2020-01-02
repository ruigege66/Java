package com.bjpowernode.java_learning;

public class D67_3_ArgsAnlysis {
	public static void main(String[] args) {
		System.out.println("String类型的数组中的元素个数为：" + args.length);
		//遍历
		for(int i=0; i<args.length;i++) {
			System.out.println(args[i]);
		}
		//需求说明：运行该软件的时候必须提供用户名和密码。
		//格式：java D67_3_ArgsAnlysis usrname password
		//如果用户没有提供足够的参数，则退出系统
		if (args.length != 2) {
			System.out.println("要想使用这个系统，就必须这样输入java D67_3_ArgsAnlysis usrname password");
			return ;
		}
		//参数正确，如果用户名为admin,密码是123则登陆成功
		String username = args[0];
		String passsword = args[1];
		if ("admin".equals(username) && "123".equals(password)) {
		//这里如果写成username.equals("admin"),就容易造成空指针异常
			System.out.println("登录成功，欢迎admin");
		}else {
			System.out.println("登录失败，请重新确认");
		}
	}

}
