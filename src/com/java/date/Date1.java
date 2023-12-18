package com.java.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Date1 {

	public static void main(String[] args) {

		LocalDate ld = LocalDate.of(2023, 12, 31);

		LocalDateTime e = LocalDateTime.now();

		System.out.println(e);
		System.out.println(ld);

		DayOfWeek dayOfWeek = e.getDayOfWeek(); // find the week
		System.out.println(dayOfWeek);

		int day = e.getDayOfMonth();
		System.out.println(day);
		int year = e.getDayOfYear();
		System.out.println(year);

		DayOfWeek ldt = e.minusDays(1).getDayOfWeek();
		System.out.println(ldt);

		String str = e.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT));
		System.out.println(str);

		int mo = e.getMonthValue();
		System.out.println(mo);
		
		
		

	}

}
