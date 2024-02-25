package com.mostly.asked.coding.interview.questions;

public class FindTheShaddlePointOfMatrix {

	public static void main(String[] args) {

		int arr[][] = {

				{ 11, 10, 13, 19 },

				{ 22, 21, 23, 24 },

				{ 33, 32, 31, 35 },

				{ 43, 42, 43, 40 }

		};

		for (int i = 0; i < arr.length; i++) {

			int minC = 0;

			for (int j = 1; j < arr[i].length; j++) {

				if (arr[i][minC] > arr[i][j]) {
					minC = j;
				}

			}

			boolean flag = true;

			for (int k = 0; k < arr.length; k++) {

				if (arr[i][minC] < arr[k][minC]) {

					flag = false;
					break;
				}
			}

			if (flag == true) {
				System.out.println("Shaddle Point:" + arr[i][minC]);
			}
		}

	}

}
