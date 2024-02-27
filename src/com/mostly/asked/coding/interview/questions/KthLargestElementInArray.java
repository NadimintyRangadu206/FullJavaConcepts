package com.mostly.asked.coding.interview.questions;

import java.util.Arrays;

/**
 * Given an integer array nums and an integer k, return the kth largest element in the array.

Note that it is the kth largest element in the sorted order, not the kth distinct element.

Can you solve it without sorting?

 

Example 1:

Input: nums = [3,2,1,5,6,4], k = 2
Output: 5
Example 2:

Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
Output: 4
 

Constraints:

1 <= k <= nums.length <= 105
-104 <= nums[i] <= 104
 * @author nadim
 *
 */

public class KthLargestElementInArray {

	public static int findKthLargest(int[] nums, int k) {

		Arrays.sort(nums); // step1->sort

		int arr[] = new int[nums.length];

		for (int i = nums.length - 1, j = 0; i >= 0; i--, j++) { // step -> reverse

			arr[j] = nums[i];

		}

		int largest = arr[k - 1]; // step3

		return largest;
	}

	public static void main(String[] args) {

		int nums[] = { 3, 2, 1, 5, 6, 4 };

		int k = 2;

		System.out.println(findKthLargest(nums, k));

	}

}
