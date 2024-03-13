package com.mostly.asked.coding.interview.questions;

/**
 * 
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109
 * @author nadim
 *
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

	public static int[] searchRange(int[] nums, int target) {

		int arr[] = new int[2];

		int first = -1;
		int last = -1;

		for (int i = 0; i < nums.length; i++) {

			if (target != nums[i]) {
				continue;
			}

			if (first == -1) {
				first = i;
			}
			last = i;

		}

		if (first != -1) {
			arr[0] = first;
			arr[1] = last;
			return arr;
		} else {
			return new int[] { -1, -1 };
		}

	}

	public static void main(String[] args) {

		int nums[] = { 5, 7, 7, 8, 8, 10 };
		int target = 8;

		System.out.println(searchRange(nums, target));

	}

}
