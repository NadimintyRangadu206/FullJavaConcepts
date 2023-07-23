package com.java.monthday;

import java.time.MonthDay;
import java.time.temporal.ChronoField;

public class ValidYear {

	public static void main(String[] args) {
	 MonthDay md= MonthDay.now();
	 System.out.println(md);
	 
	 System.out.println(md.range(ChronoField.DAY_OF_MONTH));
	 System.out.println(md.range(ChronoField.MONTH_OF_YEAR));

	}

}
