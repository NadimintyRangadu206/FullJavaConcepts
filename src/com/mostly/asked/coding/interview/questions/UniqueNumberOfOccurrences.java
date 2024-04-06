package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.

 

Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
Example 2:

Input: arr = [1,2]
Output: false
Example 3:

Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
Output: true
 

Constraints:

1 <= arr.length <= 1000
-1000 <= arr[i] <= 1000
 * @author nadim
 *
 */

public class UniqueNumberOfOccurrences {

	public static boolean uniqueOccurrences(int[] arr) {

		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (arr[i] != -99) {
				for (int j = i + 1; j < arr.length; j++) {

					if (arr[i] == arr[j]) {
						count++;
						arr[j] = -99;
					}
				}
				list.add(count);
			}
		}

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < list.size(); i++) {

			set.add(list.get(i));
		}

		if (list.size() == set.size()) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 1, 1, 3 };
		System.out.println(uniqueOccurrences(arr));

	}

}
