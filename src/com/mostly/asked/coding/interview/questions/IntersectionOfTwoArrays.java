package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


/**
 * Given two integer arrays nums1 and nums2, return an array of their 
intersection
. Each element in the result must be unique and you may return the result in any order.

 

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.
 

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000

 * @author nadim
 *
 */
public class IntersectionOfTwoArrays {

	public static  int[] intersection(int[] nums1, int[] nums2) {

		HashSet<Integer> set1 = new HashSet<>();

		for (int i : nums1) {
			set1.add(i);
		}

		HashSet<Integer> set2 = new HashSet<>();

		for (int i : nums2) {
			set2.add(i);
		}

		List<Integer> list = new ArrayList<>();

		for (int i : set1) {
			if (set2.contains(i)) {
				list.add(i);
			}
		}

		int arr[] = new int[list.size()];

		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}

		return arr;
	}

	public static void main(String[] args) {
	
		int nums1[]= {1,2,2,1};  int nums2[]= {2,2};
		
		System.out.println(intersection(nums1, nums2));
		

	}

}
