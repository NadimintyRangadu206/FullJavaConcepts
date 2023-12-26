package com.java.regex.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEx1 {

	public static void main(String[] args) {

		Pattern p = Pattern.compile("[^a-z]");

		Matcher m = p.matcher("abcd1234");

		while (m.find()) {
			System.out.println(m.start() + "-" + m.end());
			System.out.println(m.group());

		}
		System.out.println(m.groupCount());
		
		
		Pattern p1=Pattern.compile("s+");
		Matcher m1=p1.matcher("ass");
		
		boolean b=m1.matches();
		System.out.println(b);
		

	}

}
