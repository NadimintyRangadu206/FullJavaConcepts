package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 * You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]
 

Constraints:

2 <= nums.length <= 104
1 <= nums[i] <= 104
 * @author nadim
 *
 */

public class SetMismatch {

	public static int[] findErrorNums(int[] nums) {

		

		ArrayList<Integer> list = new ArrayList<>();

		int repeatNo = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != -1) {
				for (int j = i + 1; j < nums.length; j++) {

					if (nums[i] == nums[j]) {
						repeatNo = nums[i];
						nums[j] = -1;

					}

				}

				list.add(nums[i]);
			}
		}

		Collections.sort(list);

		list.add(0);

		int a[] = new int[2];
		int k = 1;

		for (int i = 0; i < list.size(); i++) {

			if (k != list.get(i)) {

				a[0] = repeatNo;
				a[1] = k;
				break;
			}
			k++;

		}

		return a;

	}

	public static void main(String[] args) {
		
		int nums[]= {1,2,2,4};
		System.out.println(findErrorNums(nums));

	}

}
