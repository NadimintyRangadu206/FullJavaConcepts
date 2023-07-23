package com.java.basic.programs;

public class AmstrongNumber {

	public static void main(String[] args) {

		int i = 123;

		int r = 0;
		int sum = 0;
		int temp = i;

		while (i != 0) {

			r = i % 10;
			sum = sum + r * r * r;
			i = i / 10;

		}

		if (temp == sum) {
			System.out.println("Amstrong Number");
		} else {
			System.out.println("Not Amstrong Number");
		}

	}

}
