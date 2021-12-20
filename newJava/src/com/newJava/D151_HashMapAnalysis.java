package com.newJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class D151_HashMapAnalysis {
	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		List list1 = new ArrayList();
		Set set1 = new HashSet();
		
		
		

	}
    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

}
