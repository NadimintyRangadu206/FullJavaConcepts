package com.mostly.asked.coding.interview.questions;

import java.util.HashSet;

/**
 * 
 * There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

You must decrease the overall operation steps as much as possible.

 

Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
 

Constraints:

1 <= nums.length <= 5000
-104 <= nums[i] <= 104
nums is guaranteed to be rotated at some pivot.
-104 <= target <= 104
 

Follow up: This problem is similar to Search in Rotated Sorted Array, but nums may contain duplicates. Would this affect the runtime complexity? How and why?
 * @author nadim
 *
 */
public class SearchInRotatedSortedArrayII {

	public static boolean search(int[] nums, int target) {

		HashSet<Integer> set = new HashSet<>();

		for (int i : nums) {
			set.add(i);
		}

		boolean flag = false;
		for (int i : set) {
			if (i == target) {
				flag = true;
			}
		}

		if (flag == true) {
			return true;
		} else {
			return flag;
		}
	}

	public static void main(String[] args) {

		int nums[] = { 2, 5, 6, 0, 0, 1, 2 };
		int target = 0;

		System.out.println(search(nums, target));

	}

}
