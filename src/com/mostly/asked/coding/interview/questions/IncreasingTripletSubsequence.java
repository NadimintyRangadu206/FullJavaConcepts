package com.mostly.asked.coding.interview.questions;

/**
Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.

Example 1:

Input: nums = [1,2,3,4,5]
Output: true
Explanation: Any triplet where i < j < k is valid.
Example 2:

Input: nums = [5,4,3,2,1]
Output: false
Explanation: No triplet exists.
Example 3:

Input: nums = [2,1,5,0,4,6]
Output: true
Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
 

Constraints:

1 <= nums.length <= 5 * 105
-231 <= nums[i] <= 231 - 1
*/

public class IncreasingTripletSubsequence {

	public static boolean increasingTriplet(int[] nums) { // better approach

		boolean flag = false;

		int x = Integer.MAX_VALUE;

		int y = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {

			int z = nums[i];

			if (x >= z) {
				x = z;
			} else if (y >= z) {
				y = z;
			} else {
				return true;
			}
		}
		return flag;
	}

	public static boolean subSequence(int nums[]) { // this approach time limit exceeds

		boolean flag = false;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {

					if (nums[i] < nums[j]) {

						if (nums[j] < nums[k]) {

							flag = true;
						}

					}
				}
			}
		}

		if (flag == true) {
			return true;
		} else {
			return flag;
		}

	}

	public static void main(String[] args) {

		int nums[] = { 5, 4, 3, 2, 1 };

		System.out.println(increasingTriplet(nums));

		System.out.println(subSequence(nums));

	}

}
