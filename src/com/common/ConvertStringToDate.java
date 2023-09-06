package com.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class ConvertStringToDate {

	public static void main(String[] args) throws ParseException {

		String str = "12/12/2000";

		String s1 = "4/09/1999";
//		Date d= Date.valueOf(str);
//		System.out.println(d);

		SimpleDateFormat f = new SimpleDateFormat("mm/dd");

		Date d1 = (Date)f.parse(str);
		System.out.println(d1);
		SimpleDateFormat s = new SimpleDateFormat("mm/dd/yyyy");

		Date d2 = s.parse(s1);

		System.out.println(d2);
	}

}
