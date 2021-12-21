package com.newJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class D154_InputOutputStream {
	public static void main(String[] args) {
		InputStream is = null;
		String address = "E:\\d05_gitcode\\Java\\newJava\\src\\com\\newJava\\newFile.txt";
		int b;
		try {
			is = new FileInputStream(address);
			while ((b = is.read()) != -1) {  // 可以看出是一个字节一个字节读取的
				System.out.println((char)b);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
			
	}

}
