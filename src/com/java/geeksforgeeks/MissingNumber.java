package com.java.geeksforgeeks;

import java.util.Arrays;

public class MissingNumber {
	
	/**
	 * 
	 * @param array
	 * @param n
	 * @return
	 * 
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Example 1:

Input:
N = 5
A[] = {1,2,3,5}
Output: 4
Example 2:

Input:
N = 10
A[] = {6,1,2,8,3,4,7,10,5}
Output: 9

Your Task :
You don't need to read input or print anything. Complete the function MissingNumber() that takes array and N as input  parameters and returns the value of the missing number.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


	 */

	static int missingNumber(int array[], int n) {

		Arrays.sort(array);

		int arr[] = new int[n];
		int missingNumber = 0;

		int no = 1;

		for (int i = 0; i < array.length; i++) {

			if (no == array[i]) {

				arr[i] = no;

				no++;

			} else {

				arr[i] = no;
				break;

			}

		}

		missingNumber = no;
		return missingNumber;
	}

	public static void main(String[] args) {

		int ar[] = { 1 };
		int n = 2;

		System.out.println(missingNumber(ar, n));

	}

}
