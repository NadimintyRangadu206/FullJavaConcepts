package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j],
 * nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] +
 * nums[k] == 0.
 * 
 * Notice that the solution set must not contain duplicate triplets.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [-1,0,1,2,-1,-4] Output: [[-1,-1,2],[-1,0,1]] Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0. nums[1] + nums[2] + nums[4] =
 * 0 + 1 + (-1) = 0. nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0. The
 * distinct triplets are [-1,0,1] and [-1,-1,2]. Notice that the order of the
 * output and the order of the triplets does not matter. Example 2:
 * 
 * Input: nums = [0,1,1] Output: [] Explanation: The only possible triplet does
 * not sum up to 0. Example 3:
 * 
 * Input: nums = [0,0,0] Output: [[0,0,0]] Explanation: The only possible
 * triplet sums up to 0.
 * 
 * 
 * Constraints:
 * 
 * 3 <= nums.length <= 3000 -105 <= nums[i] <= 105
 * 
 * @author nadim
 *
 */

public class Find3Sum {

	public static List<List<Integer>> threeSumCal(int nums[]) { // exactly Follow approach 

		Arrays.sort(nums);

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		for (int i = 0; i < nums.length - 2; i++) {

			int sIndex = i + 1;
			int eIndex = nums.length - 1;

			int rem = -nums[i];

			if (i == 0 || nums[i] != nums[i - 1]) {
				while (sIndex < eIndex) {

					int tSum = nums[sIndex] + nums[eIndex];

					if (tSum == rem) {

						result.add(Arrays.asList(nums[i], nums[sIndex], nums[eIndex]));

						while (sIndex < eIndex && nums[sIndex] == nums[sIndex + 1]) {
							sIndex++;
						}
						while (sIndex < eIndex && nums[eIndex] == nums[eIndex - 1]) {
							eIndex--;
						}

						sIndex++;
						eIndex--;
					} else if (tSum < rem) {
						sIndex++;
					} else {
						eIndex--;
					}

				}

			}

		}

		return result;
	}

	public static List<List<Integer>> threeSum(int[] nums) { // General Approach

		Arrays.sort(nums); // first sort Array

		Set<List<Integer>> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {

					if (nums[i] + nums[j] + nums[k] == 0) {

						List<Integer> list1 = new ArrayList<>();

						list1.add(nums[i]);
						list1.add(nums[j]);
						list1.add(nums[k]);

						set.add(list1);
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

		int nums[] = { -1, 0, 1, 2, -1, -4 };
		
		System.out.println(threeSumCal(nums));

		System.out.println(threeSum(nums));
		
		
	}

}
