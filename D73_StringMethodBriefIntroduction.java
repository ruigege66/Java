package com.bjpowernode.java_learning;

public class D73_StringMethodBriefIntroduction {
	public static void main(String[] args) {
		//1.char charAt(int index)代笔取出字符串的第index的字符
		char c1 = "abcdef".charAt(2);
		System.out.println(c1);
		System.out.println("1==========");
		
		//2.boolean endsWith(String endstr)返回这个字符串是否以括号里的参数结尾的
		System.out.println("HelloWorld".endsWith("ld"));
		System.out.println("HelloWorld".endsWith(".java"));
		System.out.println("HelloWorld".endsWith("pjava"));
		System.out.println("2==========");
		
		//3.boolean equlasIgnoreCase(String anontherString)忽略大小写之后，返回是否和参数一样
		System.out.println("abc".equalsIgnoreCase("ABC"));
		System.out.println("3==========");
		
		//4.byte[] getBytes();返回参数的byte数组形式
		byte[] bytes = "abc".getBytes();
		for(int i=0;i<bytes.length;i++) {
			System.out.println(bytes[i]);
		}
		System.out.println("4==========");
		
		//5.indexOf(String str)返回指定子字符串在此字符串中第一次出现的索引
		System.out.println("I am a hero".indexOf("a"));
		System.out.println("5==========");
		
		//6.indexof(String str,int fromIndex);从fromIndex往后面数第一次出现
		System.out.println("javalanguageiseasytolearn".indexOf("a",2));
		System.out.println("6==========");
		
		//7.lastIndexOf(String str)倒数字符串从最后一个开始往前数，第一次出现；要是参数后面再带一个，就是从倒数这个数字开始
		System.out.println("javalanguageiseasytolearn".lastIndexOf("r"));
		System.out.println("7==========");
		
		//8.lendgth字符的长度，有一点注意，在数组中就是属性，再字符串中就是方法
		System.out.println("jdsofa".length());
		int[] i1 = {2,5,87,4,9};
		System.out.println(i1.length);
		System.out.println("8==========");
		
		//9.String replaceAll(String s1,String s2)把字符串中的s1片段改成s2片段
		String s2 = "abck".replaceAll("b","jdios");
		System.out.println(s2);
		System.out.println("9==========");
		
		//10.String[] split(string s);把字符串以s进行分割
		String[] s3 = "a,gi,gi,gohji".split(",");
		for(int j=0;j<s3.length;j++) {
			System.out.println(s3[j]);
		}
		System.out.println("10==========");
		
		//11.boolean startWith(String s);//返回字符串是否以s为开头
		System.out.println("/system/login".startsWith("/"));
		System.out.println("11==========");
		
		//12.String substring(int begin);//从第begin下标开始往后截取字符串;加一个参数int end,就是指从begin开始到end结束,且end不包括
		System.out.println("abddkfja".substring(5));
		System.out.println("abddkfja".substring(5,6));
		System.out.println("12==========");
		
		//13.char[] toCharArrays();
		char[] c4 = "IloveChina".toCharArray();
		for(int j=0;j<c4.length;j++) {
			System.out.println(c4[j]);
		}
		System.out.println("13==========");
	}
}
