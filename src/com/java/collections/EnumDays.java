package com.java.collections;

import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum EnumDaysExample {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THRUSDAY, SATURDAY

}

public class EnumDays {

	public static void main(String[] args) {

		Set<EnumDaysExample> set = EnumSet.of(EnumDaysExample.SUNDAY, EnumDaysExample.MONDAY);

		Iterator<EnumDaysExample> it = set.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
