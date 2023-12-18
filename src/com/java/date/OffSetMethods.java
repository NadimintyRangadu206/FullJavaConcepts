package com.java.date;

import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class OffSetMethods {

	public static void main(String[] args) {
		
		OffsetTime odt= OffsetTime.now();
		System.out.println(odt);
		int hour=odt.getHour();
		System.out.println(hour);
            
		int i=odt.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println(i);
		
	}
}
