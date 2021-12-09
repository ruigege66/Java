package com.bjpowernode.java_learning;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class D88_1_HashSetExample {
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(1);
		s.add(1);
		
		s.add(100);
		Iterator i = s.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}	
	}
}
