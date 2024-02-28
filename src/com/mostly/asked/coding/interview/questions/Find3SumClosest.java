package com.mostly.asked.coding.interview.questions;

import java.util.Arrays;

/**
 * 
 * Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.

 

Example 1:

Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
Example 2:

Input: nums = [0,0,0], target = 1
Output: 0
Explanation: The sum that is closest to the target is 0. (0 + 0 + 0 = 0).
 

Constraints:

3 <= nums.length <= 500
-1000 <= nums[i] <= 1000
-104 <= target <= 104
 * @author nadim
 *
 */

public class Find3SumClosest {
	
	public static int  threeSumCloset(int nums[], int target) {
	
		Arrays.sort(nums);
		
		int min=Integer.MAX_VALUE;
		
		int result=0;
		
		for(int i=0;i<nums.length;i++) {
			 
			int fixed=i;
			
			int startIndex=i+1;
			
			int endIndex=nums.length-1;
			
			while(startIndex<endIndex) {
				
				int sum=nums[fixed]+nums[startIndex]+nums[endIndex];
				
				if(sum==target) {
					
					return target;
				}
				
				if(sum>target) {
					 endIndex--;
				}
				else {
					startIndex++;
				}
				
				
				int diffTarget=Math.abs(sum-target);
				
				
				if(diffTarget<min) {
					
					min=diffTarget;
					result=sum;
					
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
	
		int arr[] = {-1,2,1,-4}; int target=1;
		
		System.out.println(
		threeSumCloset(arr, target));
		

	}

}
