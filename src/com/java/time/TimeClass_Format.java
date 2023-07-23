package com.java.time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class TimeClass_Format {

	public static void main(String[] args) {
	
		LocalTime t=LocalTime.of(11, 33);// now
	 
		    String s=t.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
		    System.out.println(s);
		    
		    
		    String tt="H:M";
		    String pattern= t.format(DateTimeFormatter.ofPattern(s));
		    System.out.println(pattern);
	
		    
		

	}

}
