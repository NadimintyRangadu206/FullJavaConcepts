package com.java.test.book.programs;

public class PrintNumbers {

	public static void main(String[] args) {

		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}

		System.out.println("Using the do While Loop");

		int j = 1;
		do {

			System.out.println(j);
			j++;

		} while (j <= 10);

		System.out.println("Using the for Loop");

		for (int k = 1; k <= 10; k++) {
			System.out.println(k);
		}

		System.out.println("Using the for each Loop");

		int arr[] = { 1, 2, 3, 4, 5 };

		for (int n : arr) {
			System.out.println(n);
		}
		System.out.println("Using the infinite for Loop");

		int r = 1;
		for (;;) {

			if (r <= 10) {
				System.out.println(r);
				r++;
			}

		}

	}

}
