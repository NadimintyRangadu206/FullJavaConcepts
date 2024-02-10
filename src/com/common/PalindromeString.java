package com.common;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String");

		String str = sc.next();

		String temp = new String();

		for (int i = str.length() - 1; i >= 0; i--) {

			Character ch = str.charAt(i);
			temp += ch.toString();
		}

		if (str.equalsIgnoreCase(temp)) {
			System.out.println("Yes");
		} else {
			System.out.println("Not");
		}
		String st = "hello world!";
		for (int i = 0; i < st.length(); i++) {

			if (st.charAt(i) != ' ') {
				System.out.print(st.charAt(i));
			}

		}
		System.out.println();

		// StringBuilder

		StringBuilder sb = new StringBuilder(str);

		sb.reverse().toString().toLowerCase();

		if (sb.equals(str)) {
			System.out.print("Palindrome");
		} else {
			System.out.println("Not pa");
		}

	}

}
