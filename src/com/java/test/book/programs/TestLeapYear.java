package com.java.test.book.programs;

public class TestLeapYear {
	public static void main(String[] args) {

		int year = 2000;

		if (year % 100 == 0 && year % 400 == 0) {
			System.out.println(year + "" + "Century year & Leap year");
		} else if (year % 4 == 0 && year % 100 != 0) {
			System.out.println(year + ":" + "Is Leap Year");
		} else {
			System.out.println(year + " " + "Is not a Leap year");
		}

		int f1 = 0;
		int f2 = 1;
		int f3;

		System.out.println("f1" + ":" + f1);
		System.out.println("f2" + ":" + f2);
		for (int i = 0; i <= 5; i++) {
			f3 = f1 + f2;
			System.out.println("f3" + ":" + f3);
			f1 = f2;
			f2 = f3;

		}

		String str = "djfewebwkek";

		String format = String.format("  %20s", str);
		System.out.println(format);

	}
}
