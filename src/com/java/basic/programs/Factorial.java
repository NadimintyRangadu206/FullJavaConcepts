package com.java.basic.programs;

public class Factorial {

	

	public static void main(String[] args) {

		int i = 5;

		int fact = 1;

		while (i != 0) {

			fact = fact * i;
			i--;

		}
		System.out.println(fact);

	}

}
