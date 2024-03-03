package com.mostly.asked.coding.interview.questions;

import java.util.Arrays;
/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4
 
 * @author nadim
 *
 */

public class SearchInsertPosition {

	public  static int searchInsert(int[] nums, int target) {

		int arr[] = new int[nums.length + 1];

		arr[nums.length] = target;
		int result = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == target) {
				return i;
//				break;
			} else {
				arr[i] = nums[i];
			}

		}

		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == target) {
				result = i;
			}
		}
		return result;
	}

	public static void main(String[] args) {

		int nums[]= {1,3,5,6};
		int target=5;
		
		System.out.println(searchInsert(nums, target));
		
	}

}
