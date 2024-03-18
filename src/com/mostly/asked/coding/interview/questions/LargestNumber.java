package com.mostly.asked.coding.interview.questions;

import java.util.Arrays;

/**
 * 
 * Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.

Since the result may be very large, so you need to return a string instead of an integer.

 

Example 1:

Input: nums = [10,2]
Output: "210"
Example 2:

Input: nums = [3,30,34,5,9]
Output: "9534330"
 
 * @author nadim
 *
 */

public class LargestNumber {

	public static String largestNumber(int[] nums) {

		StringBuilder sb = new StringBuilder();

		if (nums.length == 0) {
			return "";
		}

		String str[] = new String[nums.length];

		int index = 0;
		for (int i : nums) {

			str[index] = String.valueOf(i);

			index++;
		}

		Arrays.sort(str, (a, b) -> (b+a).compareTo(a+b)); // heart

		for (String s : str) {
			sb.append(s);
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		int nums[]= {3,30,34,5,9};
		
		System.out.println(largestNumber(nums));
	}

}
