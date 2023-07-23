package com.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertStringToDate {

	public static void main(String[] args) throws ParseException {
	
		String str="20/12/2000";
		
		String s1="11/31/1999";
//		Date d= Date.valueOf(str);
//		System.out.println(d);
		
		SimpleDateFormat f= new SimpleDateFormat("dd/mm/yyyy");

		Date d1=f.parse(str);
		System.out.println(d1);
		SimpleDateFormat s=new SimpleDateFormat("mm/dd/yyyy");
		
	Date d2= s.parse(s1);
	
	System.out.println(d2);
	}

}
