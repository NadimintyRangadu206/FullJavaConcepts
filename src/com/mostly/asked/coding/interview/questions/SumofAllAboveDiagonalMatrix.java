package com.mostly.asked.coding.interview.questions;

public class SumofAllAboveDiagonalMatrix {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println();

		int sum = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				sum += arr[i][j];
			}
			System.out.println();
		}

		System.out.println("Sum Of All Above Diagonal Of Matrix :" + sum + "\n");

		int sumOfDiagonals = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i] == arr[j]) {
					sumOfDiagonals += arr[i][j];
				}

			}
			System.out.println();
		}

		System.out.println("Sum Of the Diagonals Of Matrix :" + sumOfDiagonals);
	}

}
