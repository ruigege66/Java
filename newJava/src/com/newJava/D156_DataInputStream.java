package com.newJava;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class D156_DataInputStream {
	public static void main(String[] args) throws FileNotFoundException, Exception {
		String address = "E:\\d05_gitcode\\Java\\newJava\\src\\com\\newJava\\newFile.txt";
		DataInputStream dis = new DataInputStream(new FileInputStream(address));
		byte b = dis.readByte();
		short s = dis.readShort();
		int i = dis.readInt();
		long l = dis.readLong();
		float f = dis.readFloat();
		double d = dis.readDouble();
		
		char c = dis.readChar();
		boolean bo = dis.readBoolean();
	}

}
