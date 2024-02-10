package com.java.test.book.programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaCollections {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		list.add(3);

		Iterator<Integer> it = list.iterator();

		while (it.hasNext()) {

			System.out.println(it.next());
		}

		Map<Integer, Integer> map = new HashMap<>();

		map.put(1, 10);
		map.put(2, 20);
		map.put(3, 30);
		map.put(4, 40);

		Set s = map.entrySet();

		Iterator it3 = s.iterator();

		while (it3.hasNext()) {
			System.out.println(it3.next());
		}
		
	for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getKey()+"-"+m.getValue());
	}
		
	
		

	}

}
