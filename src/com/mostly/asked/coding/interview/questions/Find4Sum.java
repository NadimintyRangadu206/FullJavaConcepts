package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 
 * Given an array nums of n integers, return an array of all the unique
 * quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
 * 
 * 0 <= a, b, c, d < n a, b, c, and d are distinct. nums[a] + nums[b] + nums[c]
 * + nums[d] == target You may return the answer in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,0,-1,0,-2,2], target = 0 Output:
 * [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]] Example 2:
 * 
 * Input: nums = [2,2,2,2,2], target = 8 Output: [[2,2,2,2]]
 * 
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 200 -109 <= nums[i] <= 109 -109 <= target <= 109
 * 
 * @author nadim
 *
 */
public class Find4Sum {

	public static List<List<Integer>> fourSum(int[] nums, int target) {

		Arrays.sort(nums);

		Set<List<Integer>> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					for (int s = k + 1; s < nums.length; s++) {

						if (nums[i] + nums[j] + nums[k] + nums[s] == target) {
							List<Integer> list = new ArrayList<>();

							list.add(nums[i]);
							list.add(nums[j]);
							list.add(nums[k]);
							list.add(nums[s]);

							set.add(list);
						}
					}
				}
			}
		}

		List<List<Integer>> copy = new ArrayList<>();

		for (List<Integer> i : set) {
			copy.add(i);
		}

		return copy;
	}

	public static void main(String[] args) {

		int nums[]= {1,0,-1,0,-2,2}; int target=0;
		
		fourSum(nums, target);
	}

}
