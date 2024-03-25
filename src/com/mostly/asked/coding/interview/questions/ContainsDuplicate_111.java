package com.mostly.asked.coding.interview.questions;

/**
 * 
 * You are given an integer array nums and two integers indexDiff and valueDiff.

Find a pair of indices (i, j) such that:

i != j,
abs(i - j) <= indexDiff.
abs(nums[i] - nums[j]) <= valueDiff, and
Return true if such pair exists or false otherwise.

 

Example 1:

Input: nums = [1,2,3,1], indexDiff = 3, valueDiff = 0
Output: true
Explanation: We can choose (i, j) = (0, 3).
We satisfy the three conditions:
i != j --> 0 != 3
abs(i - j) <= indexDiff --> abs(0 - 3) <= 3
abs(nums[i] - nums[j]) <= valueDiff --> abs(1 - 1) <= 0
Example 2:

Input: nums = [1,5,9,1,5,9], indexDiff = 2, valueDiff = 3
Output: false
Explanation: After trying all the possible pairs (i, j), we cannot satisfy the three conditions, so we return false.
 
 * @author nadim
 *
 */
public class ContainsDuplicate_111 {

	public static  boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

		if (nums == null || nums.length == 0) {
			return false;
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (Math.abs(i - j) <= indexDiff && Math.abs(nums[i] - nums[j]) <= valueDiff) {

					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {

		 int nums[] = {1,5,9,1,5,9} ;int  indexDiff = 2; int  valueDiff = 3;
		 
		 System.out.println(containsNearbyAlmostDuplicate(nums, indexDiff, valueDiff));
	}

}
