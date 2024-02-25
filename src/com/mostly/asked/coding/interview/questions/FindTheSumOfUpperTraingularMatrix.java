package com.mostly.asked.coding.interview.questions;

public class FindTheSumOfUpperTraingularMatrix {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 8, 7, 6, 5 }, { 4, 3, 2, 1 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr[i].length; j++) {

				sum += arr[i][j];

			}
			System.out.println();
		}

		System.out.println("Sum Of Upper Triangular Matrix:" + sum);

	}

}
