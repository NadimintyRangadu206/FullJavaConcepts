package com.codingnijas.practice;

import java.util.StringJoiner;

public class BinarySearch {

	 public static int search(int []nums, int target) {
	        // Write your code here.
	               
		 
		 for(int i=0;i<nums.length;i++) {
			 
			 if(nums[i]==target) {
				 
				 nums[i]=2;
			 }else {
				 nums[i]=1;
			 }
		 }
		 
		 
		 
		 
		 
	            //    String str[]=new String[nums.length];
//	                int j=0;
	            StringBuilder sb= new StringBuilder();
//	                StringJoiner joiner=new StringJoiner("");
	               for(int i:nums){
	                   
	                //    str[j]=String.valueOf(i);
	                //    j++;
	                
	                sb.append(i);
//	                   j++;
	            	   
//	            	   joiner.add(String.valueOf(i));
	                   
	               }

	               String str=sb.toString();
	               
	               

	        return str.indexOf(String.valueOf(2));
	               
	               
	        
	    }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int nums[] = { 5, 9, 14, 15, 16, 22, 23, 24, 28, 29, 34 };
		
		BinarySearch binarySearch = new BinarySearch();
	System.out.println(BinarySearch.search(nums, 16));
	}

}
