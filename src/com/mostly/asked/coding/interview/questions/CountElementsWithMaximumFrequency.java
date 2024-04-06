package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

/**
 * You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.

 

Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.
Example 2:

Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
 * @author nadim
 *
 */

public class CountElementsWithMaximumFrequency {

	public static int maxFrequencyElements(int[] nums) {

		ArrayList<Integer> map = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {
			int count = 1;
			if (nums[i] != -1) {
				for (int j = i + 1; j < nums.length; j++) {

					if (nums[i] == nums[j]) {
						count++;
						nums[j] = -1;

					}
				}
				map.add(count);

			}

		}

		Optional<Integer> optional = map.stream().max(Comparator.comparing(i -> i));

		int max = 0;

		for (int i = 0; i < map.size(); i++) {
			if (map.get(i) == optional.get()) {
				max += optional.get();
			}

		}

		return max;
	}

	public static void main(String[] args) {

		int nums[] = { 1, 2, 2, 3, 1, 4 };
		System.out.println(maxFrequencyElements(nums));
	}

}
