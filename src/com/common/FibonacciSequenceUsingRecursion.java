package com.common;

public class FibonacciSequenceUsingRecursion {

	int no = 5;

	public void fib(int f1, int f2) {

		int f3 = 0;
		while (no != 0) {

			f3 = f1 + f2;
			System.out.println(f3);
			f1 = f2;
			f2 = f3;
			no--;
			fib(f1, f2);

		}

	}

	public static void main(String[] args) {

		FibonacciSequenceUsingRecursion fb = new FibonacciSequenceUsingRecursion();

		int f1 = 0;
		int f2 = 1;
		System.out.println(f1);
		System.out.println(f2);
		fb.fib(f1, f2);

	}

}
