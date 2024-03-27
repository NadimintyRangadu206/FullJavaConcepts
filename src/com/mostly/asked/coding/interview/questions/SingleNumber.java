package com.mostly.asked.coding.interview.questions;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
Example 3:

Input: nums = [1]
Output: 1
 

Constraints:

1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
 * @author nadim
 *
 */

public class SingleNumber {

	public static int singleNumber(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int count = 1;

			if (nums[i] != -1) {
				for (int j = i + 1; j < nums.length; j++) {
					if (nums[i] == nums[j]) {
						count++;
						nums[j] = -1;
					}
				}

				map.put(nums[i], count);
			}
		}

		for (Map.Entry<Integer, Integer> entrySet : map.entrySet()) {

			if (entrySet.getValue() == 1) {
				return entrySet.getKey();
			}
		}
		return 0;

	}

	public static void main(String[] args) {

		int nums[] = { 2, 2, 1 };
		System.out.println(singleNumber(nums));
		String s="ksfs";
		StringBuilder sb= new StringBuilder();
		sb.delete(0, 0);
		s="";
		System.out.println(s);
		
		

	}

}
