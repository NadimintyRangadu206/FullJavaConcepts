package com.java.time;

import java.time.LocalTime;

public class TimeClass_AddMethods {

	public static void main(String[] args) {
	
		LocalTime t=LocalTime.NOON;
		System.out.println(t);
		
		LocalTime t1= LocalTime.MIDNIGHT;
		System.out.println(t1);
		
		LocalTime t3= LocalTime.MIN;
		System.out.println(t3);
		
		LocalTime t4= LocalTime.MIDNIGHT;
		System.out.println(t4.plusHours(1));
		
		
		LocalTime t5= LocalTime.MIDNIGHT;
		System.out.println(t5.minusHours(3));
		
		LocalTime t6= LocalTime.MIDNIGHT;
		System.out.println(t6.minusMinutes(40));

	}

}
