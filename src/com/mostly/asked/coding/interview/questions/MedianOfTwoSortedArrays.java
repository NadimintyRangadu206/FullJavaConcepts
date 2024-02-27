package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
 * the median of the two sorted arrays.
 * 
 * The overall run time complexity should be O(log (m+n)).
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums1 = [1,3], nums2 = [2] Output: 2.00000 Explanation: merged array =
 * [1,2,3] and median is 2. Example 2:
 * 
 * Input: nums1 = [1,2], nums2 = [3,4] Output: 2.50000 Explanation: merged array
 * = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 * 
 * 
 * Constraints:
 * 
 * nums1.length == m nums2.length == n 0 <= m <= 1000 0 <= n <= 1000 1 <= m + n
 * <= 2000 -106 <= nums1[i], nums2[i] <= 106
 * 
 * @author nadim
 *
 */

public class MedianOfTwoSortedArrays {
	
	
	 /*List<Integer> list= new ArrayList<>();

     for(int i=0;i<nums1.length;i++){
           list.add(nums1[i]);
     }

     for(int i=0;i<nums2.length;i++){
     list.add(nums2[i]);
     }

      Collections.sort(list);

		int no = list.size();

   int n=list.size()/2;		

		if (no % 2 == 0) {	
			return (list.get(n-1)+list.get(n))/2.00;
		}
		return list.get(n); 
		 
   }*/
	
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int size1 = nums1.length;

		int size2 = nums2.length;

		int arr[] = new int[size1 + size2];

		int index = 0;

		for (int i : nums1) {
			arr[index] = i;
			index++;
		}

		for (int i : nums2) {
			arr[index] = i;
			index++;
		}
		Arrays.sort(arr);
		int n = arr.length;
		double median = 0.00;

		if (n % 2 == 0) {
			median = (double) ((n / 2) + ((n / 2) + 1)) / 2.00;
		} else {
			median = (double) (n + 1) / 2.00;
		}
		return median;
	}

	public static void main(String[] args) {

		int num1[] = { 1, 2, 3 };
		int num2[] = { 4 };

		System.out.println(findMedianSortedArrays(num1, num2));

	}

}
