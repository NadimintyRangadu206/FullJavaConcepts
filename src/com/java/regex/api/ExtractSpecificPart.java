package com.java.regex.api;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractSpecificPart {

	public static void main(String[] args) {

		String text = "John Doe's phone number is 123-456-7890. Mary Smith's phone number is 987-654-3210.";

		Pattern p = Pattern.compile("\\b\\d{3}-\\d{3}-\\d{4}\\b");

		Matcher m = p.matcher(text);

		while (m.find()) {
			System.out.println("PhoneNumber Found:" + m.group());
		}

	}

}
