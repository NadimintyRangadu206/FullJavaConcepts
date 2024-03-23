package com.mostly.asked.coding.interview.questions;

public class MinimumSizeSubarraySum {

	public  static int minSubArrayLen(int target, int[] nums) {

		int min = Integer.MAX_VALUE;

		int left = 0;
		int right = 0;

	

		int sum = 0;

		while (right < nums.length) {

			sum += nums[right];

			while (sum >= target) {

				min = Math.min(min, right - left + 1);

				sum -= nums[left];
				left++;

			}

			right++;
		}

		return (min != Integer.MAX_VALUE) ? min : 0;
	}

	public static void main(String[] args) {

		int nums[]= {2,3,1,2,4,3}; 
		int target=7;
		System.out.println(minSubArrayLen(target, nums));
		 
	}

}
