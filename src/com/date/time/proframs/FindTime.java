package com.date.time.proframs;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class FindTime {

	public static void main(String[] args) {

		LocalDateTime lt = LocalDateTime.of(2023, 12, 10, 12, 12, 12);

		String t = lt.format(DateTimeFormatter.ofPattern("HH-mm-ss,a"));

		System.out.println(t);

		Date d = new Date();

		String s = "HH:mm:ss ,a";
		SimpleDateFormat sdf = new SimpleDateFormat(s);

		Month m = lt.getMonth();
		System.out.println(m.plus(2));

		System.out.println(sdf.format(d));

		LocalDateTime d1 = LocalDateTime.now();

		String s1 = d1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM));
		System.out.println(s1);

		
		System.out.println("Months Of Months Names");
		int months = 1;
		int i = 0;
		String arr[] = new String[12];
		while (months <= 12) {
			Month ms = Month.of(months);
			arr[i] = ms.name();
			months++;
			i++;

		}

		for (String s2 : arr) {
			System.out.println(s2);
		}

		System.out.println("Day Of Week Names");
		String day[] = new String[7];
		int j = 0;
		int days = 1;
		while (days <= 7) {
			DayOfWeek dw = DayOfWeek.of(days);
			day[j] = dw.name();
			days++;
			j++;
		}

		for (String d2 : day) {
			System.out.println(d2);
		}

	}

}
