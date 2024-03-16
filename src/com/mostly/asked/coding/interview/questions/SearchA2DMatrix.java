package com.mostly.asked.coding.interview.questions;

/**
 * 
 * 
 * You are given an m x n integer matrix matrix with the following two
 * properties:
 * 
 * Each row is sorted in non-decreasing order. The first integer of each row is
 * greater than the last integer of the previous row. Given an integer target,
 * return true if target is in matrix or false otherwise.
 * 
 * You must write a solution in O(log(m * n)) time complexity.
 * 
 * 
 * @author nadim
 *
 */
public class SearchA2DMatrix {

	public static boolean searchMatrix(int[][] matrix, int target) {

		boolean flag = false;

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {

				if (matrix[i][j] == target) {
					flag = true;
				}
			}
		}

		if (flag == true) {

			return flag;
		} else {
			return flag;
		}

	}

	public static void main(String[] args) {

		int matrix[][] = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 10, 11, 16, 20 } };

		int target = 3;

		System.out.println(searchMatrix(matrix, 3));

	}

}
