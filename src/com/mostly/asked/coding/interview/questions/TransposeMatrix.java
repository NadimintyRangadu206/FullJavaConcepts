package com.mostly.asked.coding.interview.questions;

public class TransposeMatrix {

	public static void main(String[] args) {

		int arr[][] = new int[3][2];

		arr[0][0] = 1;
		arr[0][1] = 2;

		arr[1][0] = 3;
		arr[1][1] = 4;

		arr[2][0] = 5;
		arr[2][1] = 6;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println("After Transpose Of Matrix");

		for (int i = 0; i < arr[0].length; i++) {
			for (int j = 0; j < arr.length; j++) {

				System.out.print(arr[j][i] + " ");
			}

			System.out.println();
		}

	}

}
