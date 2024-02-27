package com.mostly.asked.coding.interview.questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindWildCardMatching {

	public static void main(String[] args) {
		
		String s="acc";
		
		String p1="";
		
		Pattern p=Pattern.compile(".?.*");

				Matcher m=p.matcher(s);
		
		if(m.matches()) {
			System.out.println("Matching");
		}else {
			System.out.println("not");
		}
	}

}
