package com.java.dateTime;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateTimeClass_FormatMethod {

	public static void main(String[] args) {
		
		LocalDateTime dt= LocalDateTime.now();
		
		String format="dd-yyyy-mm hh:mm:ss";
		
		DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern(format);
		
		String s=dt.format(dateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
		System.out.println(s);
		
		Month m=dt.getMonth();
		
		System.out.println(m);
		
		int yyy=dt.getYear();
		System.out.println(yyy);
		
		int day= dt.getDayOfMonth();
		System.out.println(day);
		
		DayOfWeek dw=dt.getDayOfWeek();
		System.out.println(dw);
		

	}

}
