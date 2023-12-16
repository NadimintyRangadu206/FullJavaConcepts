package com.java.collections;

import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

enum Days {

	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

public class EnumExample2 {

	public static void main(String[] args) {

		EnumMap<Days, Integer> mp = new EnumMap<>(Days.class);
		mp.put(Days.SUNDAY, 1);
		mp.put(Days.MONDAY, 2);
		mp.put(Days.TUESDAY, 3);
		mp.put(Days.WEDNESDAY, 4);
		mp.put(Days.THURSDAY, 5);
		mp.put(Days.FRIDAY, 6);
		mp.put(Days.SATURDAY, 7);

		Set s = mp.entrySet();

		Iterator it = s.iterator();

		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		
		System.out.println("bdhstajklsl;"+"\n");
		for(Map.Entry entry:mp.entrySet()) {
			System.out.println(entry.getKey()+"-"+entry.getValue());
		}

	}

}
