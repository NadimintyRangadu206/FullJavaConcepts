package com.mostly.asked.coding.interview.questions;

public class RotateImage {
	
	/**
	 * 
	 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

 

Example 1:


Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
Example 2:


Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
 

Constraints:

n == matrix.length == matrix[i].length
1 <= n <= 20
-1000 <= matrix[i][j] <= 1000
	 * @param matrix
	 */

	public static void rotate(int[][] matrix) {

		int traverse[][] = new int[matrix.length][matrix[0].length];

		int sIndex = 0;
		for (int i = 0; i < matrix.length; i++) {
			int end = 0;
			for (int j = 0; j < matrix[i].length; j++) {

				traverse[sIndex][end] = matrix[j][i];

				System.out.print(traverse[sIndex][end] + " ");
				end++;

			}

			System.out.println();

			sIndex++;
		}

		System.out.println("Rotate Image");

		int start = 0;
		for (int i = 0; i < traverse.length; i++) {

			int end = 0;
			for (int j = traverse[i].length - 1; j >= 0; j--) {

				matrix[start][end] = traverse[i][j];

				System.out.print(matrix[start][end] + " ");
				end++;
			}

			System.out.println();
			start++;
		}

	}

	public static void main(String[] args) {

		int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}

		System.out.println();

		System.out.println("Traverse Matrix");

		rotate(matrix);
	}

}
