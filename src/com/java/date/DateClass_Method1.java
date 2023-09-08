package com.java.date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateClass_Method1 {

	public static void main(String[] args) {
		
	LocalDate d=LocalDate.now();
	
	System.out.println(d);
	
	LocalDate tommorow=d.plusDays(1);
	System.out.println(tommorow);
	
	LocalDate yesterday=d.minusDays(2);
	System.out.println(yesterday);
	
	String s=d.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
	System.out.println(s);

	}

}
