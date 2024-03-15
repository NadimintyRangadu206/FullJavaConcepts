package com.mostly.asked.coding.interview.questions;

public class IncreasingTripletSubsequence {

	public static boolean increasingTriplet(int[] nums) { // better approach

		boolean flag = false;

		int x = Integer.MAX_VALUE;

		int y = Integer.MAX_VALUE;

		for (int i = 0; i < nums.length; i++) {

			int z = nums[i];

			if (x >= z) {
				x = z;
			} else if (y >= z) {
				y = z;
			} else {
				return true;
			}
		}
		return flag;
	}

	public static boolean subSequence(int nums[]) { // this approach time limit exceeds

		boolean flag = false;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {

					if (nums[i] < nums[j]) {

						if (nums[j] < nums[k]) {

							flag = true;
						}

					}
				}
			}
		}

		if (flag == true) {
			return true;
		} else {
			return flag;
		}

	}

	public static void main(String[] args) {

		int nums[] = { 5, 4, 3, 2, 1 };

		System.out.println(increasingTriplet(nums));

		System.out.println(subSequence(nums));

	}

}
