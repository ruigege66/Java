package com.newJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class D157_tryWithResource {
	public static void main(String[] args) {
		String address = "E:\\d05_gitcode\\Java\\newJava\\src\\com\\newJava\\newFile.txt";
		try (InputStream is = new FileInputStream(address);) {
			int i = -1;	
			while ((i = is.read()) != -1) {
				System.out.println(i);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
