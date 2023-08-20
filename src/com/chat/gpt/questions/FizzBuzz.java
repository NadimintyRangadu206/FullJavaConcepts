package com.chat.gpt.questions;

public class FizzBuzz {

	public static String fizzBuzz(int start, int end) {

		for (int i = start; i <= end; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FIZZBUZZ");
			} else if (i % 3 == 0) {

				System.out.println("FIZZ");
			} else if (i % 5 == 0) {
				System.out.println("BUZZ");
			} else {
				System.out.println(i);
			}

		}

		return null;

	}

	public static void main(String[] args) {

		FizzBuzz.fizzBuzz(1, 100);

		for (int i = 1; i <= 100; i++) {

			if ((i % 3 == 0) && (i % 5 == 0)) {
				System.out.println("FIZZ BUZZ");
			} else if (i % 3 == 0) {
				System.out.println("FIZZ");
			} else if (i % 5 == 0) {
				System.out.println("BUZZ");
			}

			else {
				System.out.println(i);
			}
		}

	}

}
