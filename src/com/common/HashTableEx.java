package com.common;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableEx {

	public static void main(String[] args) {
		
		Map<Integer,String> hashtable= new Hashtable<>();
		
		hashtable.put(1, "Java");
		hashtable.put(2, "Python");
		hashtable.put(3, ".Net");
		hashtable.put(4, "Sql");
		hashtable.put(5, "Mysql");
		hashtable.put(6, "Spring");
		
		System.out.println(hashtable);
	
		
		
	}
}
