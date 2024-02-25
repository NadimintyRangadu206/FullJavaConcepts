package com.mostly.asked.coding.interview.questions;

public class ConvertMatrixShellToOneDArray {

	public static void main(String[] args) {

		int arr[][] = {

				{ 11, 10, 13, 19 },

				{ 22, 21, 23, 24 },

				{ 33, 32, 31, 35 },

				{ 43, 42, 43, 40 }

		};

		int shell = 1; // 2

		int minR = shell - 1;
		int minC = shell - 1;

		int maxC = arr[0].length - 1;

		int maxR = arr.length - 1;

		int size = 2 * (maxR - minR + maxC - minC);

		int oneDArray[] = new int[size];

		int index = 0;

		for (int i = minR, j = minC; i <= maxR; i++) { // LW

			oneDArray[index] = arr[i][j];

			index++;
		}
		minC++;

		for (int i = maxR, j = minC; j <= maxC; j++) { // BW

			oneDArray[index] = arr[i][j];

			index++;
		}
		maxR--;

		for (int i = maxR, j = maxC; i >= minR; i--) { // RW

			oneDArray[index] = arr[i][j];

			index++;

		}
		maxC--;

		for (int i = minR, j = maxC; j >= minC; j--) { // TW

			oneDArray[index] = arr[i][j];

			index++;
		}

		for (int i : oneDArray) {
			System.out.print(i + " ");
		}

	}

}
