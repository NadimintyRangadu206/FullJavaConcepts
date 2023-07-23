package com.java.dateTime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class DateTimeClass_getMethod {

	public static void main(String[] args) {
		
		LocalDateTime t= LocalDateTime.now();
		
		int dt1=t.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
		System.out.println(dt1);
		
		

		int dt2=t.get(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR);
		System.out.println(dt2);
		
		

		int dt3=t.get(ChronoField.ALIGNED_WEEK_OF_MONTH);
		System.out.println(dt3);
		
		

		int dt4=t.get(ChronoField.AMPM_OF_DAY);
		System.out.println(dt4);
		
		int dt6=t.get(ChronoField.DAY_OF_MONTH);
		System.out.println(dt6);
		
		int dt7=t.get(ChronoField.DAY_OF_WEEK);
		System.out.println(dt7);
		
		
		int dt8=t.get(ChronoField.DAY_OF_YEAR);
		System.out.println(dt8);
		
		int dt9=t.get(ChronoField.HOUR_OF_DAY);
		System.out.println(dt9);

	}

}
