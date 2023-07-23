package com.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class StringContainsVowels {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a String");

		String str = sc.next();

		for (int i = 0; i < str.length(); i++) { // one Way of Approach

			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				System.out.print(str.charAt(i));
			}
		}

		System.out.println();

		// Ternary Operator

//		boolean b=false;
		for (int i = 0; i < str.length(); i++) {

			boolean b = (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O'
					|| str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
					|| str.charAt(i) == 'o' || str.charAt(i) == 'u') ? true : false;

			if (b == true) {
				System.out.print(str.charAt(i));
			}

		}

//		lambda Expressions:

		ArrayList<Character> arr = new ArrayList<Character>();

		for (int i = 0; i < str.length(); i++) {

			arr.add(str.charAt(i));
		}

		List<Character> list = new ArrayList<>();

		list = arr.stream().filter(i -> i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U' || i == 'a' || i == 'e'
				|| i == 'i' || i == 'o' || i == 'u').collect(Collectors.toList());

		for (Character c : list) {
			System.out.print(c);
		}

		arr.stream().filter(i -> i == 'A' || i == 'E' || i == 'I' || i == 'O' || i == 'U' || i == 'a' || i == 'e'
				|| i == 'i' || i == 'o' || i == 'u').forEach(System.out::print); // another Way Of Approach

		
		System.out.println();
		
		// Regular Expression

		System.out.println("Regular");
		Pattern p = Pattern.compile("[aeiou]");

		Matcher m = p.matcher(str);

		while (m.find()) {
			System.out.print(m.group());
		}

		
		System.out.println();
		
		for (int i = 0; i < str.length(); i++) { // Switch Case Of Approach

			char ch = str.charAt(i);

			switch (ch) {

			case 'A' | 'a':
				System.out.print(str.charAt(i));
				break;

			case 'E' | 'e':
				System.out.print(str.charAt(i));
				break;
			case 'I' | 'i':
				System.out.print(str.charAt(i));
				break;
			case 'O' | 'o':
				System.out.print(str.charAt(i));
				break;
			case 'U' | 'u':
				System.out.print(str.charAt(i));
				break;
			}
		}

	}

}
