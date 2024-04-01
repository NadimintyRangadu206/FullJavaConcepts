package com.mostly.asked.coding.interview.questions;

public class ValidPalindromeII {

	public static boolean validPalindrome(String s) {

		if (s.isEmpty() || s.equals(" ")) {
			return true;
		}

		int st = 0;

		int e = s.length() - 1;

		while (st < e) {

			if (s.charAt(st) != s.charAt(e)) {

				return (checkPalindrome(s, st, e - 1) || checkPalindrome(s, st + 1, e));

			}
			st++;
			e--;

		}
		return true;
	}

	public static boolean checkPalindrome(String s, int st, int e) {

		while (st < e) {

			if (s.charAt(st) != s.charAt(e)) {
				return false;
			}
			st++;
			e--;

		}
		return true;
	}

	public static void main(String[] args) {

		String s = "abca";

		System.out.println(validPalindrome(s));

	}

}
