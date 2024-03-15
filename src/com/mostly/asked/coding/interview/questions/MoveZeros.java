package com.mostly.asked.coding.interview.questions;

/**
 * 
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [0,1,0,3,12] Output: [1,3,12,0,0] Example 2:
 * 
 * Input: nums = [0] Output: [0]
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 104 -231 <= nums[i] <= 231 - 1
 * 
 * @author nadim
 *
 */
public class MoveZeros {

	public static void moveZeroes(int[] nums) {

		int arr[] = new int[nums.length];

		int startIndex = 0;
		int end = arr.length - 1;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {
				arr[startIndex] = nums[i];
				startIndex++;
			} else {
				arr[end] = 0;
				end--;
			}

		}

		for (int i = 0; i < arr.length; i++) {

			nums[i] = arr[i];
		}

	}

	public static void main(String[] args) {

		int[] nums = { 0, 1, 0, 3, 12 };

		moveZeroes(nums);
	}

}
