package com.offset.time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ValueRange;

public class OffsetMethods {

	public static void main(String[] args) {
		
		OffsetDateTime odt= OffsetDateTime.now();
		System.out.println(odt);
		
		int m=odt.getDayOfMonth();
		System.out.println(m);
		
		Month md= odt.getMonth();
		System.out.println(md);
		
		DayOfWeek dw=odt.getDayOfWeek();
		System.out.println(dw);
		
		int year=odt.getYear();
		System.out.println(year);
		
		
		int monV=odt.getMonthValue();
		System.out.println(monV);
		
		int h=odt.getHour();
		System.out.println(h);
		
		int mi=odt.getMinute();
		System.out.println(mi);
		
		int see=odt.getSecond();
		System.out.println(see);
		
		ValueRange t=odt.range(ChronoField.DAY_OF_MONTH);
		System.out.println(t);
		
		
		ValueRange r=odt.range(ChronoField.MONTH_OF_YEAR);
		System.out.println(r);
		
		
		LocalDateTime ts=odt.toLocalDateTime();
		System.out.println(ts);
		
		

	}

}
