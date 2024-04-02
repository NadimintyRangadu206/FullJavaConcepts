package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 
 * Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1

 * @author nadim
 *
 */

public class FirstPositiveMissingNumber {
	
	 public static int firstMissingPositive(int[] nums) { // general approach
	        
	        Arrays.sort(nums);

	        int no=1;

	        for(int i=0;i<nums.length;i++){

	          if(nums[i]>0 && no==nums[i] ){
	              
	              no++;
	          }
	           
	        }
	        return no; 
	    }

	public static int missingNumber(int nums[]) { // My Approach
		
		Arrays.sort(nums);

		int no = 1;

		ArrayList<Integer> list = new ArrayList<>();

		for (int i : nums) {

			list.add(i);
		}

		int size = list.size();

		while (size != 0) {

			if (list.indexOf(no) != -1) {
				no++;
			} else {
				return no;
			}

			size--;
		}

		return no;
	}

	public static void main(String[] args) {

		int nums[] = { 1, 2, 0 };
		System.out.println(missingNumber(nums));
		System.out.println(firstMissingPositive(nums));

	}

}
