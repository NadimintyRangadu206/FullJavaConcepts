package com.mostly.asked.coding.interview.questions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WlidCardMatching {
	
	
	public static boolean isMatch(String s, String p) {

		boolean flag = false;

		Pattern pattern = Pattern.compile(p);

		Matcher m = pattern.matcher(s);

		if (m.matches()) {
			flag = true;
		}

		if (flag == true) {

			return true;
		}

		return false;

	}

	public static void main(String[] args) {

		String s = "aa";

		String pattern = ".?";

		System.out.println(isMatch(s, pattern));

	}

}
