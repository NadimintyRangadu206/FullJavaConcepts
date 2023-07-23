package com.java.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateClass_Method4 {

	public static void main(String[] args) {
		
		LocalDateTime d= LocalDateTime.now();
		String s="yy-mm-dd";
		
		String s1=d.format(DateTimeFormatter.BASIC_ISO_DATE);
		
		System.out.println(s1);
		
	String s2=d.format(DateTimeFormatter.ISO_DATE);
		
		System.out.println(s2);
		
	String s3=d.format(DateTimeFormatter.ISO_DATE_TIME);
		
		System.out.println(s3);
		
//	String s4=d.format(DateTimeFormatter.ISO_INSTANT);
//		
//		System.out.println(s4);
		
	String s5=d.format(DateTimeFormatter.ISO_LOCAL_DATE);
		
		System.out.println(s5);
		
	String s6=d.format(DateTimeFormatter.ISO_ORDINAL_DATE);
		
		System.out.println(s6);
		
	String s7=d.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
	
	
		
		System.out.println(s7);
		
		

	}

}
