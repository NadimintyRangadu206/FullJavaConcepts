package com.mostly.asked.coding.interview.questions;

public class FindTheSumOfBothDiagonal2DArray {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 1, 2, 5 }, { 4, 5, 7, 8 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + "  ");

			}
			System.out.println();
		}

		int diagonal1 = 0;
		int diagonal2 = 0;

//		for (int i = 0; i < arr.length; i++) {                // approach 1
//			for (int j = 0; j < arr[i].length; j++) {
//
//				if (arr[i] == arr[j]) {
//					diagonal1 += arr[i][j];
//				}
//
//			}
//			System.out.println();
//		}

		for (int i = 0; i < arr.length; i++) {

			diagonal1 += arr[i][i];
		}

		System.out.println(diagonal1 + "\n");
//
//		int maxC = arr[0].length - 1;              // approach 2
//
//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = 0; j < arr[i].length; j++) {
//
//				if (maxC == j) {
//					diagonal2 += arr[i][j];
//				}
//			}
//			maxC--;
//			System.out.println();
//		}

		for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {

			diagonal2 += arr[i][j];
		}

		System.out.println(diagonal2 + "\n");
		int sumOfTwoDiagonals = diagonal1 + diagonal2;

		System.out.println("Sum Of Two Diagonals:" + "\n" + sumOfTwoDiagonals);

	}

}
