package com.newJava;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.charset.StandardCharsets;

public class D154_InputOutputStream {
	public static void main(String[] args) throws IOException {
		InputStream is = null;
		String address = "E:\\d05_gitcode\\Java\\newJava\\src\\com\\newJava\\newFile.txt";
//		int b;
//		try {
//			is = new FileInputStream(address);
//			while ((b = is.read()) != -1) {  // 可以看出是一个字节一个字节读取的
//				System.out.println((char)b);
//			}
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				is.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		FileOutputStream fis = null;
//		try {
//			fis = new FileOutputStream(address);
//			fis.write("有点优秀".getBytes()); // getBytes()获取这个字符串的byte数组，下面的toCharArray()获取字符数组
//			fis.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		FileReader fr = null;
//		try {
//			fr = new FileReader(address);
//			while((b = fr.read()) != -1) {
//				System.out.println((char)b);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		FileWriter fw = null;
//		char[] arargs = "太牛逼了".toCharArray();
//		try {
//			fw = new FileWriter(address);
//			fw.write(arargs, 0, arargs.length);
//			fw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			byte[] arr = "厉害了".getBytes(StandardCharsets.UTF_8);
//			for (byte i = 0;i<arr.length;i++) {
//				System.out.println(arr[i]);
//			}
//			InputStream is2 = new BufferedInputStream(new ByteArrayInputStream(arr));
//			byte[] flush = new byte[1024];
//			int len = 0;
//			while((len = is2.read(flush)) != -1) {
//				System.out.println(new String(flush, 0, len));
//			}
//		} catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			ByteArrayOutputStream baos = new ByteArrayOutputStream();
//			byte[] info = "厉害了".getBytes();
//			baos.write(info, 0, info.length);
//			byte[] dest = baos.toByteArray();
//			baos.close();
// 		} catch(Exception e) {
//			e.printStackTrace();
//		}
		
		final PipedOutputStream pps = new PipedOutputStream();
		final PipedInputStream pis = new PipedInputStream(pps);
		new Thread(new Runnable() {
			public void run() {
				try {
					pps.write("厉害了".getBytes(StandardCharsets.UTF_8));
					pps.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}).start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					int b3 = 0;
					byte[] flush = new byte[1024];
					while ((b3=pis.read(flush)) != -1) {
						System.out.println(new String(flush, 0, flush.length));
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}).start();
	}
}
