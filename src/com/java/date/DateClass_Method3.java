package com.java.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateClass_Method3 {
	
	public LocalDateTime findDateTime(int hour,int minute,int second) {
		
		LocalDate dl=LocalDate.now();
		
		LocalDateTime ldt=dl.atTime(hour, minute, second);
		
		return ldt;
		
	}

	public static void main(String[] args) {
	
		LocalDate d=LocalDate.of(2020, 1, 12);
		
		LocalDateTime dl=d.atTime(2, 59,59); // throw DateTimeException
		
		System.out.println(dl);
		
		DateClass_Method3 dcm= new DateClass_Method3();
		
		System.out.println(dcm.findDateTime(1, 23, 34));
		

	}

}
