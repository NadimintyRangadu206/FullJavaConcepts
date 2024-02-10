package com.java.test.book.programs;

import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class JavaTime {

	public static void main(String[] args) {
		
		LocalTime lt= LocalTime.of(1, 15,59);
		System.out.println(lt);

		LocalTime time =LocalTime.now();
		System.out.println(time);
		
		
		String format=time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
		System.out.println(format);
		
		int hour=time.getHour();
		System.out.println(hour);
		
		int minute=time.getMinute();
		System.out.println(minute);
		
		int second = time.getSecond();
		System.out.println(second);
		
		LocalTime plusHour=time.plusHours(1);
		System.out.println(plusHour);
		
	     LocalTime plusMinuts=  time.plusMinutes(4);
	       System.out.println(plusMinuts);
	       
	       ZoneId id= ZoneId.of("Asia/Tokyo");
	         
	       LocalTime zone=LocalTime.now(id);
	       
	       System.out.println(zone);
		
	       MonthDay monthDay= MonthDay.now();
	      int m= monthDay.getDayOfMonth();
	      System.out.println(m);
	      Month r= monthDay.getMonth();
	      System.out.println(m);
	      
	       System.out.println(monthDay);
	       
	       
	       long millis=System.currentTimeMillis();
	       Date date = new Date(millis);
	       System.out.println(date);
	       
	}

}
