package com.mostly.asked.coding.interview.questions;

public class SearchElementOnMatrix {

	public static void main(String[] args) {

		int arr[][] = { { 10, 11, 12, 14 }, { 20, 22, 24, 26 }, { 31, 35, 38, 40 }, { 41, 44, 46, 48 } };

		int targetElement = 44;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] == targetElement) {
					System.out.print("("+i + "," + j+")");
				}

			}
			System.out.println();
		}

	}

}
