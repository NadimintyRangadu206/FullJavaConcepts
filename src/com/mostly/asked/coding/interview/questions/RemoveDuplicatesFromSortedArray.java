package com.mostly.asked.coding.interview.questions;

public class RemoveDuplicatesFromSortedArray {

	public static int removeDuplicates(int[] nums) {

		StringBuilder sb = new StringBuilder();

		int arr[] = new int[nums.length];
		int visited = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				if (nums[i] == nums[j]) {

					arr[i] = nums[i];
					arr[j] = visited;

				} else {
					if (arr[j] != visited) {
                        
						arr[i]=nums[i];
					}
				}

			}
//			sarr[i] = nums[i];

		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == nums[i]) {

				sb.append(arr[i]);

			}

		}

		return Integer.valueOf(sb.toString());
	}

	public static void main(String[] args) {

		int nums[] = { 1, 1, 2 };

		System.out.println(removeDuplicates(nums));
	}

}
