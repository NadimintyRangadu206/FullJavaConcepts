package com.mostly.asked.coding.interview.questions;

public class RotateMatrix90Degrees {

	public static void main(String[] args) {

		int arr[][] = {

				{ 11, 10, 13, 19 },

				{ 22, 21, 23, 24 },

				{ 33, 32, 31, 35 },

				{ 43, 42, 43, 40 }

		};

		int tranpose[][] = new int[4][4]; // step 1; transpose Given Matrix First

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				tranpose[i][j] = arr[j][i];
			}
			System.out.println();
		}

		for (int i = 0; i < tranpose.length; i++) { // another approach doing the 90Degree

			int startR = 0;
			int endC = tranpose.length - 1;

			while (startR < endC) {
				int temp = tranpose[i][startR];
				tranpose[i][startR] = tranpose[i][endC];
				tranpose[i][endC] = temp;

				startR++;
				endC--;

			}
		}

		for (int i = 0; i < tranpose.length; i++) {

			for (int j = 0; j < tranpose[i].length; j++) {
				System.out.print(tranpose[i][j] + " ");
			}
			System.out.println();
		}

		int degree90[][] = new int[4][4]; // step 2- Reverse the Transpose Of the Matrix

		for (int i = 0, k = 0; i < tranpose.length; i++, k++) {

			for (int j = tranpose[i].length - 1, l = 0; j >= 0; j--, l++) {
				degree90[k][l] = tranpose[i][j];

			}

			System.out.println();
		}

		for (int i = 0; i < degree90.length; i++) {

			for (int j = 0; j < degree90[i].length; j++) {
				System.out.print(degree90[i][j] + " ");
			}
			System.out.println();
		}
	}

}
