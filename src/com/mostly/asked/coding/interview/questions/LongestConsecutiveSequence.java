package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestConsecutiveSequence {

	public static int longestConsecutive(int[] nums) {

		Arrays.sort(nums);

		int max = 0;

		int left = nums[0];

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == nums[i-0]) {

				left = nums[i];
				max++;
			}

			if (left == nums[i]) {

				left++;
				max++;

			} else {
				left = nums[i];
				list.add(max);
				max = 0;
				left++;
			}
		}

		Optional<Integer> optional = list.stream().max(Comparator.comparing(i -> i));

		return optional.get();
	}

	public static void main(String[] args) {

		int nums[] = { 100, 4, 200, 1, 3, 2 };

		longestConsecutive(nums);

	}

}
