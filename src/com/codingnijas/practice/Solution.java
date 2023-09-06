package com.codingnijas.practice;

public class Solution {

	public static void setZeros(int matrix[][]) {

		int copy[][] = new int[matrix.length][];
		System.out.println(matrix.length);

		for (int i = 0; i < matrix.length; i++) {

			copy[i] = new int[matrix[i].length];
			for (int j = 0; j < matrix.length; j++) {

				if (matrix[i][j] == 0) {

					copy[i][j] = 0;

				} else {
					copy[i][j] = matrix[i][j];
				}
			}
			System.out.println();

		}

		for (int i = 0; i < copy.length; i++) {

			for (int j = 0; j < copy.length; j++) {

				System.out.print(copy[i][j] + " ");
			}

			System.out.println();
		}

	}

	public static void main(String[] args) {

		int matrix[][] = new int[2][3];

		matrix[0][0] = 7;
		matrix[0][1] = 19;
		matrix[0][2] = 3;

		matrix[1][0] = 4;
		matrix[1][1] = 21;
		matrix[1][2] = 0;

//	Solution solution= new Solution();
		Solution.setZeros(matrix);

	}

}
