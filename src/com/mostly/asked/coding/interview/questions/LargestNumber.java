package com.mostly.asked.coding.interview.questions;

public class LargestNumber {

	public String largestNumber(int[] nums) {

		StringBuilder sb = new StringBuilder();

		int k = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == 10 || nums[i] == 20 || nums[i] == 30 || nums[i] == 40 || nums[i] == 50 || nums[i] == 60
					|| nums[i] == 70 || nums[i] == 80 || nums[i] == 90 || nums[i] == 100) {

				int temp = nums[0];
				nums[k] = nums[i];
				nums[i] = temp;
				k++;

			}
		}

		for (int i = nums.length - 1; i >= 0; i--) {

			sb.append(nums[i]);
		}

		return sb.toString();
	}

	public static void main(String[] args) {

	}

}
