package com.newJava;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;

public class D156_DataInputStream {
	public static void main(String[] args) throws FileNotFoundException, Exception {
		String address = "E:\\d05_gitcode\\Java\\newJava\\src\\com\\newJava\\newFile.txt";
		DataInputStream dis = new DataInputStream(new FileInputStream(address));
		byte b = dis.readByte();
		System.out.println(b);
		short s = dis.readShort();
		System.out.println(s);
		int i = dis.readInt();
		System.out.println(i);
		long l = dis.readLong();
		System.out.println(l);
		float f = dis.readFloat();
		System.out.println(f);
		double d = dis.readDouble();
		System.out.println(d);
		char c = dis.readChar();
		System.out.println(c);
		boolean bo = dis.readBoolean();
		System.out.println(bo);
		
		DataOutputStream dos = new DataOutputStream(new FileOutputStream(address));
		dos.writeByte(1);
		dos.writeShort(2);
		dos.writeInt(3);
		dos.writeLong(4L);
		dos.writeFloat(5.0f);
		dos.writeDouble(6.0d);
		dos.writeChar(7);
		dos.writeBoolean(false);
		
		System.out.println("==============");
		
		StringWriter sw = new StringWriter();
		try (PrintWriter pw = new PrintWriter(sw)) {
			pw.println("lisudfos");
		}
		System.out.println("lisudfos");
		
		try (ObjectInputStream os = new ObjectInputStream(new FileInputStream(new File(address)))) {
			os.readUTF();
		}

		
		
	}

}
