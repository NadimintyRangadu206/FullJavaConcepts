package com.mostly.asked.coding.interview.questions;


/**
 * Given a positive integer n, find the pivot integer x such that:

The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.

 

Example 1:

Input: n = 8
Output: 6
Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.
Example 2:

Input: n = 1
Output: 1
Explanation: 1 is the pivot integer since: 1 = 1.
Example 3:

Input: n = 4
Output: -1
Explanation: It can be proved that no such integer exist.
 

Constraints:

1 <= n <= 1000
 * @author nadim
 *
 */
public class FindThePivotNumber {

	public static int pivotInteger(int n) {  // Left index== right Index

		int arr[] = new int[n];

		int i = 1;

		for (int j = 0; j < n; j++) {
			arr[j] = i;
			i++;

		}

		int sum = 0;

		for (int k : arr) {
			sum += k;
		}

		int left = 0;
		int right = sum;

		for (int k = 0; k < arr.length; k++) {

			right -= arr[k];

			if (left == right) {
				return k+1;
			} else {
				left += arr[k];
			}

		}
		return -1;
	}

	public static void main(String[] args) {

		int n = 8;

		System.out.println(pivotInteger(n));

	}

}
