package com.java.test.book.programs;

public class PrintPositiveOrNegative {

	public static void main(String[] args) {

		int no = 0;

		if (no == 0) {
			System.out.println(no + " " + " is Not a Positive or Negative ");
		} else if (no > 0) {
			System.out.println(no + " " + "is Positive Number");
		} else {
			System.out.println(no + " " + "is Negative Number");
		}
	}
}
