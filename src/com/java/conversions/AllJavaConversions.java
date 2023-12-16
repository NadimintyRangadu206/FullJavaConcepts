package com.java.conversions;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class ConversionMethods {

	public static int stringToIntConversion(String st) {

		int parse = Integer.parseInt(st);
//		                                                  int parse=Integer.valueOf(st);
		return parse;

	}

	public static String intToStringConversion(int no) {

		String s = String.valueOf(no);
//		                                                     String str= Integer.toString(no) ;

		return s;
	}

	public static long stringToLong(String str) {

		long l = Long.parseLong(str); // Long.valueOf(l);
		return l;
	}

	public static Date stringToDate(String str) throws ParseException {

		Date sdf = new SimpleDateFormat("dd/MM/yy").parse(str);

//		SimpleDateFormat format1= new  SimpleDateFormat("dd-MM-yy");
//		Date d1=format1.parse(str);
//      System.out.println(d1);
		return sdf;

	}

	public static String dateToString(Date date) {

		String s = String.valueOf(date);

		return s;

	}

	public static char[] stringtoChar(String str) {

		char ch[] = new char[str.length()];
//                                                                  char ch1[]=str.toCharArray();
		for (int i = 0; i < str.length(); i++) {

			ch[i] = str.charAt(i);
		}

		return ch;

	}

	public static Timestamp dateToTimestamp(Date date) {

//		Date da =new Date();

		Timestamp timestamp = new Timestamp(date.getTime());
		return timestamp;

	}

}

public class AllJavaConversions {

	public static void main(String[] args) throws ParseException {

		System.out.println(ConversionMethods.stringToIntConversion("5555"));

		System.out.println(ConversionMethods.intToStringConversion(62656253));

		System.out.println(ConversionMethods.stringToLong("484232326462546"));
		System.out.println(ConversionMethods.stringToDate("15/12/2023"));

//		Date date= Calendar.getInstance().getTime();
//		DateFormat form = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
//		
//	String dat =form.format(date);

		System.out.println(ConversionMethods.dateToString(new Date()));
		System.out.println(ConversionMethods.stringtoChar("Rangadu"));

		System.out.println(ConversionMethods.dateToTimestamp(new Date()));

	}

}
