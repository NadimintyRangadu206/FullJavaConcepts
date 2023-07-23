package com.java.date;

import java.time.LocalDate;



public class DateClass_Method2 {

	/**
	 * 
	 * @param year
	 * @param month
	 * @param dayOfMonth
	 * 
	 *   It throws the DateTimeException. when the month is below 1 and above 12 ,that time DateTimeException is Occur. same as day also
	 * @return
	 */
	public boolean findLeapYearOrNot(int year, int month, int dayOfMonth) {

		boolean b = false;

		LocalDate ld = LocalDate.of(year, month, dayOfMonth); // throws the DateTimeException

		if (ld.isLeapYear()) {
			b = true;
		} else {
			
			b = false;
		}

		return b;

	}

	public static void main(String[] args) {

		LocalDate d = LocalDate.of(2020, 12, 31);

		if (d.isLeapYear()) {
			System.out.println("THIS YEAR IS LEAP YEAR");
		} else {
			System.out.println("THIS YEAR IS NOT LEAP YEAR");
		}
		
		
		
		DateClass_Method2 dcm= new DateClass_Method2();
		
		int year=2021;
		int month=11;
		int dayOfMonth=2;
		
		System.out.println(dcm.findLeapYearOrNot(year, month, dayOfMonth));

	}

}
