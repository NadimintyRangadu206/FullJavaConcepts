package com.mostly.asked.coding.interview.questions;

import java.util.HashSet;

public class ContainsDuplicate_1 {

	public static boolean containsDuplicate(int[] nums) {

		HashSet<Integer> set = new HashSet<>();

		for (int no : nums) {

			if (set.contains(no)) {

				set.add(no);
				return true;
			} else {
				set.add(no);
			}
		}

		return false;
	}

	public static void main(String[] args) {

		int nums[] = { 1, 2, 3, 1 };

		System.out.println(containsDuplicate(nums));

	}

}
