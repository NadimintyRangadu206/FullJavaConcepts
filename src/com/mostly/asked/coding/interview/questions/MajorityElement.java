package com.mostly.asked.coding.interview.questions;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class MajorityElement {

	public static int majorityElement(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int count = 1;
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {

					count++;
					nums[j] = 0;
				}
			}

			if (nums[i] != 0) {
				map.put(nums[i], count);
			}
		}

		Optional<Map.Entry<Integer, Integer>> i = map.entrySet().stream().max(Map.Entry.comparingByValue());
		Map.Entry<Integer, Integer> no = i.get();

		int majElement = no.getKey();

		return majElement;
	}

	public static void main(String[] args) {

		int nums[] = { 3, 2, 3 };

		System.out.println(majorityElement(nums));

	}

}
