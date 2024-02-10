package com.java.test.book.programs;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaDateTime {

	public static void main(String[] args) {

		LocalDate date = LocalDate.now();

		LocalDate d = LocalDate.of(24, 1, 17);

		DayOfWeek str = d.getDayOfWeek();

		System.out.println(str);

		if (d.isLeapYear()) {

			System.out.println("Leaper Year");

		} else {

			System.out.println("Not Leaper Year");
		}

		LocalDate minusDays = d.minusDays(2);

		System.out.println(minusDays);

		LocalDate minusMonths = d.minusMonths(1);
		System.out.println(minusMonths);

		Month month = d.getMonth();
		System.out.println(month);

		int monthValue = d.getMonthValue();
		System.out.println(monthValue);

		int year = d.getYear();
		System.out.println(year);

		String s = d.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
		System.out.println(s);

		d.getDayOfMonth();

		String sDate = "2023-04-23";

		LocalDate local = LocalDate.parse(sDate);
		System.out.println(local);

	}

}
