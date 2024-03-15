package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * A peak element is an element that is strictly greater than its neighbors.

Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

You may imagine that In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

You must write an algorithm that runs in O(log n) time.

 

Example 1:

Input: nums = [1,2,3,1]
Output: 2
Explanation: 3 is a peak element and your function should return the index number 2.
Example 2:

Input: nums = [1,2,1,3,5,6,4]
Output: 5
Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 * @author nadim
 *
 */

public class FindPeakElement {

	public static  int findPeakElement(int[] nums) {

		List<Integer> list = new ArrayList<>();

		for (int i : nums) {
			list.add(i);
		}

		Optional<Integer> optional = list.stream().max(Comparator.comparing(i -> i));

		int peakValue = optional.get();

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == peakValue) {
				return i;
			}
		}

		return 0;
	}

	public static void main(String[] args) {
		
		int nums[]= {1,2,3,1};
		System.out.println(findPeakElement(nums));

	}

}
