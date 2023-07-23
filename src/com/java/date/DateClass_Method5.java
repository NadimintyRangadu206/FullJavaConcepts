package com.java.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateClass_Method5 {

	
	public static void main(String[] args) {

		String s = "yyyy-dd-mm";

//		LocalDate d=LocalDate.parse(s);
//		System.out.println(s);
		
		int month=8;
		int day=5;
		int yr=2015;

		LocalDate t = LocalDate.of(yr, month, day);

		
		Month s3 = t.getMonth();
		System.out.println(s3);

		int md = t.getDayOfMonth();
		System.out.println(md);

		DayOfWeek dw = t.getDayOfWeek();
		System.out.println(dw.toString());

		int mv = t.getMonthValue();
		System.out.println(mv);

//		int y = t.getYear();
//		System.out.println(y);
//
//		int d = t.getMinute();
//		System.out.println(d);
//		
//		int h = t.getHour();
//		System.out.println(h);
//		
//		int sec=t.getSecond();
//		System.out.println(sec);

		String s1 = t.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));

		System.out.println(s1);
		
		
//		LocalDateTime td=LocalDateTime.parse("2020-12-20"); DateTimeParseException
//		System.out.println(td);

	}

}
