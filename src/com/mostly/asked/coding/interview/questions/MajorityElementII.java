package com.mostly.asked.coding.interview.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
	
	
//	 * Given an integer array of size n, find all elements that appear more than  n/3  times.
//
// 
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: [3]
//Example 2:
//
//Input: nums = [1]
//Output: [1]
//Example 3:
//
//Input: nums = [1,2]
//Output: [1,2]
//	 * @param nums
//	 * @return
//	 */
	
	 public static  List<Integer> majorityElement(int[] nums) {
	        
	        Map<Integer, Integer> map = new HashMap<>();

			for (int i = 0; i < nums.length; i++) {
				int count = 1;
				for (int j = i + 1; j < nums.length; j++) {

					if (nums[i] == nums[j]) {

						count++;
						nums[j] = -1;
					}
				}

				if (nums[i] != -1) {
					map.put(nums[i], count);
				}
			}


	        ArrayList<Integer> list= new ArrayList<>();

	        int threshold=nums.length/3;

	        for(Map.Entry<Integer,Integer> entry:map.entrySet()){

	                int keys=entry.getKey();
	                int value=entry.getValue();  

	                if(value>threshold){

	                    list.add(keys);

	                }

	        }

	        return list;
	    }

	public static void main(String[] args) {

		int nums[]= {0,0,0};
		System.out.println(majorityElement(nums));
		

	}

}
