package com.java.regex.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingMobileNo {

	public static Pattern p = null;
	public static Matcher m = null;

	public static String phoneNumberMatching(String phoneNumber) {

		p = Pattern.compile("\\b[6-9]?[0-9]{9}\\b");

		m = p.matcher(phoneNumber);

		if (m.matches()) {
			return "Phone Number is Matches" + ":" + m.group();
		} else {
			return "Phone Number is doesnot Matchess";
		}

	}

	public static String emailMatching(String email) {

		p = Pattern.compile("\\b[A-Za-z0-9]+@[a-z]+\\.[a-z]{2,}\\b"); // \\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b

		m = p.matcher(email);

		if (m.matches()) {
			return "EmailId Is Matches " + ":" + m.group();
		} else {
			return "EmailId doesnot Matches";
		}

	}

	public static String userNameMatching(String userName) {

		p = Pattern.compile("^[A-Za-z]+(?:[-'\\\\s][A-Za-z]+)*$");

		m = p.matcher(userName);

		if (m.matches()) {
			return "UerName is Matching" + ":" + m.group();
		} else {
			return "UserName is doesnot Matching";
		}
	}

	public static String example(String str) {

		p = Pattern.compile("[a-z]+");

		m = p.matcher(str);
		if (m.matches()) {
			return "Given String  is Matched";
		} else {
			return "Given String is Not Matched";
		}
	}

	public static void main(String[] args) {

		String phoneNo = "6281233658";

		System.out.println(phoneNumberMatching(phoneNo));

		String email = "nadimintyrangadu206@gmail.com";

		System.out.println(emailMatching(email));

		
		String userName = "Rangadu";
		System.out.println(userNameMatching(userName));
		
		
		String s="defgh2345";
		System.out.println(example(s));
		
		
		

	}

}
